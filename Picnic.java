public class Picnic extends Evento {







 public Picnic(char icono) {
   super(icono);
}

 public Picnic() {
}

 @Override
   public char getIcono(){

    return '#';
   } 

   @Override
   public boolean accederEvento(Mapa m){

Party.curarEquipo();
return false;

   }

   

    
}
