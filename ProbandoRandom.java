/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mario
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class ProbandoRandom {
    
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        
        
        Mapa m1 = new Mapa("Prueba");
Personaje b02 = new Personaje("B-02", "Cronos Oxidado", 320, 55, 40, 75, Rol.BOSS);
b02.aprenderAtaque(new Ataque_pegar("Tic-Tac Pesado", "Golpe rítmico que agota", 12, 40));
b02.aprenderAtaque(new Ataque_Estado("Segundero Loco", "Aumenta mucho su velocidad", 4, 1.5, Stat.Velocidad));

Personaje b03 = new Personaje("B-03", "Montaña de Desidia", 450, 40, 65, 15, Rol.BOSS);
b03.aprenderAtaque(new Ataque_pegar("Sofoco Textil", "Atrapa al rival entre telas", 8, 45));
b03.aprenderAtaque(new Ataque_Estado("Arrugas Defensivas", "Se compacta para recibir menos daño", 5, 1.4, Stat.Defensa));

Personaje b04 = new Personaje("B-04", "Farola de Extravío", 280, 60, 35, 50, Rol.BOSS);
b04.aprenderAtaque(new Ataque_pegar("Luz Cegadora", "Daño lumínico directo", 10, 50));
b04.aprenderAtaque(new Ataque_Curativo("Recarga Eléctrica", "Absorbe estática del aire", 3, 30));

Personaje b05 = new Personaje("B-05", "Minino del Umbral", 250, 65, 30, 90, Rol.BOSS);
b05.aprenderAtaque(new Ataque_pegar("Zarpazo del Olvido", "Corte rápido y preciso", 15, 45));
b05.aprenderAtaque(new Ataque_Estado("Erizar Lomo", "Se prepara para el contraataque", 6, 1.3, Stat.Ataque));

Personaje b06 = new Personaje("B-06", "Retrato Borroso", 300, 50, 50, 45, Rol.BOSS);
b06.aprenderAtaque(new Ataque_pegar("Flash Melancólico", "Daña mediante recuerdos tristes", 10, 40));
b06.aprenderAtaque(new Ataque_CurativoPorcentual("Revelado", "Se restaura a su estado original", 2, 25.0));

Personaje b07 = new Personaje("B-07", "Eco de Fregadero", 380, 45, 55, 25, Rol.BOSS);
b07.aprenderAtaque(new Ataque_pegar("Gota a Gota", "Daño constante y molesto", 20, 35));
b07.aprenderAtaque(new Ataque_Estado("Humedad", "Ablanda la defensa del rival", 5, 0.8, Stat.Defensa));

Personaje b08 = new Personaje("B-08", "Error de Sistema", 310, 70, 40, 60, Rol.BOSS);
b08.aprenderAtaque(new Ataque_pegar("Glitch", "Ataque errático e impredecible", 10, 55));
b08.aprenderAtaque(new Ataque_Estado("Reinicio", "Intenta estabilizar sus valores", 3, 1.2, Stat.Ataque));

Personaje b09 = new Personaje("B-09", "Guardián de Paja", 400, 55, 45, 30, Rol.BOSS);
b09.aprenderAtaque(new Ataque_pegar("Abrazo de Heno", "Daño físico por presión", 12, 45));
b09.aprenderAtaque(new Ataque_Curativo("Relleno Nuevo", "Sustituye paja vieja por nueva", 5, 40));

Personaje b10 = new Personaje("B-10", "Llamada Perdida", 270, 58, 38, 80, Rol.BOSS);
b10.aprenderAtaque(new Ataque_pegar("Ruido Blanco", "Aturde con sonidos estáticos", 15, 40));
b10.aprenderAtaque(new Ataque_Estado("Tono de Espera", "Baja la velocidad del enemigo", 4, 0.7, Stat.Velocidad));

Personaje b11 = new Personaje("B-11", "Reflejo Distorsionado", 350, 60, 50, 55, Rol.BOSS);
b11.aprenderAtaque(new Ataque_pegar("Mimetismo", "Golpea con tus propias dudas", 10, 50));
b11.aprenderAtaque(new Ataque_CurativoPorcentual("Ondulación", "El agua se calma y se sana", 3, 30.0));


m1.anadirEnemigo(b02);
m1.anadirEnemigo(b03);
m1.anadirEnemigo(b04);
m1.anadirEnemigo(b05);
m1.anadirEnemigo(b06);
m1.anadirEnemigo(b07);
m1.anadirEnemigo(b08);
m1.anadirEnemigo(b09);
m1.anadirEnemigo(b10);
m1.anadirEnemigo(b11);


Personaje p1 = new Personaje("G01", "Alaric el Guerrero", 160, 70, 55, 35, Rol.PJ);
                Personaje p2 = new Personaje("M02", "Lyra la Maga", 75, 95, 15, 45, Rol.PJ);
                Personaje p3 = new Personaje("R03", "Kael de las Sombras", 90, 60, 30, 95, Rol.PJ);
                Personaje p4 = new Personaje("T04", "Brog el Tanque", 280, 40, 85, 10, Rol.PJ);
                Personaje p5 = new Personaje("A05", "Sira la Arquera", 100, 65, 35, 70, Rol.PJ);
                Personaje p6 = new Personaje("C06", "Elowen la Clérigo", 110, 45, 50, 40, Rol.PJ);

                p1.aprenderAtaque(new Ataque_pegar("Corte Vertical", "Un tajo potente con la espada", 15, 45));
                p1.aprenderAtaque(new Ataque_Estado("Grito de Guerra", "Aumenta el coraje y la fuerza", 5, 1.2,
                                Stat.Ataque));
                p1.aprenderAtaque(new Ataque_Curativo("Vendaje Rápido", "Cura heridas leves en combate", 3, 25));
                p1.aprenderAtaque(new Ataque_pegar("Golpe de Escudo", "Aturde al rival con el metal", 10, 30));

                p2.aprenderAtaque(new Ataque_pegar("Explosión Ígnea", "Gran bola de fuego arcano", 5, 95));
                p2.aprenderAtaque(new Ataque_CurativoPorcentual("Meditación",
                                "Recupera energía vital mediante el flujo", 2, 30.0));
                p2.aprenderAtaque(new Ataque_Estado("Mente Clara", "Potencia la concentración mágica", 4, 1.5,
                                Stat.Ataque));
                p2.aprenderAtaque(new Ataque_pegar("Daga de Hielo", "Proyectil gélido rápido", 12, 40));

                p3.aprenderAtaque(new Ataque_pegar("Puñalada", "Ataque rápido a puntos vitales", 20, 50));
                p3.aprenderAtaque(new Ataque_Estado("Pasos de Sombra", "Aumenta la evasión y rapidez", 6, 1.4,
                                Stat.Velocidad));
                p3.aprenderAtaque(new Ataque_Curativo("Vial de Sangre", "Poción robada que restaura vida", 2, 20));
                p3.aprenderAtaque(new Ataque_pegar("Lanzamiento de Daga", "Ataque a distancia media", 15, 35));

                p4.aprenderAtaque(new Ataque_pegar("Planchazo", "Cae con todo su peso sobre el rival", 8, 55));
                p4.aprenderAtaque(new Ataque_Estado("Piel de Hierro", "Endurece los músculos temporalmente", 5, 1.6,
                                Stat.Defensa));
                p4.aprenderAtaque(
                                new Ataque_CurativoPorcentual("Resuello", "Recupera gran cantidad de salud", 1, 50.0));
                p4.aprenderAtaque(new Ataque_Curativo("Inquebrantable", "Pequeña cura constante", 5, 15));

                p5.aprenderAtaque(new Ataque_pegar("Flecha Certera", "Disparo directo al corazón", 18, 60));
                p5.aprenderAtaque(
                                new Ataque_Estado("Ojo de Halcón", "Mejora la visión y puntería", 4, 1.3, Stat.Ataque));
                p5.aprenderAtaque(new Ataque_Curativo("Baya Silvestre", "Fruto del bosque sanador", 6, 15));
                p5.aprenderAtaque(new Ataque_pegar("Lluvia de Flechas", "Múltiples flechas de poco daño", 5, 40));

                p6.aprenderAtaque(new Ataque_Curativo("Luz Sagrada", "Sanación bendecida por los dioses", 10, 50));
                p6.aprenderAtaque(new Ataque_CurativoPorcentual("Milagro", "Restaura casi toda la salud", 2, 75.0));
                p6.aprenderAtaque(new Ataque_Estado("Bendición de Fe", "Protege al usuario con un aura", 8, 1.4,
                                Stat.Defensa));
                p6.aprenderAtaque(new Ataque_pegar("Martillo de Luz", "Golpe imbuido en energía divina", 10, 45));

                Personaje p7 = new Personaje("L07", "Niko el Portador", 120, 60, 50, 85, Rol.PJ);
                p7.aprenderAtaque(new Ataque_pegar("Rayo Solar", "Haz de luz concentrado de una bombilla mágica", 10,
                                55));
                p7.aprenderAtaque(new Ataque_Curativo("Calidez de Hogar", "Cura con una luz reconfortante", 5, 40));
                p7.aprenderAtaque(new Ataque_Estado("Paso Felino", "Aumenta drásticamente la velocidad", 4, 1.5,
                                Stat.Velocidad));
                p7.aprenderAtaque(new Ataque_pegar("Destello Cegador", "Un golpe rápido a los ojos del rival", 15, 30));

                Personaje p8 = new Personaje("S08", "Omor el Soñador", 95, 85, 30, 75, Rol.PJ);
                p8.aprenderAtaque(new Ataque_pegar("Corte Apático", "Tajo limpio y sin emociones", 15, 60));
                p8.aprenderAtaque(new Ataque_Estado("Volverse Maníaco", "Sube el ataque a costa de perder el control",
                                3, 1.6, Stat.Ataque));
                p8.aprenderAtaque(
                                new Ataque_CurativoPorcentual("Pícnic", "Toma un respiro para sanar heridas", 3, 35.0));
                p8.aprenderAtaque(new Ataque_pegar("Borrar", "Ataque oscuro, pesado y definitivo", 5, 75));

                Personaje p9 = new Personaje("C09", "Mark el Cronista", 130, 50, 65, 60, Rol.PJ);
                p9.aprenderAtaque(new Ataque_pegar("Déjà Vu", "El enemigo siente que ya recibió este golpe", 10, 45));
                p9.aprenderAtaque(new Ataque_Estado("Alterar Destino", "Sube la defensa reescribiendo la probabilidad",
                                4, 1.4, Stat.Defensa));
                p9.aprenderAtaque(new Ataque_Curativo("Rebobinar", "Retrocede el tiempo para curar daños recientes", 4,
                                60));
                p9.aprenderAtaque(new Ataque_pegar("Paradoja", "Golpe temporal inestable", 6, 65));

                Personaje boss = new Personaje("B-01", "Malakor el Devorador", 1200, 95, 80, 50, Rol.BOSS);

                boss.aprenderAtaque(new Ataque_pegar("Hachazo Abisal", "Daño físico pesado", 8, 65));
                boss.aprenderAtaque(new Ataque_Estado("Rugido de Pánico", "Sube defensa", 4, 1.25, Stat.Defensa));
                boss.aprenderAtaque(new Ataque_CurativoPorcentual("Absorber Esencia", "Cura moderada", 4, 12.0));

                boss.aprenderAtaque(
                                new Ataque_pegar("Fauces del Vacío", "Mordisco letal que desgarra la realidad", 5, 85));

                Party equipo = new Party();

                Personaje.insertarCombo(new CombinacionDanio(60,
                                "Filo Destellante",
                                "Lyra imbuye de luz la espada de Alaric para un tajo imparable.",
                                p1.getId(),
                                p2.getId(),
                                2));

                Personaje.insertarCombo(new CombinacionDanio(85,
                                "Amanecer Letal",
                                "Niko y Lyra combinan el poder del sol y el fuego arcano en una explosión.",
                                p7.getId(),
                                p2.getId(),
                                1));

                Personaje.insertarCombo(new CombinacionBendicion(
                                "Sueño Lúcido",
                                "Elowen protege la mente de Omor, otorgando gran curación y un aura de fuerza.",
                                p8.getId(),
                                p6.getId(),
                                2,
                                80,
                                1.3));

                ArrayList<Personaje> opciones = new ArrayList<>();
                opciones.add(p1);
                opciones.add(p2);
                opciones.add(p3);
                opciones.add(p4);
                opciones.add(p5);
                opciones.add(p6);
                opciones.add(p7);
                opciones.add(p8);
                opciones.add(p9);

                equipo.anadirPj(p1);
                Objeto_Curativo pocion = new Objeto_Curativo("it_01", "Poción", "Cura un poco", 50);

                Objeto_Curativo tortitas = new Objeto_Curativo("it_02", "Tortitas con Sirope",
                                "Un plato calentito que restaura mucha vida", 100);
                Objeto_Curativo zumo = new Objeto_Curativo("it_03", "Zumo de Manzana",
                                "Refresca y cura un poco la salud", 40);
                Objeto_Curativo pendrive = new Objeto_Curativo("it_04", "Memoria USB Rota",
                                "Restaurar sus archivos recupera mucha energía", 150);

                Objeto_Curativo elixir = new Objeto_Curativo("it_05", "Elixir Mayor", "Cura casi todas las heridas",
                                200);

                                pocion.setPrecio(20);
                                tortitas.setPrecio(50);
                                zumo.setPrecio(15);
                                pendrive.setPrecio(80);
                                elixir.setPrecio(110);





int[][] array=(new int[][] {
    {0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1,0},
    {0,1,1,1,1,1,1,1,0,0,1,1,1,1,1,1,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
    {0,1,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0},
    {0,1,2,2,2,2,2,1,2,2,2,2,0,0,0,0,1,0},
    {0,1,0,0,0,0,0,1,3,3,3,3,3,3,3,3,1,0},
    {0,1,0,0,0,0,0,1,3,3,3,3,3,3,3,3,1,0},
    {0,1,0,0,0,0,0,1,3,3,3,3,3,3,3,3,1,0},
    {0,1,2,2,2,2,2,1,3,3,3,3,3,3,3,3,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,3,3,3,3,1,0},
    {0,1,1,1,2,2,2,2,1,1,1,1,3,3,3,3,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,3,3,3,3,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,3,3,3,3,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
    {0,1,2,0,2,2,2,0,2,2,2,2,2,2,2,2,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
    {0,1,0,0,0,0,0,0,0,0,3,3,3,3,0,0,1,0},
    {0,1,1,1,1,1,1,1,1,1,3,3,3,3,2,2,1,0},
    {0,1,0,0,0,0,0,0,0,0,3,3,3,3,0,0,1,0},
    {0,1,0,0,0,0,0,0,0,0,3,3,3,3,0,0,1,0},
    {0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0},
    {0,1,2,2,0,0,0,1,2,2,2,2,2,2,2,2,1,0},
    {0,1,0,0,3,3,3,3,0,0,0,0,3,3,3,3,1,0},
    {0,1,0,0,3,3,3,3,0,0,0,0,3,3,3,3,1,0},
    {0,1,3,3,3,3,0,0,0,0,3,3,3,3,0,0,1,0},
    {0,1,3,3,3,3,0,0,0,0,3,3,3,3,0,0,1,0},
    {0,1,1,1,1,1,1,1,3,3,1,1,1,1,1,1,1,0},
    {0,1,0,0,0,0,0,1,3,3,1,0,0,0,0,0,1,0},
    {0,1,0,0,0,0,0,1,3,3,1,0,0,0,0,0,1,0},
    {0,1,0,0,0,0,0,1,1,1,1,0,0,0,0,0,1,0}
    
  
});

Convertidor.convertiddor(array, m1);
Tienda shop = new Tienda("Provisional");

m1.anadirHueco(shop,2,15);

shop.anadirObjeto(zumo);
shop.anadirObjeto(pocion);
shop.anadirObjeto(tortitas);
shop.anadirObjeto(pendrive);
shop.anadirObjeto(elixir);




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
                                                        if (equipo.anadirPj(o)) {
                                                                System.out.println("Personaje añadido con éxito!");

                                                        } else if (equipo.getTamanioActual() == 4) {
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
                                        if (equipo.quitarPj(eliminar)) {

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
                System.out.println("");
                boolean bucle=true;
        while(bucle){
        m1.imprimirMapa();
        char c = n.next().charAt(0);
        m1.moverJugadors(c);
        }
    }
    

    
}

