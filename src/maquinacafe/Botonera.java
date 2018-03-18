package maquinacafe;

import java.util.Scanner;
/**
 * Clase Botonera.
 * En esta clase se manejan las opciones del menu
 * @author lauradiz
 */
public class Botonera {
    
    /**
     * Metofo estatico que recibe la opcion del menu introducida por el usuario y el array
     * de productos que ofrece la maquiuna.
     * En el metodo hay un switch con las siguientes opciones:
     * La opcion 1 nos masnda a la clase Cafetera donde se seleccionara la bebida.
     * La opcion 2 nos masnda a la clase Monedero donde recibira el dinero.
     * La opcion 3 nos masnda a la clase Monedero donde nos devolveran el dinero si se introdujo alguno.
     * La opcion 0 sale del programa
     * @param opcion opcion introducida en el menu por el usuario
     * @param lista Array de productos que tiene la maquina de cafe
     */
    public static void opcionesMenu(int opcion,Producto lista[]){
        Monedero cuenta = new Monedero();
        Scanner sc = new Scanner(System.in);
        switch (opcion){
            case 1: Cafetera.selecionarBebida(lista,cuenta);
                    break;
            case 2: Monedero.insertarCredito(cuenta,lista);
                    break;
            case 3: Monedero.devolverDinero(cuenta,0F);
                    break;
            case 0: break;
            default: System.out.println("************ Opción no válida **************");
        }
    }   
}
