package maquinacafe;

import java.util.Scanner;

/**
 * Clase Display
 * Aqui se encuentran los metodos que mostraran informacion porpantalla
 * @author lauradiz
 */
public class Display {
    
    /**
     * Metodo estatico menu(). Este metodo no devuelve nada y muestra las opciones
     * del menu.
     */
    public static void menu(){
        System.out.println("************ MÁQUINA DE CAFE **************\n"
                         + "*     Bienvenido!                         *\n"
                         + "*          1)Selecionar Producto          *\n"
                         + "*          2)Introducir dinero            *\n"
                         + "*          3)Devolver dinero              *\n"
                         + "*          0)Salir                        *\n"
                         + "*******************************************\n");
    }
   
    /**
     * Este metodo estatico recorre el array de productos y los muestra por pantalla.
     * No devuelve nada
     * @param lista Array de productos que tiene la maquina de cafe
     */
    public static void mostarProductos(Producto lista[]){
        System.out.print("*******************************************\n");
        for (int i=0;i<lista.length;i++){
           System.out.print("            "+(i+1)+") "+lista[i].getTipo()+"          \n");
        }
        System.out.print("*******************************************\n");
    }
    
    /**
     * Metodo estatico que muestra los precios de los productos segun la opcion elegida.
     * Muestra por pantalla el producto segun la opcion que se envia por parametro.
     * Luego vuelve a mostar el menu y recoge la opcion deseada y lo manda a la
     * clase Botonera. No devuelve nada.
     * @param lista Array de productos que tiene la maquina de cafe
     * @param opcion opcion introducida en el menu por el usuario
     */
    public static void mostrarPrecios(Producto lista[], int opcion){
        Scanner sc = new Scanner(System.in);
        System.out.print(lista[opcion-1]+"\n");
        Display.menu();
        System.out.print("--> ");
        int opcionMenu = sc.nextInt();
        Botonera.opcionesMenu(opcionMenu,lista);
    }
    
    /**
     * Metodo elaborarBebida. Este metodo muestra un mensaje cuando la bebida ya esta terminada
     * y desdìde al cliente.
     */
    public static void elaborarBebida(){
        System.out.println("Procesando bebida..........\n");
        System.out.println("Aqui esta su bebida. Hasta la proxima!");
    }
}
