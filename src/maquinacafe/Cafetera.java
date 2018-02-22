package maquinacafe;

import java.util.Scanner;

public class Cafetera {
    
    public static void selecionarBebida(Producto lista[],Monedero cuenta){
        Scanner sc = new Scanner(System.in);
        Display.mostarProductos(lista);
        System.out.print("--> ");
        int bebida = sc.nextInt();
        if (cuenta.getCredito()!=0){
            if (cuenta.getCredito()>=lista[bebida-1].getPrecio()){
                Cafetera.cantidadAzucar(cuenta,lista[bebida-1].getPrecio());
            }
            else{
                System.out.println("El dinero no es suficiente. Introduce mas :)");
                Monedero.insertarCredito(cuenta, lista);
            }
        }
        else{
            Display.mostrarPrecios(lista, bebida);
        }
    }
    
    
    public static void cantidadAzucar(Monedero cuenta,float precio){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de azucar: "+Producto.getAzucar());
        if(Producto.getAzucar()==6 || Producto.getAzucar()==0){
            Monedero.devolverDinero(cuenta,precio);
            Display.elaborarBebida();
        }else{
            System.out.println("¿Quiereas añadir o quitar azucar? (si/no)");
            String respuesta = sc.next();
            while(respuesta.equalsIgnoreCase("si")){
                System.out.print("--> ");
                String cantidad = sc.next();
                while(cantidad.equalsIgnoreCase("+") || cantidad.contentEquals("-")){
                    if(cantidad.equalsIgnoreCase("+")){
                        if(Producto.getAzucar()==6){
                            break;
                        }else{
                            Producto.aumentarAzucar();
                            System.out.println("Cantidad de azucar: "+Producto.getAzucar());
                            System.out.print("(Introduce no para dejar de añadir azucar)--> ");
                            cantidad = sc.next();
                        }
                    }
                    else{
                        if(Producto.getAzucar()==0){
                            break;
                        }
                        else{
                            Producto.disminuirAzucar();
                            System.out.println("Cantidad de azucar: "+Producto.getAzucar());
                            System.out.print("(Introduce no para dejar de quitar azucar)--> ");
                            cantidad = sc.next();
                        }
                    }
                }
                if(Producto.getAzucar()==6 || Producto.getAzucar()==0){
                    Monedero.devolverDinero(cuenta,precio);
                    Display.elaborarBebida();
                    break;
                }else{
                    System.out.println("¿Quiereas añadir o quitar azucar? (si/no)");
                    respuesta = sc.next();
                }
            }
        }
    }
}
