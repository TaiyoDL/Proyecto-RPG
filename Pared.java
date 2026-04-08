public class Pared extends Evento {

    public Pared(char icono) {
        super(icono);
    }
    public Pared() {
        
    }

   @Override
   public char getIcono(){

    return '*';
   } 

   @Override
   public boolean accederEvento(Mapa m){

System.out.println("Hay un obstáculo en el camino");
return false;

   }
}
