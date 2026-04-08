abstract class  Ataque {

private String nombre;
private String descripcion;
private int usos;
public Ataque(String nombre, String descripcion, int usos) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.usos = usos;
}
public Ataque() {
    this.nombre = "";
    this.descripcion = "";
    this.usos = 0;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getDescripcion() {
    return descripcion;
}
public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}
public int getUsos() {
    return usos;
}
public void setUsos(int usos) {
    this.usos = usos;
}
@Override
public String toString() {
    return  "---------------------\n"+nombre + "\n ===================== \n"  + descripcion + "\n usos=" + usos ;
}

    public boolean usarAtaque(Personaje usuario,Personaje objetivo){

return true;
    }
}
