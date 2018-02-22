package maquinacafe;

public class Producto {
    
    private String tipo;
    private float precio;
    private static int azucar = 3;

    public Producto() {
    }

    public Producto(String tipo, float precio) {
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public float getPrecio() {
        return precio;
    }

    public static int getAzucar() {
        return azucar;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public static void setAzucar(int azucar) {
        Producto.azucar = azucar;
    }
    
    public static void aumentarAzucar(){
        Producto.azucar+=1;
    }
    
    public static void disminuirAzucar(){
        Producto.azucar-=1;
    }

    @Override
    public String toString() {
        return tipo + " ----> " + precio +" €";
    }

}
