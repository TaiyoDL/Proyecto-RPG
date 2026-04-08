
import java.util.Scanner;
import java.util.Random;

public class Pelea {

    public static void mostrarPersonajes(Personaje[] peleadores) {

        for (int i = 0; i < peleadores.length; i++) {
            if (peleadores[i] != null) {
                System.out.println((i + 1) + ": " + peleadores[i].getNombre() + "\n");
            }
        }
    }

    public static boolean hayAlguienVivo(Personaje[] peleadores) {
    for (int i=0;i<peleadores.length;i++) {
        if (peleadores[i] != null && peleadores[i].getEstado() != Estado.DEAD && peleadores[i].getRol()==Rol.PJ) {
            return true; 
        }
    }
    return false;
}

    public static boolean batalla( Personaje boss, int dinero, int experiencia) {

        System.out.println("Te enfrentas a "+boss.getNombre()+"!\n\n");

        Personaje[] peleadores = new Personaje[5];

        Scanner n = new Scanner(System.in);
        Random m = new Random();

        for (int i = 0; i < 4; i++) {
            peleadores[i] = Party.getTeam()[i];
        }

        peleadores[4] = boss;

        boolean pelea = true;
        while (pelea) {

            for (int i = 0; i < peleadores.length * peleadores.length; i++) {

                for (int j = 0; j < peleadores.length - 1; j++) {
                    if (peleadores[j] != null && peleadores[j + 1] != null) {
                        if (peleadores[j].getVelocidad() < peleadores[j + 1].getVelocidad()) {

                            Personaje aux;
                            aux = peleadores[j + 1];
                            peleadores[j + 1] = peleadores[j];
                            peleadores[j] = aux;

                        }
                    }

                }

            }

            for (Personaje p : peleadores) {

                if (p == null || p.getEstado() == Estado.DEAD) {
                }

                else if (p.getRol() == Rol.PJ) {

                    boolean turno = true;

                    while (turno) {
                        System.out.println("Turno de: " + p.getNombre());
                        System.out.println("==================================================");
                        System.out.println("                MENÚ DE ACCIONES                  ");
                        System.out.println("==================================================");
                        System.out.println("1.   Atacar");
                        System.out.println("2.   Usar objeto");
                        System.out.println("3.   Ver vida");
                        System.out.println("4.   Ver stats");
                        System.out.println("5.   Usar combinación");
                        System.out.println("==================================================");

                        int opcion = n.nextInt();
                        n.nextLine();

                        switch (opcion) {
                            case 1:

                                p.mostrarAtaques();
                                System.out.println("---------- \n Que ataque quieres usar? (Escribe el numero)");
                                int ataque = n.nextInt();
                                n.nextLine();

                                if (ataque > 4 || ataque < 1) {

                                    System.out.println("Elige un ataque válido");
                                }

                                else {
                                    ataque--;

                                    System.out.println(
                                            "Elige un objetivo (1-5),si eliges un numero fuera de rango se elegirá al personaje numero 5");
                                    mostrarPersonajes(peleadores);
                                    int objetivo = n.nextInt();
                                    n.nextLine();
                                    if (objetivo > 5 || objetivo < 1) {
                                        objetivo = 5;
                                    }

                                    objetivo--;

                                    if (p.getAtaques()[ataque].usarAtaque(p, peleadores[objetivo])) {

                                        turno = false;
                                    }

                                }

                                break;
                            case 2:
                                Personaje.mostrarMochila();
                                System.out.println("---------- \n Que objeto quieres usar? (Escribe el numero)");
                                int objeto = n.nextInt();
                                n.nextLine();
                                if (objeto > Personaje.getMochila().size() || objeto < 1) {
                                    System.out.println("Elige un objeto válido");
                                }

                                else {
                                    objeto--;

                                    System.out.println(
                                            "Elige un objetivo (1-5),si eliges un numero fuera de rango se elegirá al personaje numero 5");
                                    mostrarPersonajes(peleadores);
                                    int objetivo = n.nextInt();
                                    n.nextLine();
                                    if (objetivo > 5 || objetivo < 1) {
                                        objetivo = 5;
                                    }

                                    objetivo--;

                                    if (Personaje.getMochila().get(objeto).usarObjeto(p, peleadores[objetivo])) {

                                        turno = false;
                                    }

                                }

                                break;
                            case 3:

                                System.out.println(
                                        "Elige un objetivo (1-5),si eliges un numero fuera de rango se elegirá al personaje numero 5");
                                mostrarPersonajes(peleadores);
                                int objetivo = n.nextInt();
                                n.nextLine();
                                if (objetivo > 5 || objetivo < 1) {
                                    objetivo = 5;
                                }

                                objetivo--;
                                peleadores[objetivo].verVida();

                                break;
                            case 4:

                                System.out.println(
                                        "Elige un objetivo (1-5),si eliges un numero fuera de rango se elegirá al personaje numero 5");
                                mostrarPersonajes(peleadores);
                                objetivo = n.nextInt();
                                n.nextLine();
                                if (objetivo > 5 || objetivo < 1) {
                                    objetivo = 5;
                                }

                                objetivo--;
                                peleadores[objetivo].mostrarStats();

                                break;
                            case 5:

                            System.out.println("Con quien quieres que "+p.getNombre()+" realice un ataque combinado?");
                            for(int i=0;i<peleadores.length-1;i++) {
if(peleadores[i]!=null) {
System.out.println((i+1)+"-"+peleadores[i].getNombre()+"\n");
}
                            }
                            int comb=n.nextInt();
                            n.nextLine();
                            comb--;
                            if(comb<0 || comb>3 || peleadores[comb]==null) {System.out.println("Opción no válida");}

                            else {


                                System.out.println("Hacia quien quieres usar la combinación?");
                                for(int i=0;i<peleadores.length;i++) {
if(peleadores[i]!=null) {
System.out.println((i+1)+"-"+peleadores[i].getNombre()+"\n");
}

                                }

                                int ob=n.nextInt();
                                n.nextLine();
                                ob--;
                                 if(ob<0 || ob>4 || peleadores[ob]==null) {System.out.println("Opción no válida");}

                            else {
                                if(p.getEstado()==Estado.ALIVE && peleadores[comb].getEstado()==Estado.ALIVE){

                                if (p.hacerCombinacion(p, peleadores[comb], peleadores[ob])) {

                                    turno=false;
                                }
                            }
                            }
                            }



                                break;
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                    }
                     if (boss.getEstado()==Estado.DEAD) {
                System.out.println("Felicidades! Has ganado el juego!");
                System.out.println("Has obtenido "+dinero+"$ de oro y "+experiencia+" de xp que será repartido entre todo el equipo!");
                Personaje.setDinero(Personaje.getDinero()+dinero);
                Nivel.RepartirExp(experiencia);
                Nivel.SubirEquipo();
                return true;

            }

                } else if (p.getRol() == Rol.BOSS) {

                    boolean turnoboss = true;

                    while (turnoboss && boss.getEstado().equals(Estado.ALIVE)
                            && ((boss.getAtaques()[0].getUsos() > 0 && boss.getAtaques()[0]!=null)|| (boss.getAtaques()[1].getUsos() > 0 && boss.getAtaques()[1]!=null)
                                    || (boss.getAtaques()[2].getUsos() > 0 && boss.getAtaques()[2]!=null)|| (boss.getAtaques()[3].getUsos() > 0 && boss.getAtaques()[3]!=null))
                            && (hayAlguienVivo(peleadores))) {
                        int r = m.nextInt(0, 4);
                        int r2 = m.nextInt(0, 4);
                        if (peleadores[r2] != null) {
                            if ( boss.getAtaques()[r]!=null && boss.getAtaques()[r].getUsos() > 0 && peleadores[r2].getEstado().equals(Estado.ALIVE) && peleadores[r2].getRol()==Rol.PJ) {

                                if (boss.getAtaques()[r].getClass() == Ataque_pegar.class) {

                                    boss.getAtaques()[r].usarAtaque(boss, peleadores[r2]);
                                } else {
                                    boss.getAtaques()[r].usarAtaque(boss, boss);

                                }
                                turnoboss = false;
                            }
                        }

                    }

                     if (boss.getEstado()==Estado.DEAD) {
                System.out.println("Felicidades! Has ganado el juego!");
                System.out.println("Has obtenido "+dinero+"$ de oro y "+experiencia+" de xp que será repartido entre todo el equipo!");
                Personaje.setDinero(Personaje.getDinero()+dinero);
                Nivel.RepartirExp(experiencia);
                Nivel.SubirEquipo();
                return true;

            }

                }

            }

            if (!hayAlguienVivo(peleadores)) {

                System.out.println("Oh no! Has perdido!");
                return false;
            }

           
            if (boss.getEstado()==Estado.DEAD) {
                System.out.println("Felicidades! Has ganado el juego!");
                System.out.println("Has obtenido "+dinero+"$ de oro y "+experiencia+" de xp que será repartido entre todo el equipo!");
                Personaje.setDinero(Personaje.getDinero()+dinero);
                Nivel.RepartirExp(experiencia);
                Nivel.SubirEquipo();
                Nivel.RestaurarStats();
                return true;

            }
        
        }
return true;
    }
}
