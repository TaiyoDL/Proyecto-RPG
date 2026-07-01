public class Ataque_Curativo extends Ataque {
@Override
public Ataque clonarAtaque() {
    return new Ataque_Curativo(this.getNombre(), this.getDescripcion(), this.getUsos(), this.getVida_curada());
}
    private int vida_curada;

    public Ataque_Curativo(String nombre, String descripcion, int usos, int vida_curada) {
        super(nombre, descripcion, usos);
        this.vida_curada = vida_curada;
    }

    public Ataque_Curativo(int vida_curada) {
        this.vida_curada = vida_curada;
    }

    public Ataque_Curativo() {
        super();
        this.vida_curada = 0;
    }

    public int getVida_curada() {
        return vida_curada;
    }

    public void setVida_curada(int vida_curada) {
        this.vida_curada = vida_curada;
    }

    @Override
    public boolean usarAtaque(Personaje usuario,Personaje objetivo) {
  if(objetivo.getEstado()==Estado.DEAD) {

System.out.println("El personaje está muerto, no se puede curar");
return false;
    }
    else {

        if (this.getUsos() == 0) {
            System.out.println("No te quedan PPS");
            return false;

        } else {
            objetivo.setVida(objetivo.getVida() + this.vida_curada);

            System.out.println(usuario.getNombre()+" ha curado " + this.vida_curada + "PS a " + objetivo.getNombre());

            if(objetivo.getVida()>objetivo.getVidaTotal()) {

                objetivo.setVida(objetivo.getVidaTotal());
            }
this.setUsos(this.getUsos()-1);
return true;
        }
    }

    }

    @Override
    public String toString() {
        return super.toString() + "\n Poder Curativo:" + vida_curada;
    }

}
