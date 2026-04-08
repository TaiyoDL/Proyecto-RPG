abstract class Objeto {
private String id;
    private String nombre;
private String descripcion;
private int cantidad;
private int precio;
public Objeto(String id,String nombre, String descripcion) {
    this.id=id;
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.cantidad = 0;
    this.precio=0;
}
public Objeto() {
    this.id="";
    this.nombre = "";
    this.descripcion = "";
    this.cantidad = 0;
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
public int getCantidad() {
    return cantidad;
}
public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
}

   
public boolean usarObjeto(Personaje usuario,Personaje objetivo){


return false;
}
public String getId() {
    return id;
}
public void setId(String id) {
    this.id = id;
}

@Override
public String toString() {
    return this.getNombre()+": "+this.getDescripcion()+".";
}
public void setPrecio(int precio) {
    this.precio = precio;
}
public int getPrecio() {
    return precio;
}



}
