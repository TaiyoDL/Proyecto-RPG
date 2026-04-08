public class Objeto_Curativo extends Objeto {

private int vida_curada;

public Objeto_Curativo(String id, String nombre, String descripcion, int vida_curada) {
    super(id, nombre, descripcion);
    this.vida_curada = vida_curada;
}

public Objeto_Curativo() {
    super();
    this.vida_curada = 0;
}

public Objeto_Curativo(int vida_curada) {
    this.vida_curada = vida_curada;
}

public int getVida_curada() {
    return vida_curada;
}

public void setVida_curada(int vida_curada) {
    this.vida_curada = vida_curada;
}
    
@Override
public boolean usarObjeto(Personaje usuario,Personaje objetivo){

    if(objetivo.getEstado()==Estado.DEAD) {

System.out.println("El personaje está muerto, no se puede curar");
return false;
    }
    else {

objetivo.setVida(objetivo.getVida()+vida_curada);
System.out.println(usuario.getNombre()+" usó un/una "+this.getNombre()+" en " +objetivo.getNombre());
this.setCantidad(this.getCantidad()-1);
if(objetivo.getVida()>objetivo.getVidaTotal()) {objetivo.setVida(objetivo.getVidaTotal());}

if(this.getCantidad()==0) {

   Personaje.eliminarDeMochila(this);
}
return true;
    }
}





}
