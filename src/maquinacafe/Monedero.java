package maquinacafe;

import java.util.Scanner;
/**
 * Clase donde se maneja la centa del producto.
 * Tiene dos atributos: credito que es el dinero que introduce el usuario y 
 * cambio que es el que se le devuleve
 * @author lauradiz
 */
public class Monedero {
    private float credito;

    /**
     * Metodo de acceso a la variable credito
     * @return devuelve el valor de credito
     */
    public float getCredito() {
        return credito;
    }
  
    /**
     * Metodo donde se aumenta el calor de la variable credito
     * @param cantidad 
     */
    public void aumentarCredito(float cantidad){
        credito+=cantidad;
    }
    
    /**
     * Metodo estatico para recibir el dinero. Se pasa como parametro el array de productos
     * y un atributo tipo monedero donde se guardaran el dinero introducido por el usuario.
     * Segun el usuario introduce dinero se aumenta la cuenta hasta que el usuario no introduzca
     * mas dinero. Llamamos al metodo seleccionarBebida para coninuar con la compra
     * @param cuenta atributo tipo monedero que contine la cantidad de dinero que introducida por el usuario
     * @param lista Array de productos que tiene la maquina de cafe
     */
    public static void insertarCredito(Monedero cuenta,Producto lista[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("--> ");
        float credito = sc.nextFloat();
        cuenta.aumentarCredito(credito);
        System.out.print("¿Introducir mas dinero? (si/no)");
        String respuesta = sc.next();
        while(respuesta.equalsIgnoreCase("si")){
            System.out.print("--> ");
            credito = sc.nextFloat();
            cuenta.aumentarCredito(credito);
            System.out.print("¿Introducir mas dinero? (si/no)");
            respuesta = sc.next();
        }
        Cafetera.selecionarBebida(lista, cuenta);
    }
    
    /**
     * Metodo estatico que devuelve el dinero al usuario. Si la cuenta es a 0
     * no devuelve nada si no devuelve la diferencia entre el precio del producto elegido y 
     * el dinero introducido
     * @param cuenta atributo tipo monedero que contine la cantidad de dinero que introducida por el usuario
     * @param precio precio del producto elegido
     */
    public static void devolverDinero(Monedero cuenta,float precio){
        if (cuenta.getCredito() == 0){
            System.out.println("No hay ningun credito introducido");            
        }else{
            System.out.println("Aqui esta tu vuelta..... \n "
                    + (cuenta.getCredito()-precio) +" €");
        }
    }
}
