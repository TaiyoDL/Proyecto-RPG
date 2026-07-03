/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mario
 */

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProbandoRandom {

        public static void main(String[] args) throws SQLException {
                Scanner n = new Scanner(System.in);

                Mapa m1 = new Mapa("Prueba");

                
                

                

              

                
                

                
                

                int[][] array = (new int[][] {
                                { 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 1, 3, 3, 3, 3, 3, 3, 3, 3, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 1, 3, 3, 3, 3, 3, 3, 3, 3, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 1, 3, 3, 3, 3, 3, 3, 3, 3, 1, 0 },
                                { 0, 1, 2, 2, 2, 2, 2, 1, 3, 3, 3, 3, 3, 3, 3, 3, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 1, 0 },
                                { 0, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 3, 3, 3, 3, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 2, 0, 2, 2, 2, 0, 2, 2, 2, 2, 2, 2, 2, 2, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 1, 0 },
                                { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 2, 2, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 2, 2, 0, 0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 0 },
                                { 0, 1, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 3, 3, 3, 3, 1, 0 },
                                { 0, 1, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 3, 3, 3, 3, 1, 0 },
                                { 0, 1, 3, 3, 3, 3, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 1, 0 },
                                { 0, 1, 3, 3, 3, 3, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 1, 0 },
                                { 0, 1, 1, 1, 1, 1, 1, 1, 3, 3, 1, 1, 1, 1, 1, 1, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 1, 3, 3, 1, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 1, 3, 3, 1, 0, 0, 0, 0, 0, 1, 0 },
                                { 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0 }

                });

                Convertidor.convertiddor(array, m1);
                Tienda shop = new Tienda("Provisional");
                Picnic cura = new Picnic();
                m1.anadirHueco(shop, 2, 15);
                m1.anadirHueco(cura, 2, 14);

                


                        boolean opcionValida = false;

                        boolean cargar=false;

        do {
            // --- DISEÑO DEL MENÚ ---
            System.out.println("\n=================================");
            System.out.println("         MENÚ PRINCIPAL          ");
            System.out.println("=================================");
            System.out.println("1. Continuar Partida");
            System.out.println("2. Nueva Partida (New Game)");
            System.out.println("=================================");
            System.out.print("Selecciona una opción (1-2): ");

            String opcion = n.nextLine().trim();

            // --- CONTROL DE OPCIONES ---
            switch (opcion) {
                case "1":
                    System.out.println("\n💾 Cargando personajes y ataques desde la base de datos...");
                    cargar=true;
                    Partida.cargarPartida();
                    opcionValida = true;
                    break;

                case "2":
                    System.out.println("\n⚔️ ¡Iniciando nueva aventura! Limpiando datos antiguos...");
                    Partida.cargarNuevaPartida();
                    opcionValida = true;
                    break;

                default:
                    System.out.println("\n❌ Opción no válida. Introduce '1' para continuar o '2' para empezar de nuevo.");
                    break;
            }

        } while (!opcionValida); // El bucle se repite hasta que elijan 1 o 2


        ArrayList<Personaje> opciones = new ArrayList<>();

                for(Personaje p : Datos.personajes){

                        if(p.getRol()==Rol.BOSS){m1.anadirEnemigo(p);}

                        else{opciones.add(p);}
                }

                for(Objeto o : Datos.objetos){

                        if(o instanceof Objeto){shop.anadirObjeto(o);}
                }

        System.out.println("\n¡Todo listo! Entrando al bucle principal del juego...");
        // Aquí arranca tu partida
    
                

                if(!cargar){

                

                boolean selector = true;
                while (selector) {

                        System.out.println("=== MENÚ DE GESTIÓN DE PERSONAJES ===");
                        System.out.println("1- Mostrar todos los personajes");
                        System.out.println("2- Ver Personajes elegidos");
                        System.out.println("3- Ver personajes no elegidos");
                        System.out.println("4- Añadir personaje");
                        System.out.println("5- Quitar personaje");
                        System.out.println("6- Ver combos");
                        System.out.println("7- Empezar juego");
                        System.out.print("Seleccione una opción: ");
                        int eleccion = n.nextInt();
                        n.nextLine();

                        switch (eleccion) {
                                case 1:

                                        for (Personaje o : opciones) {

                                                System.out.println(o + "\n");
                                                o.mostrarAtaques();

                                        }

                                        break;

                                case 2:

                                        for (Personaje o : Party.getTeam()) {
                                                if (o != null) {

                                                        System.out.println(o + "\n");
                                                        o.mostrarAtaques();
                                                }
                                        }

                                        break;
                                case 3:

                                        for (Personaje o : opciones) {
                                                if (!o.getElegido()) {

                                                        System.out.println(o + "\n");
                                                        o.mostrarAtaques();
                                                }
                                        }

                                        break;
                                case 4:
                                        boolean existe = false;
                                        System.out.println("Escriba la ID del personaje que quiera añadir al equipo!");
                                        String anadir = n.nextLine();

                                        for (Personaje o : opciones) {
                                                if (o.getId().equals(anadir)) {
                                                        if (Party.anadirPj(o)) {
                                                                System.out.println("Personaje añadido con éxito!");

                                                        } else if (Party.getTamanioActual() == 4) {
                                                                System.out.println(
                                                                                "La party está llena! Quita a un personaje antes de añadir más!");
                                                        }
                                                        existe = true;
                                                        break;

                                                }

                                        }
                                        if (!existe) {
                                                System.out.println("No existe personaje con ese ID");
                                        }

                                        break;
                                case 5:

                                        System.out.println(
                                                        "Introduzca el ID del personaje que quiere quitar del equipo");
                                        String eliminar = n.nextLine();
                                        if (Party.quitarPj(eliminar)) {

                                                System.out.println("Personaje quitado con éxito!");

                                        }

                                        break;

                                case 6:
                                        System.out.println("COMBINACIONES EXISTENTES\n==================\n");
                                        for (Combinacion c : Personaje.getCombos()) {

                                                System.out.println(c);
                                        }
                                        break;
                                case 7:
                                        selector = false;
                                        break;

                                default:
                                        System.out.println("Opción no válida");
                                        break;
                        }

                }
                System.out.println("Team actual:\n \n");
                int nose = 0;
                for (Personaje p : Party.getTeam()) {
                        nose++;

                        if (p == null) {
                                System.out.println(nose + ":");
                        }

                        else {
                                System.out.println(nose + ": " + p.getNombre());

                        }

                }
        }
                System.out.println("");
                boolean bucle = true;
                while (bucle) {
                        m1.imprimirMapa();
                        char c = n.next().charAt(0);
                        if (!m1.moverJugadors(c)){bucle=false;}
                }
                n.close();
        }

}
