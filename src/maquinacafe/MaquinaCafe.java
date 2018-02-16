package maquinacafe;

import java.util.Scanner;

public class MaquinaCafe {

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