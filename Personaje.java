import java.util.ArrayList;

public class Personaje implements Cloneable {
    private String id;
    private String nombre;
    private int vida;
    private int vidaTotal;
    private int ataque;
    private int ataqueTotal;
    private int defensa;
    private int defensaTotal;
    private int velocidad;
    private int velocidadTotal;
    private Ataque[] ataques;
    private int numAtaques;
    private boolean elegido;
    private static ArrayList<Objeto> mochila = new ArrayList<>();
    private Estado estado;
    private Rol rol;
    private int lvl;
    private int Mexp;
    private int exp;
     private static ArrayList<Combinacion> combos = new ArrayList<>();
     private static int dinero=0;

    public Personaje(String id, String nombre, int vida, int ataque, int defensa,int velocidad,Rol rol) {
        this.id = id;
        this.nombre = nombre;
        this.vida = vida;
        this.vidaTotal = vida;
        this.ataque = ataque;
        this.ataqueTotal = ataque;
        this.defensa = defensa;
        this.defensaTotal = defensa;
        this.velocidad = velocidad;
        this.velocidadTotal = velocidad;
        this.ataques = new Ataque[4];
        this.numAtaques=0;
        this.elegido=false;
        this.estado=Estado.ALIVE;
        this.rol=rol;
        this.lvl=1;
        this.Mexp=90;
        this.exp=0;
    }

    public Personaje(String id, String nombre, int vida, int ataque, int defensa, int velocidad, 
                 boolean elegido, Estado estado, Rol rol, int lvl, int Mexp, int xp) {
    this.id = id;
    this.nombre = nombre;
    
    // Asignación de estadísticas actuales y totales
    this.vida = vida;
    this.vidaTotal = vida;
    
    this.ataque = ataque;
    this.ataqueTotal = ataque;
    
    this.defensa = defensa;
    this.defensaTotal = defensa;
    
    this.velocidad = velocidad;
    this.velocidadTotal = velocidad;
    
    this.elegido = elegido;
    this.estado = estado;
    this.rol = rol;
    this.lvl = lvl;
    this.Mexp = Mexp;
    
    // Mapeado correcto de la experiencia
    this.exp = xp; 

    
    this.ataques = new Ataque[4];
    this.numAtaques = 0; 
}

    public boolean getElegido() {
        return elegido;
    }


    

    public int getMexp() {
        return Mexp;
    }

    public void setMexp(int mexp) {
        Mexp = mexp;
    }

