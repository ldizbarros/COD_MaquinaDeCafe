package maquinacafe;

import java.util.Scanner;

/**
 * Clase principal de la Maquina de cafe  b
 * @author lauradiz
 */
public class MaquinaCafe {
    /**
     * Metodo main donde se crea el Array con los productos que ofrece la maquina y sus precios.
     * Se llama a la clase Display para que se muestren las opciones del menu y luego a la 
     * clase Botonera donde se manejaran las opciones del menu introducidas.
     * @param args parametro args
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Producto listaProductos[] = {new Producto("Cafe con Leche",1.5f),
            new Producto("Chocolate",1f), new Producto("Te",1f)};
        
        Display.menu();
        System.out.print("--> ");
        int opcion = sc.nextInt();
        Botonera.opcionesMenu(opcion,listaProductos);
    }  
}