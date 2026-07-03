import java.sql.SQLException;
import java.util.ArrayList;

public class Mapa {

    private Evento[][] pixel;
    private String nombre;
    private ArrayList<Personaje> enemigos = new ArrayList<>();

    public Mapa(String nombre) {
        this.nombre = nombre;
        this.pixel = new Evento[36][18];

for(int i=0;i<pixel.length;i++) {

for(int j=0;j<pixel[i].length;j++) {

this.pixel[i][j]=new Libre();

}

}

    }

    public void imprimirMapa() {

        for (int i = 0; i < pixel.length; i++) {
            System.out.print("                                ");
            for (int j = 0; j < pixel[i].length; j++) {
if(i==Player.getX() && j==Player.getY()) {
System.out.print( "J ");

}
else{
                System.out.print(pixel[i][j].getIcono() + " ");
}

            }
            System.out.println("");

        }

    }

    public Evento[][] getPixel() {
        return pixel;
    }

    public void setPixel(Evento[][] pixel) {
        this.pixel = pixel;
    }

    public void anadirHueco(Evento aux,int i, int j) {

this.pixel[i][j]=aux;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

public boolean moverJugadors(char direccion) throws SQLException{

int aux=1;
switch (direccion) {
    
    case 'w','W':
         if( this.getPixel()[Player.getX()-aux][Player.getY()].accederEvento(this)) {

            
            Player.setX(Player.getX()-aux);
            
            return true;}
        break;

         case 's','S':

         if( this.getPixel()[Player.getX()+aux][Player.getY()].accederEvento(this) || this.getPixel()[Player.getX()+aux][Player.getY()].getClass()==Salto.class) {
            if(this.getPixel()[Player.getX()+aux][Player.getY()].getClass()==Salto.class) {aux++;}
            Player.setX(Player.getX()+aux);
            return true;}
        
        break;

         case 'd','D':

          if(this.getPixel()[Player.getX()][Player.getY()+aux].accederEvento(this)) {
            Player.setY(Player.getY()+aux);
            return true;}
        
        break;

         case 'a','A':
                      if(  this.getPixel()[Player.getX()][Player.getY()-aux].accederEvento(this)) {
                        Player.setY(Player.getY()-aux);
                        return true;}

        
        break;

        case 'x','X': 
if(!Menu.abrirMenu()){

    return false;
}
        break;

    default:
        
        break;
}
return true;
}


public void anadirEnemigo(Personaje enemigo) {

    this.enemigos.add(enemigo);
}
public void quitarEnemigo(Personaje enemigo) {

this.enemigos.remove(enemigo);

}

public ArrayList<Personaje> getEnemigos() {
    return enemigos;
}
}
