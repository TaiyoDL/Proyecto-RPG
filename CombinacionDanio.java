/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author mario
 */
public class CombinacionDanio extends Combinacion {


private int danio;

    public CombinacionDanio(int danio, String nombre, String descripcion, String id1, String id2, int usos, int usostotales) {
        super(nombre, descripcion, id1, id2, usos,usostotales);
        this.danio = danio;
    }

    

   



    public int getDanio() {
        return danio;
    }

    public void setDanio(int danio) {
        this.danio = danio;
    }

    
    @Override
    public boolean hacerCombinacion(Personaje p1,Personaje p2,Personaje objetivo){

if(this.getUsos()==0) {System.out.println("No quedan usos de esta combinacion");return false;}

else {
    
    System.out.println(this.getDescripcion());
    int danioHacer=this.danio;
      danioHacer = (((p1.getAtaque()+p2.getAtaque()) * danioHacer) / 50) - (objetivo.getDefensa() / 2);

        if(danioHacer<=0) {danioHacer=1;}

        objetivo.setVida(objetivo.getVida()-danioHacer);
        System.out.println(p1.getNombre()+ " y "+p2.getNombre()+ " han usado "+this.getNombre()+" contra "+objetivo.getNombre()+" (-"+danioHacer+"PS)");
        System.out.println();
if(objetivo.getVida()<=0) {
objetivo.setVida(0);
objetivo.setEstado(Estado.DEAD);
    this.setUsos(this.getUsos()-1);
}return true;}

}

    @Override
    public String toString() {
        return super.toString() + "danio=" + danio ;
    }
    

    
    
    }
