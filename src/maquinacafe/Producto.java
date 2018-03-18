package maquinacafe;

/**
 * Clase Producto. 
 * Contienen 3 atributos, el tipo de produto, su valor y la cantidad de azucar 
 * para la bebida, por defecto es 3
 * @author lauradiz
 */
public class Producto {
    
    private String tipo;
    private float precio;
    private static int azucar = 3;

    /**
     * Constructor de la clase producto
     */
    public Producto() {
    }
    
    /**
     * Constructor de la clase produto con los atributos de la clase
     * @param tipo tipo de bebida 
     * @param precio precio de la bebida
     */
    public Producto(String tipo, float precio) {
        this.tipo = tipo;
        this.precio = precio;
    }
    
    /**
     * Metodo de acceso para el atributo tipo
     * @return devuleve el valor de tipo
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Metodo de acceso para el atributo precio
     * @return devuleve el valor de precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Metodo de acceso para el atributo azucar
     * @return devuleve el valor de azucar
     */
    public static int getAzucar() {
        return azucar;
    }

    /**
     * Metodo de acceso para el atributo tipo
     * @param tipo nuevo valor del atributo tipo
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Metodo de acceso para el atributo precio
     * @param precio nuevo valor del atributo precio
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    /**
     * Metodo de acceso para el atributo azucar
     * @param azucar nuevo valor del atributo azucar
     */
    public static void setAzucar(int azucar) {
        Producto.azucar = azucar;
    }
    
    /**
     * Metodo para aumentar la cantidad de azucar
     */
    public static void aumentarAzucar(){
        Producto.azucar+=1;
    }
    
    /**
     * Metodo para disminuir el azucar
     */
    public static void disminuirAzucar(){
        Producto.azucar-=1;
    }

    /**
     * Metodo toString
     * @return 
     */
    @Override
    public String toString() {
        return tipo + " ----> " + precio +" €";
    }

}
