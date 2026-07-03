/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mario
 */

abstract class Combinacion {

    private String id1;
    private String id2;
    private int usos;
    private int usosTotales;
    private String descripcion;
    private String nombre;
    

    public Combinacion(String nombre,String descripcion,String id1, String id2, int usos,int usostotales) {
        this.id1 = id1;
        this.id2 = id2;
        this.usos=usos;
        this.descripcion=descripcion;
        this.nombre=nombre;
        this.usosTotales=usostotales;
    }

    
    

    public Combinacion(String id1, String id2, int usos, int usosTotales, String descripcion, String nombre) {
        this.id1 = id1;
        this.id2 = id2;
        this.usos = usos;
        this.usosTotales = usosTotales;
        this.descripcion = descripcion;
        this.nombre = nombre;
    }




    public String getId1() {
        return id1;
    }

    public void setId1(String id1) {
        this.id1 = id1;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public int getUsos() {
        return usos;
    }

    public void setUsos(int usos) {
        this.usos = usos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  

    
public boolean hacerCombinacion(Personaje p1,Personaje p2,Personaje objetivo){

if(this.usos==0) {return false;}

else {return true;}

}

    @Override
    public String toString() {
        return "Combinacion{" + "Personaje1(ID)=" + id1 + ", Personaje2(ID)=" + id2 +  ", nombre=" + nombre +", descripcion=" + descripcion  +", usos=" + usos + '}'+"\n\n";
    }


    public int getUsosTotales() {
        return usosTotales;
    }
   
    
}