    public int getLvl() {
        return lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public void setElegido(boolean elegido) {
        this.elegido = elegido;
    }

    
    

  

    public static int getDinero() {
        return dinero;
    }

    public static void setDinero(int dinero) {
        Personaje.dinero = dinero;
    }

    public Personaje() {
        this.id = "";
        this.nombre = "";
        this.vida = 0;
        this.vidaTotal = 0;
        this.ataque = 0;
        this.ataqueTotal = 0;
        this.defensa = 0;
        this.defensaTotal = 0;
        this.velocidad = 0;
        this.velocidadTotal = 0;
        this.estado=Estado.ALIVE;
        this.rol=Rol.PJ;

    }

    
    

    public Personaje(String id, String nombre, int vida, int vidaTotal, int ataque, int ataqueTotal, int defensa,
            int defensaTotal, int velocidad, int velocidadTotal,  boolean elegido,
            Estado estado, Rol rol, int lvl, int mexp, int exp) {
        this.id = id;
        this.nombre = nombre;
        this.vida = vida;
        this.vidaTotal = vidaTotal;
        this.ataque = ataque;
        this.ataqueTotal = ataqueTotal;
        this.defensa = defensa;
        this.defensaTotal = defensaTotal;
        this.velocidad = velocidad;
        this.velocidadTotal = velocidadTotal;
        this.ataques = new Ataque[4];
        
        this.elegido = elegido;
        this.estado = estado;
        this.rol = rol;
        this.lvl = lvl;
        Mexp = mexp;
        this.exp = exp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVidaTotal() {
        return vidaTotal;
    }

    public static ArrayList<Combinacion> getCombos() {
        return combos;
    }
    

    public void setVidaTotal(int vidaTotal) {
        this.vidaTotal = vidaTotal;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getAtaqueTotal() {
        return ataqueTotal;
    }

    public int getNumAtaques() {
        return numAtaques;
    }

    public void setNumAtaques(int numAtaques) {
        this.numAtaques = numAtaques;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public void alterarStats(double multiplicador){

 if (this.getAtaque()==this.getAtaqueTotal()/4) {


            System.out.println("El ataque no puede disminuir más");
        }

        else if (this.getAtaque()==this.getAtaqueTotal()*4) {


            System.out.println("El ataque no puede aumentar más");
        }

        else {

            this.setAtaque((int)(this.getAtaque()*multiplicador));

            if(multiplicador>1) {

                System.out.println("El ataque de" +this.getNombre()+" ha aumentando en "+multiplicador);
            }
            else{
                System.out.println("El ataque de" +this.getNombre()+" ha disminuido en "+multiplicador);


            }
        }

         if (this.getAtaque()<this.getAtaqueTotal()/4) {


            this.setAtaque(this.getAtaqueTotal()/4);
        }

        else if (this.getAtaque()>this.getAtaqueTotal()*4) {

this.setAtaque(this.getAtaqueTotal()*4);
        }




         if (this.getDefensa()==this.getDefensaTotal()/4) {


            System.out.println("La defensa no puede disminuir más");
        }

        else if (this.getDefensa()==this.getDefensaTotal()*4) {


            System.out.println("La defensa no puede aumentar más");
        }

        else {

            this.setDefensa((int)(this.getDefensa()*multiplicador));

             if(multiplicador>1) {

                System.out.println("La defensa de" +this.getNombre()+" ha aumentando en "+multiplicador);
            }
            else{
                System.out.println("La defensa de" +this.getNombre()+" ha disminuido en "+multiplicador);


            }
        }

         if (this.getDefensa()<this.getDefensaTotal()/4) {


            this.setDefensa(this.getDefensaTotal()/4);
        }

        else if (this.getDefensa()>this.getDefensaTotal()*4) {

this.setDefensa(this.getDefensaTotal()*4);
        }


 if (this.getVelocidad()==this.getVelocidadTotal()/4) {


            System.out.println("La velocidad no puede disminuir más");
        }

        else if (this.getVelocidad()==this.getVelocidadTotal()*4) {


            System.out.println("La velocidad no puede aumentar más");
        }

        else {

            this.setVelocidad((int)(this.getVelocidad()*multiplicador));
             if(multiplicador>1) {

                System.out.println("La velocidad de" +this.getNombre()+" ha aumentando en "+multiplicador);
            }
            else{
                System.out.println("La velocidad de" +this.getNombre()+" ha disminuido en "+multiplicador);


            }
        }

         if (this.getVelocidad()<this.getVelocidadTotal()/4) {


            this.setVelocidad(this.getVelocidadTotal()/4);
        }

        else if (this.getVelocidad()>this.getVelocidadTotal()*4) {

this.setVelocidad(this.getVelocidadTotal()*4);
        }



    }
    

    public void setAtaqueTotal(int ataqueTotal) {
        this.ataqueTotal = ataqueTotal;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getDefensaTotal() {
        return defensaTotal;
    }

    public void setDefensaTotal(int defensaTotal) {
        this.defensaTotal = defensaTotal;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadTotal() {
        return velocidadTotal;
    }

    public void setVelocidadTotal(int velocidadTotal) {
        this.velocidadTotal = velocidadTotal;
    }

    public Ataque[] getAtaques() {
        return ataques;
    }

    public void setAtaques(Ataque[] ataques) {
        this.ataques = ataques;
    }

    public static ArrayList<Objeto> getMochila() {
        return mochila;
    }

    public static void setMochila(ArrayList<Objeto> mochila) {
        Personaje.mochila = mochila;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static void recogerObjeto(Objeto objeto) {
        boolean registrado = false;
        for (Objeto o : mochila) {
            if (objeto.getId().equals(o.getId())) {

                registrado = true;
                o.setCantidad(o.getCantidad() + 1);
                if(o.getCantidad()>99) {o.setCantidad(99);}
                break;

            }

        }

        if (!registrado) {

            mochila.add(objeto);
            objeto.setCantidad(1);
        }

    }

   public static void eliminarDeMochila(Objeto item) {
    mochila.remove(item);
}
   
   public boolean aprenderAtaque(Ataque a) {
   
       for(int i=0;i<4;i++) {
           
           if(this.ataques[i]==null) {
       this.ataques[i]=a;
           this.numAtaques++;
       
       return true;
           }
       
       }
   return false;
   }
   
   public boolean olvidarAtaque(String nombre) {
       
       if( this.getNumAtaques()==1) {System.out.println("Debes tener al menos 1 ataque");return false;}
   
    for(int i=0;i<4;i++) {
       if(this.getAtaques()[i].getNombre().equals(nombre)) {
           this.ataques[i]=null;
           this.numAtaques--;
       return true;
       }
       
       }
   return false;
   }
   
   public void mostrarAtaques(){
   
   for(int i=0;i<this.numAtaques;i++) {
   
       System.out.println((i+1)+": "+this.ataques[i]);
   }
   
   }

    @Override
    public String toString() {
        return "Personaje{" + "id=" + id + ", nombre=" + nombre + ", vida=" + vida +  ", ataque=" + ataque +  ", defensa=" + defensa +  ", velocidad=" + velocidad +  ", elegido=" + elegido + '}';
    }
   
   public void verVida(){
       
          String ANSI_COLOR = "\u001B[31m";
 final String ANSI_RESET = "\u001B[0m";
       
       System.out.println("             |"+this.getNombre()+":");
         System.out.println("");
       System.out.println("");
       System.out.println("");
   
   int aux=this.getVida()*100/this.getVidaTotal();
   
   if(aux>75) {
   
   ANSI_COLOR="\u001B[34m";
 
   
   }
   
   else if (aux<=75 && aux>50) {
   
      ANSI_COLOR="\u001B[32m";

   }
   
   else if(aux<=50 && aux>25) {
   
         ANSI_COLOR="\u001B[33m"; 

   }
   
   else {
   
   ANSI_COLOR="\u001B[31m";
   }
   
   for(int i=0;i<100;i++) {
   
       System.out.print("*");
   }
       System.out.println("");
       
       for(int j=0;j<3;j++) {
           System.out.print("*");
       
   for(int i=2;i<100;i++) {
   if(i<=aux) {
   
          System.out.print(ANSI_COLOR+"*"+ANSI_RESET);

   
   }
   else {
          System.out.print(" ");

   }
   
   }
           System.out.println("*");
       }
    for(int i=0;i<100;i++) {
   
       System.out.print("*");
   }
    System.out.println("\n                                                  "+this.getVida()+"/"+this.getVidaTotal());
           System.out.println("");
       System.out.println("");
       System.out.println("");

   }

   public Rol getRol() {
    return rol;
   }

public static void mostrarMochila(){

for(Objeto o : mochila) {

System.out.println((mochila.indexOf(o)+1)+"-"+o+" restantes:"+o.getCantidad());

}

}

public void mostrarStats(){

System.out.println("ataque: "+this.ataque);
System.out.println("defensa: "+this.getDefensa());
System.out.println("velocidad: "+this.getVelocidad());

}


   public static void setCombos(ArrayList<Combinacion> combos) {
        Personaje.combos = combos;
    }
    
    
    
    
    
     public static void insertarCombo(Combinacion c){

combos.add(c);

    }
     
     public Combinacion buscarCombinacion(String id1, String id2) {
         
         for(Combinacion c : combos) {

    if((c.getId1().equals(id1) && c.getId2().equals(id2)) ||(c.getId1().equals(id2) && c.getId2().equals(id1)) ) {return c;}
    
         }
         return null;

}
     
     public  boolean hacerCombinacion(Personaje p1 , Personaje p2,Personaje objetivo) {
     if( this.buscarCombinacion(p1.getId(), p2.getId())!=null) {
     this.buscarCombinacion(p1.getId(), p2.getId()).hacerCombinacion(p1, p2,objetivo);
     return true;
     }
     
     else{System.out.println("Combinación no existente");}
     return false;
     }

    @Override
public Personaje clone() {
    try {
        // 1. Clona automáticamente los atributos primitivos, Strings y Enums
        Personaje clon = (Personaje) super.clone();
        
        // 2. Clonamos el array de ataques de forma limpia
        clon.ataques = new Ataque[4];
        for (int i = 0; i < this.ataques.length; i++) {
            if (this.ataques[i] != null) {
                clon.ataques[i] = this.ataques[i].clonarAtaque();
            }
        }
        
        return clon;
        
    } catch (CloneNotSupportedException e) {
        throw new AssertionError();
    }
}


}