package maquinacafe;

import java.util.Scanner;

public class Cafetera {
    
    public static void selecionarBebida(Producto lista[],Monedero cuenta){
        Scanner sc = new Scanner(System.in);
        Display.mostarProductos(lista);
        System.out.print("--> ");
        int bebida = sc.nextInt();
        if (cuenta.getCredito()!=0){
            Cafetera.cantidadAzucar();
        }
        else{
            Display.mostrarPrecios(lista, bebida);
        }
    }
    
    
    public static void cantidadAzucar(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Cantidad de azucar: "+Producto.getAzucar());
        System.out.println("¿Quiereas añadir o quitar azucar? (si/no)");
        String respuesta = sc.next();
        while(respuesta.equalsIgnoreCase("si")){
            System.out.print("--> ");
            String cantidad = sc.next();
            while(cantidad.equalsIgnoreCase("+") || cantidad.contentEquals("-")){
                
            }
            
//            cuenta.aumentarCredito(credito);
//            System.out.print("¿Introducir mas dinero? (si/no)");
//            respuesta = sc.next();
        }
        
        
    }
}
