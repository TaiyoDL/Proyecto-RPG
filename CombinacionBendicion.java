public class CombinacionBendicion extends Combinacion{

private int vida_curada;
private double multiplicador;
public CombinacionBendicion(String nombre, String descripcion, String id1, String id2, int usos, int vida_curada,
        double multiplicador) {
    super(nombre, descripcion, id1, id2, usos);
    this.vida_curada = vida_curada;
    this.multiplicador = multiplicador;
}
@Override
public String toString() {
    return super.toString()+"Curacion: " + vida_curada +  "multiplicador: "+ multiplicador ;
}

 @Override
    public boolean hacerCombinacion(Personaje p1,Personaje p2,Personaje objetivo){

if(this.getUsos()==0) {System.out.println("No quedan usos de esta combinacion");return false;}

else {
    
    System.out.println(this.getDescripcion());
    
      

        

        objetivo.setVida(objetivo.getVida()+this.vida_curada);
        System.out.println(p1.getNombre()+ " y "+p2.getNombre()+ " han usado "+this.getNombre()+" en "+objetivo.getNombre());
        System.out.println();
if(objetivo.getVida()>objetivo.getVidaTotal()) {
objetivo.setVida(objetivo.getVidaTotal());}
objetivo.alterarStats(multiplicador);
    this.setUsos(this.getUsos()-1);
return true;}

}






}