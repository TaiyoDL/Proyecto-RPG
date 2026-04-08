public class Salto extends Evento {

    public Salto(char icono) {
        super(icono);
    }
    
    public Salto() {
        ;
    }
   @Override
   public char getIcono(){

    return '_';
   } 

   @Override
   public boolean accederEvento(Mapa m){

    return false;
   }
}
