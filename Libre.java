public class Libre extends Evento {

    public Libre(char icono) {
        super(icono);
    }

    public Libre() {
        
    }

     @Override
   public char getIcono(){

    return '.';
   } 

   @Override
   public boolean accederEvento(Mapa m){


return true;

   }
    
}
