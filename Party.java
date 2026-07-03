public class Party {

    public static  Personaje [] team= new Personaje[4];
    private static int tamanioActual;

   


    public static void curarEquipo(){

for(Personaje p : team) {
if(p!=null){
    p.setVida(p.getVidaTotal());
    for(Ataque a : p.getAtaques()){

        if(a!=null){

            a.setUsos(a.getUsosTotales());
        }
    }
}
}

for(Combinacion c : Personaje.getCombos()){

    // POR AÑADIR USOS RESTANTES A COMBINACIONES Y ATAQUES Y STATS TOTALES EN LA BD

    c.setUsos(c.getUsosTotales());
}
System.out.println("Equipo curado con éxito!");
    }

    
    
    
    public static boolean anadirPj(Personaje p) {

        if (p.getElegido()) {

            System.out.println("Pj ya seleccionado");
            return false;
        }

        for (int i = 0; i < 4; i++) {
            if (team[i] == null) {
                p.setElegido(true);

                team[i] = p;
                
                tamanioActual++;
                return true;
            }

        }
        return false;
    }

    public static boolean anadirPjForzado(Personaje p) {

        

        for (int i = 0; i < 4; i++) {
            if (team[i] == null) {
                p.setElegido(true);

                team[i] = p;
                
                tamanioActual++;
                return true;
            }

        }
        return false;
    }
    
    public static boolean quitarPj(String idBuscado) {
    
    if(tamanioActual==1) { System.out.println("Debe haber al menos 1 personaje en el equipo");return false;}
    
    for(int i=0;i<4;i++) {
    if(team[i]!=null) {
    if(team[i].getId().equals(idBuscado)) {
    team[i].setElegido(false);
    team[i]=null;
    tamanioActual--;
    return true;
    }
    }
    }
    System.out.println("Personaje no encontrado en el equipo");
    return false;
    }



    public static Personaje[] getTeam() {
        return team;
    }



    public static int getTamanioActual() {
        return tamanioActual;
    }

    
}
