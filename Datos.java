import java.util.ArrayList;

public class Datos {

    public static ArrayList<Personaje> personajes = new ArrayList<>();
    public static ArrayList<Objeto> objetos = new ArrayList<>();
    

    public static void anadirPersonaje(Personaje p){

        personajes.add(p);
    }

    public static void anadirObjeto(Objeto p){
        objetos.add(p);
    }

    

    public static void mostrarDatos(){

        for(Personaje p : personajes){System.out.println(p);}
    }

public static Personaje buscarporId(String id){


    for(Personaje p : personajes){

        if(p.getId().equals(id)){return p;}
    }
    return null;
}
    
}
