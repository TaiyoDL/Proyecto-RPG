import java.util.Random;

public class Arbusto extends Evento {
Random m = new Random();
    public Arbusto(char icono) {
        super(icono);
    }
    

    public Arbusto() {
    }

    @Override
    public char getIcono(){

        return 'm';
    }
@Override
    public boolean accederEvento(Mapa ma){
if(m.nextInt(1,11)==1) {

Pelea.batalla(ma.getEnemigos().get(m.nextInt(0,ma.getEnemigos().size())).clone(),m.nextInt(10,71),m.nextInt(60,351));

}

    return true;
}
    
}
