import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Partida {

    private static void cargarDatosPJs() throws SQLException{

        Connection conexion = Conexion.conectar();

        PreparedStatement ps = conexion.prepareStatement("Select * from personaje");

        ResultSet rs = ps.executeQuery();

        while(rs.next()){

            Rol r;
            if(rs.getString("rol").equals("PJ")){r=Rol.PJ;}
            else{r=Rol.BOSS;}
            Estado e;
            if(rs.getString("estado").equals("ALIVE")){e=Estado.ALIVE;}
            else{e=Estado.DEAD;}

            Personaje pj = new Personaje(rs.getString("id"),rs.getString("nombre"),rs.getInt("vida"),rs.getInt("vidaTotal"),rs.getInt("ataque"),rs.getInt("ataqueTotal"),rs.getInt("defensa"),rs.getInt("defensaTotal"),rs.getInt("velocidad"),rs.getInt("velocidadTotal"),rs.getBoolean("elegido"),e,r,rs.getInt("lvl"),rs.getInt("Mexp"),rs.getInt("xp"));

            PreparedStatement ps2 = conexion.prepareStatement("Select * from ataque where id_personaje=?");
            ps2.setString(1, pj.getId());
            ResultSet rs2 = ps2.executeQuery();

            while(rs2.next()){
    
    String nombre = rs2.getString("nombre");
    String descripcion = rs2.getString("descripcion");
    int usos = rs2.getInt("usos");
    int usostotal=rs2.getInt("usosTotales");
    String tipoAtaque = rs2.getString("tipo_ataque");

    
    switch(tipoAtaque.toLowerCase()) {
        case "pegar":
            int potencia = rs2.getInt("potencia");
            pj.aprenderAtaque(new Ataque_pegar(nombre, descripcion, usos,usostotal, potencia));
            break;

        case "curativo":
            int vidaCurada = rs2.getInt("vida_curada");
            pj.aprenderAtaque(new Ataque_Curativo(nombre, descripcion, usos,usostotal, vidaCurada));
            break;

        case "porcentual":
            double curacionPorcentaje = rs2.getDouble("curacion_porcentaje");
            pj.aprenderAtaque(new Ataque_CurativoPorcentual(nombre, descripcion, usos,usostotal, curacionPorcentaje));
            break;

        case "estado":
            double multiplicador = rs2.getDouble("multiplicador");
            String statStr = rs2.getString("stat_elegido"); 
            
            
            Stat statElegido = Stat.valueOf(statStr);
            
            pj.aprenderAtaque(new Ataque_Estado(nombre, descripcion, usos,usostotal, multiplicador, statElegido));
            break;
            
        default:
            System.out.println("⚠️ Tipo de ataque desconocido en la BD: " + tipoAtaque);
            break;
    }
}


            Datos.anadirPersonaje(pj);

            if(pj.getElegido()){Party.anadirPjForzado(pj);}



        }
    }

     private static void cargarDatosPJsBase() throws SQLException{

        Connection conexion = Conexion.conectarBD_Default();

        PreparedStatement ps = conexion.prepareStatement("Select * from personaje");

        ResultSet rs = ps.executeQuery();

        while(rs.next()){

            Rol r;
            if(rs.getString("rol").equals("PJ")){r=Rol.PJ;}
            else{r=Rol.BOSS;}
            Estado e;
            if(rs.getString("estado").equals("ALIVE")){e=Estado.ALIVE;}
            else{e=Estado.DEAD;}

            Personaje pj = new Personaje(rs.getString("id"),rs.getString("nombre"),rs.getInt("vida"),rs.getInt("vitaTotal"),rs.getInt("ataque"),rs.getInt("ataqueTotal"),rs.getInt("defensa"),rs.getInt("defensaTotal"),rs.getInt("velocidad"),rs.getInt("velocidadTotal"),rs.getBoolean("elegido"),e,r,rs.getInt("lvl"),rs.getInt("Mexp"),rs.getInt("xp"));

            PreparedStatement ps2 = conexion.prepareStatement("Select * from ataque where id_personaje=?");
            ps2.setString(1, pj.getId());
            ResultSet rs2 = ps2.executeQuery();

            while(rs2.next()){
    
    String nombre = rs2.getString("nombre");
    String descripcion = rs2.getString("descripcion");
    int usos = rs2.getInt("usos");
    int usostotal=rs2.getInt("usosTotales");
    String tipoAtaque = rs2.getString("tipo_ataque");

    
    switch(tipoAtaque.toLowerCase()) {
        case "pegar":
            int potencia = rs2.getInt("potencia");
            pj.aprenderAtaque(new Ataque_pegar(nombre, descripcion, usos,usostotal, potencia));
            break;

        case "curativo":
            int vidaCurada = rs2.getInt("vida_curada");
            pj.aprenderAtaque(new Ataque_Curativo(nombre, descripcion, usos,usostotal, vidaCurada));
            break;

        case "porcentual":
            double curacionPorcentaje = rs2.getDouble("curacion_porcentaje");
            pj.aprenderAtaque(new Ataque_CurativoPorcentual(nombre, descripcion, usos,usostotal, curacionPorcentaje));
            break;

        case "estado":
            double multiplicador = rs2.getDouble("multiplicador");
            String statStr = rs2.getString("stat_elegido"); 
            
            
            Stat statElegido = Stat.valueOf(statStr);
            
            pj.aprenderAtaque(new Ataque_Estado(nombre, descripcion, usos,usostotal, multiplicador, statElegido));
            break;
            
        default:
            System.out.println("⚠️ Tipo de ataque desconocido en la BD: " + tipoAtaque);
            break;
    }
}


            Datos.anadirPersonaje(pj);

            if(pj.getElegido()){Party.anadirPjForzado(pj);}



        }
    }

    private static void cargarDatosCombos() throws SQLException{

        Connection conexion=Conexion.conectar();

        PreparedStatement ps = conexion.prepareStatement("Select * from combinacion");

        ResultSet rs = ps.executeQuery();

        while(rs.next()){

        switch (rs.getString("tipo")) {
            case "danio":

            Personaje.insertarCombo(new CombinacionDanio(rs.getInt("danio"), rs.getString("nombre"), rs.getString("descripcion"), rs.getString("id1"), rs.getString("id2"), rs.getInt("usos"), rs.getInt("usostotales")));
                
                break;

                case "bendicion":

                Personaje.insertarCombo(new CombinacionBendicion(rs.getString("nombre"),rs.getString("descripcion"),rs.getString("id1"), rs.getString("id2"),rs.getInt("usos"), rs.getInt("usostotales"),rs.getInt("vida_curada"),rs.getDouble("multiplicador")));

                break;
        
            default:
                break;
        }

    }
    }

    private static void guardarDatosPjs() throws SQLException{

        Connection conexion = Conexion.conectar();

        PreparedStatement ps;
        PreparedStatement ps2;

         for (Personaje pe : Datos.personajes) {

    // 1. Preparamos el UPDATE de personaje con los nuevos campos de stats totales
    ps = conexion.prepareStatement("UPDATE personaje SET "
            + "vida = ?, "
            + "vidaTotal = ?, "
            + "ataque = ?, "
            + "ataqueTotal = ?, "
            + "defensa = ?, "
            + "defensaTotal = ?, "
            + "velocidad = ?, "
            + "velocidadTotal = ?, "
            + "estado = ?, "
            + "lvl = ?, "
            + "Mexp = ?, "
            + "xp = ?, "
            + "numAtaques = ?, "
            + "elegido = ? "
            + "WHERE id = ?");
            
    // Mapeo de parámetros para Personaje
    ps.setInt(1, pe.getVida());             // Vida actual
    ps.setInt(2, pe.getVidaTotal());        // Vida máxima/total
    ps.setInt(3, pe.getAtaque());           // Ataque actual
    ps.setInt(4, pe.getAtaqueTotal());      // Ataque total
    ps.setInt(5, pe.getDefensa());          // Defensa actual
    ps.setInt(6, pe.getDefensaTotal());     // Defensa total
    ps.setInt(7, pe.getVelocidad());        // Velocidad actual
    ps.setInt(8, pe.getVelocidadTotal());   // Velocidad total
    
    ps.setString(9, pe.getEstado().toString()); 
    ps.setInt(10, pe.getLvl());
    ps.setInt(11, pe.getMexp());
    ps.setInt(12, pe.getExp());
    ps.setInt(13, pe.getNumAtaques());
    ps.setBoolean(14, pe.getElegido()); 
    
    // El último '?' pertenece al WHERE id = ?
    ps.setString(15, pe.getId()); 
    
    // Ejecutamos la actualización del personaje
    ps.executeUpdate();

    // 2. Iteramos y actualizamos sus ataques
    for (Ataque a : pe.getAtaques()) {
        if (a != null) {
            // Añadido 'usosTotales = ?' por si cambian al subir de nivel o expandirse
            ps2 = conexion.prepareStatement("UPDATE ataque SET usos = ?, usosTotales = ? WHERE id_personaje = ? AND nombre = ?");
            
            ps2.setInt(1, a.getUsos());        // Usos actuales restantes
            ps2.setInt(2, a.getUsosTotales()); // Capacidad máxima de usos del ataque
            ps2.setString(3, pe.getId());      // Identificador del dueño del ataque
            ps2.setString(4, a.getNombre());  // Nombre de la habilidad
            
            ps2.executeUpdate();
        }
    }
}
        
        
        

    


    
    
    
    }

    private static void cargarObjetos() throws SQLException{

        Connection conexion = Conexion.conectar();

        PreparedStatement ps = conexion.prepareStatement("Select * from objeto");

        ResultSet rs = ps.executeQuery();

        while(rs.next()){

            if(rs.getInt("cantidad")<=0){}

            else{
                

                if(rs.getString("tipo").equals("curativo")){

                   Objeto  o = new Objeto_Curativo(rs.getString("id"),rs.getString("nombre"),rs.getString("descripcion"),rs.getInt("cantidad_curacion"));
                    o.setPrecio(rs.getInt("precio"));
                    o.setCantidad(rs.getInt("cantidad"));

                    Personaje.getMochila().add(o);

                }
                
            }

            if(rs.getString("tipo").equals("curativo")){

                   Objeto  u = new Objeto_Curativo(rs.getString("id"),rs.getString("nombre"),rs.getString("descripcion"),rs.getInt("cantidad_curacion"));
                    u.setPrecio(rs.getInt("precio"));
                    u.setCantidad(rs.getInt("cantidad"));

                    Datos.anadirObjeto(u);

                }

        }
        
    }

    private static void cargarObjetosBase() throws SQLException{

        Connection conexion = Conexion.conectarBD_Default();

        PreparedStatement ps = conexion.prepareStatement("Select * from objeto");

        ResultSet rs = ps.executeQuery();

        while(rs.next()){

            if(rs.getInt("cantidad")<=0){}

            else{
                

                if(rs.getString("tipo").equals("curativo")){

                   Objeto  o = new Objeto_Curativo(rs.getString("id"),rs.getString("nombre"),rs.getString("descripcion"),rs.getInt("cantidad_curacion"));
                    o.setPrecio(rs.getInt("precio"));
                    o.setCantidad(rs.getInt("cantidad"));

                    Personaje.getMochila().add(o);

                }
                
            }

            if(rs.getString("tipo").equals("curativo")){

                   Objeto  u = new Objeto_Curativo(rs.getString("id"),rs.getString("nombre"),rs.getString("descripcion"),rs.getInt("cantidad_curacion"));
                    u.setPrecio(rs.getInt("precio"));
                    u.setCantidad(rs.getInt("cantidad"));

                    Datos.anadirObjeto(u);

                }

        }
        
    }

    private static void guardarObjetos() throws SQLException{

        Connection conexion = Conexion.conectar();

        for(Objeto o : Datos.objetos){

        PreparedStatement ps = conexion.prepareStatement("Update objeto set cantidad=? where id=?");
        ps.setInt(1, o.getCantidad());
        ps.setString(2, o.getId());

        ps.executeUpdate();

        }

        }

        private static void guardarDatosCombos() throws SQLException {
    String sql = "UPDATE combinacion SET usos = ?, usosTotales = ? WHERE nombre = ?";

    try (Connection conexion = Conexion.conectar();
         PreparedStatement ps = conexion.prepareStatement(sql)) {

        
        for (Combinacion c : Personaje.getCombos()) {
            if (c != null) {
                
                ps.setInt(1, c.getUsos());
                ps.setInt(2, c.getUsosTotales());
                
                
                ps.setString(3, c.getNombre());

                
                ps.executeUpdate();
            }
        }
    } 
}

    

    public static void cargarPartida() throws SQLException{

        cargarDatosPJs();
        cargarObjetos();
        cargarDatosCombos();
    }

    public static void cargarNuevaPartida()throws SQLException{

        cargarDatosPJsBase();
        cargarObjetosBase();
    }

    public static void guardarPartida() throws SQLException{

        guardarDatosPjs();
        guardarObjetos();
        guardarDatosCombos();
    }
    
}
