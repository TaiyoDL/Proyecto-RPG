import java.util.ArrayList;
import java.util.Scanner;

public class Tienda extends Evento {
    private ArrayList<Objeto> items;
    private String nombre;
   
    public Tienda(String nombre) {
        this.items = new ArrayList<Objeto>();
        this.nombre = nombre;
    }

@Override
public char getIcono(){

return '$';
}

@Override
public boolean accederEvento(Mapa m){


boolean tienda=true;
Scanner n = new Scanner(System.in);
System.out.println("===============================");
System.out.println("   BIENVENIDO A: " + this.nombre);
System.out.println("===============================");
while (tienda) {
System.out.println("1. [Comprar] - Mirar los objetos");
System.out.println("2. [Vender]  - Ofrecer algo");
System.out.println("3. [Cartera]   - Ver sueldo actual");
System.out.println("4. [Salir]   - Despedirse");
System.out.println("-------------------------------");
System.out.print("¿Qué deseas hacer?: ");

int opcion=n.nextInt();
n.nextLine();

switch (opcion) {

    case 1:

    for(Objeto o : this.items) {

System.out.println("["+o.getId()+"] "+o+"("+o.getPrecio()+"$)\n");


    }

    System.out.println("Introduzca la id del objeto que quiere comprar");
boolean existe=false;
    String buscar=n.nextLine();
Objeto aux=null;
    for(Objeto o : this.items) {

if(o.getId().equals(buscar)) {

 aux = o;
existe=true;
   break; 
}
    }

if(existe) {
System.out.println("Introduzca la cantidad que quiere comprar (max 99)");
    int cantidad=n.nextInt();
    n.nextLine();
    if(cantidad<0) {cantidad=0;}
    if (cantidad>99){cantidad=99;}

    if(Personaje.getDinero()<aux.getPrecio()*cantidad) {

        System.out.println("Oro insuficiente!");
    }
    else{

        Personaje.setDinero(Personaje.getDinero()-aux.getPrecio()*cantidad);
        for(int i=0;i<cantidad;i++){

            Personaje.recogerObjeto(aux);
        }
        System.out.println("Has comprado "+cantidad+" unidades de "+aux.getNombre());
    }
}
else{System.out.println("No existe ese objeto!");}

    

    break;

    case 2:

    for(Objeto o : Personaje.getMochila()) {

System.out.println("["+o.getId()+"] "+o+"("+o.getPrecio()+"$)\n");

    }

    System.out.println("Introduzca la id del objeto que quiere vender");
 existe=false;
     buscar=n.nextLine();
 aux=null;
    for(Objeto o : Personaje.getMochila()) {

if(o.getId().equals(buscar)) {

 aux = o;
existe=true;
   break; 
}
    }

if(existe) {
System.out.println("Introduzca la cantidad que quiere vender (max"+aux.getCantidad()+ ")");
    int cantidad=n.nextInt();
    n.nextLine();
    if(cantidad<0) {cantidad=0;}
    if (cantidad>aux.getCantidad()){cantidad = aux.getCantidad();}

    if(aux.getCantidad()<cantidad) {

        System.out.println("Unidades insuficiente!");
    }
    else{

       
        if(aux.getCantidad()==cantidad) {

            Personaje.eliminarDeMochila(aux);
        }
        else{aux.setCantidad(aux.getCantidad()-cantidad);}
        System.out.println("Has vendido "+cantidad+" unidades de "+aux.getNombre());
        System.out.println("Oro ganado: "+cantidad*aux.getPrecio());
        Personaje.setDinero(Personaje.getDinero()+cantidad*aux.getPrecio());
    }
}
else{System.out.println("No existe ese objeto!");}

    


    break;


    case 3:
System.out.println("\n Saldo actual: "+Personaje.getDinero()+"$ \n");
    break;
    case 4:

    System.out.println("Que tenga un buen día!");
    tienda=false;

    break;

    default:
        System.out.println("Opción no válida");
}


}


    return false;
}
    public void anadirObjeto(Objeto o) {

        this.items.add(o);
    }
    
}
