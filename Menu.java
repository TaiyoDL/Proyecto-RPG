import java.sql.SQLException;
import java.util.Scanner;
public class Menu {

    public static boolean abrirMenu() throws SQLException{
Scanner n = new Scanner(System.in);
boolean bucle=true;

while(bucle) {
System.out.println("=== MENÚ DE INVENTARIO ===");
System.out.println("1. Ver personajes");
System.out.println("2. Ver Objetos");
System.out.println("3. Ver cartera");
System.out.println("4. Guardar Partida");
System.out.println("5. Salir del Juego");
System.out.println("==========================");
System.out.println("Pulse cualquier otra opción para salir del menu \n");
int opcion=n.nextInt();

switch (opcion) {

    case 1:
for(Personaje p: Party.team){


if (p!=null) {

    System.out.println(p+" xp: "+p.getExp()+"/"+p.getMexp());
}

}

    break;

    case 2:

    Personaje.mostrarMochila();

    break;

    case 3:

    System.out.println("╔═══════════════════════════════╗");
System.out.println("║  💰 CARTERA: " + Personaje.getDinero() + " $         ║");
System.out.println("╚═══════════════════════════════╝");

    break;

    case 4:
Partida.guardarPartida();
    break;

    case 5:
return false;
    


    default:
        bucle=false;
}


}
n.close();
return true;

    }
    
}
