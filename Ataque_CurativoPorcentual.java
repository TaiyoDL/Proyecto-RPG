public class Ataque_CurativoPorcentual extends Ataque {
    double curacion_Porcentaje;

    public Ataque_CurativoPorcentual(String nombre, String descripcion, int usos, double curacion_Porcentaje) {
        super(nombre, descripcion, usos);
        this.curacion_Porcentaje = curacion_Porcentaje;
    }

     public Ataque_CurativoPorcentual() {
        super();
        this.curacion_Porcentaje = 0;
    }

    public Ataque_CurativoPorcentual(int curacion_Porcentaje) {
        this.curacion_Porcentaje = curacion_Porcentaje;
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
            objetivo.setVida((int)(objetivo.getVida() + objetivo.getVidaTotal()*(this.curacion_Porcentaje/100)));

            System.out.println(usuario.getNombre()+" ha curado " + this.curacion_Porcentaje + "% a " + objetivo.getNombre());
            

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
        return super.toString() + "\n Poder Curativo:" + curacion_Porcentaje+"%";
    }

    
}
