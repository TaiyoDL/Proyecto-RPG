public class Ataque_Estado extends Ataque {

    private double multiplicador;
    private Stat statElegido;
    
     
public Ataque_Estado(String nombre, String descripcion, int usos, double multiplicador, Stat statElegido) {
        super(nombre, descripcion, usos);
        this.multiplicador = multiplicador;
        this.statElegido = statElegido;
    }

        
public Ataque_Estado() {
        super();
        this.multiplicador = 1;
        this.statElegido = Stat.Ataque;
    }


public Ataque_Estado(double multiplicador, Stat statElegido) {
        this.multiplicador = multiplicador;
        this.statElegido = statElegido;
    }


@Override
public boolean usarAtaque(Personaje usuario,Personaje objetivo){
     if(objetivo.getEstado()==Estado.DEAD) {

System.out.println("El personaje está muerto, no se puede actuar con él");
return false;
    }
    else {

    if (this.getUsos() == 0) {
            System.out.println("No te quedan PPS");
return false;
        } else {

switch (statElegido) {
    case Stat.Ataque:
        if (objetivo.getAtaque()==objetivo.getAtaqueTotal()/4) {


            System.out.println("El ataque no puede disminuir más");
        }

        else if (objetivo.getAtaque()==objetivo.getAtaqueTotal()*4) {


            System.out.println("El ataque no puede aumentar más");
        }

        else {

            objetivo.setAtaque((int)(objetivo.getAtaque()*multiplicador));

            if(multiplicador>1) {

                System.out.println("El ataque de" +objetivo.getNombre()+" ha aumentando en "+multiplicador);
            }
            else{
                System.out.println("El ataque de" +objetivo.getNombre()+" ha disminuido en "+multiplicador);


            }
        }

         if (objetivo.getAtaque()<objetivo.getAtaqueTotal()/4) {


            objetivo.setAtaque(objetivo.getAtaqueTotal()/4);
        }

        else if (objetivo.getAtaque()>objetivo.getAtaqueTotal()*4) {

objetivo.setAtaque(objetivo.getAtaqueTotal()*4);
        }
        break;

        case Stat.Defensa:

         if (objetivo.getDefensa()==objetivo.getDefensaTotal()/4) {


            System.out.println("La defensa no puede disminuir más");
        }

        else if (objetivo.getDefensa()==objetivo.getDefensaTotal()*4) {


            System.out.println("La defensa no puede aumentar más");
        }

        else {

            objetivo.setDefensa((int)(objetivo.getDefensa()*multiplicador));

             if(multiplicador>1) {

                System.out.println("La defensa de" +objetivo.getNombre()+" ha aumentando en "+multiplicador);
            }
            else{
                System.out.println("La defensa de" +objetivo.getNombre()+" ha disminuido en "+multiplicador);


            }
        }

         if (objetivo.getDefensa()<objetivo.getDefensaTotal()/4) {


            objetivo.setDefensa(objetivo.getDefensaTotal()/4);
        }

        else if (objetivo.getDefensa()>objetivo.getDefensaTotal()*4) {

objetivo.setDefensa(objetivo.getDefensaTotal()*4);
        }
        
        break;

        case Stat.Velocidad:

  if (objetivo.getVelocidad()==objetivo.getVelocidadTotal()/4) {


            System.out.println("La velocidad no puede disminuir más");
        }

        else if (objetivo.getVelocidad()==objetivo.getVelocidadTotal()*4) {


            System.out.println("La velocidad no puede aumentar más");
        }

        else {

            objetivo.setVelocidad((int)(objetivo.getVelocidad()*multiplicador));
             if(multiplicador>1) {

                System.out.println("La velocidad de" +objetivo.getNombre()+" ha aumentando en "+multiplicador);
            }
            else{
                System.out.println("La velocidad de" +objetivo.getNombre()+" ha disminuido en "+multiplicador);


            }
        }

         if (objetivo.getVelocidad()<objetivo.getVelocidadTotal()/4) {


            objetivo.setVelocidad(objetivo.getVelocidadTotal()/4);
        }

        else if (objetivo.getVelocidad()>objetivo.getVelocidadTotal()*4) {

objetivo.setVelocidad(objetivo.getVelocidadTotal()*4);
        }

        
        break;

    default:
        break;
}
   this.setUsos(this.getUsos()-1);
return true;
    }
}

}
    
    
}
