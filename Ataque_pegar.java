public class Ataque_pegar extends Ataque {
private int potencia;




@Override
public Ataque clonarAtaque() {
    return new Ataque_pegar(this.getNombre(), this.getDescripcion(), this.getUsos(),this.getUsosTotales(), this.potencia);
}


     public Ataque_pegar(String nombre, String descripcion, int usos, int potencia) {
    super(nombre, descripcion, usos);
    this.potencia = potencia;
}

   public Ataque_pegar() {
    super();
    this.potencia = 0;
}





     public Ataque_pegar(int potencia) {
    this.potencia = potencia;
}







    

     public Ataque_pegar(String nombre, String descripcion, int usos, int usosTotales, int potencia) {
        super(nombre, descripcion, usos, usosTotales);
        this.potencia = potencia;
    }


     public int getPotencia() {
         return potencia;
     }

     public void setPotencia(int potencia) {
         this.potencia = potencia;
     }
        
      public boolean usarAtaque(Personaje usuario,Personaje objetivo) {

         if(objetivo.getEstado()==Estado.DEAD) {

System.out.println("El personaje está muerto, no se puede atacar");
return false;
    }
    else {

if (this.getUsos() == 0) {
            System.out.println("No te quedan PPS");
            return false;

        } else {
        int danio = ((this.potencia * usuario.getAtaque()) / 50) - (objetivo.getDefensa() / 2);

        if(danio<=0) {danio=1;}

        objetivo.setVida(objetivo.getVida()-danio);
        System.out.println(usuario.getNombre()+" ha usado "+this.getNombre()+" contra "+objetivo.getNombre()+" (-"+danio+"PS)");
        System.out.println();
if(objetivo.getVida()<=0) {
objetivo.setVida(0);
objetivo.setEstado(Estado.DEAD);
System.out.println(objetivo.getNombre()+" ha muerto!");
}

        this.setUsos(this.getUsos()-1);
        return true;

    }
}
}

      @Override
      public String toString() {
        return super.toString()+" potencia=" + potencia ;
      }


}
