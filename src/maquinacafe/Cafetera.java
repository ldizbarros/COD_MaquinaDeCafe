package maquinacafe;

import java.util.Scanner;

/**
 * Clase Cafetera.
 * En esta clase se encuentran los metodos que se encagar del matenimiento de la cafetera
 * @author lauradiz
 */
public class Cafetera {
    
    /**
     * Metodo estatico donde se pasa por parametro el array con los productos y un objeto
     * tipo monedero.
     * Este metodo llama a la clase Display pars mostrar los productos. Luego el usuario selecciona 
     * el producto que quiera. Si la cuenta del usuario esta a 0, es decir, 
     * si el usuario no introdujo dinero vamos a la clase Diplay para mostrar el precio
     * del producto seleccionado.
     * Si la cuenta es distinta de 0, se comprueba que el dinero introducido es 
     * suficiente para pagar el producto. Si es sufieciente llamamos al metodo 
     * cantidadAzucar donde se seleccionara la cantidad de azucar.
     * Si no es suficiente se llama al metodo insertarCredito para que se introduzca mas dinero.
     * @param lista Array de productos que tiene la maquina de cafe
     * @param cuenta atributo tipo monedero que contine la cantidad de dinero que introducida por el usuario
     */
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
    
    /**
     * En este metodo estatico se muestra la cantidad de azucar por defecto (3).
     * Se pregunta al usuario si quiere añadir mas azucar. Empieza el bucle donde
     * el usuario podra añadir o quitar azucar hasta llegar al tope.
     * Cuando el usuario termine de de seleccionar el azucar se llama a la clase monedero 
     * para devolver el dinero al usuario y se elabora la bebida
     * @param cuenta atributo tipo monedero que contine la cantidad de dinero que introducida por el usuario
     * @param precio precio del producto seleccionado
     */
    public static void cantidadAzucar(Monedero cuenta,float precio){
        Scanner sc = new Scanner(System.in);
        System.out.println("Cantidad de azucar: "+Producto.getAzucar());
        System.out.println("¿Quiereas añadir o quitar azucar? (si/no)");
        String respuesta = sc.next();
        while(respuesta.equalsIgnoreCase("si")){
            System.out.print("--> ");
            String cantidad = sc.next();
            while(cantidad.equalsIgnoreCase("+") || cantidad.contentEquals("-")){
                if(cantidad.equalsIgnoreCase("+")){
                    if(Producto.getAzucar()==6){
                        System.out.println("Cantidad de azucar máxima.");
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
                        System.out.println("Cantidad de azucar minima.");
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
        Monedero.devolverDinero(cuenta,precio);
        Display.elaborarBebida();
    }
}
