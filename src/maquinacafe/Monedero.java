package maquinacafe;

import java.util.Scanner;

public class Monedero {
    private float credito;
    private float cambio;

    public float getCredito() {
        return credito;
    }

    public float getCambio() {
        return cambio;
    }

    public void aumentarCredito(float cantidad){
        credito+=cantidad;
    }
    
    public static void insertarCredito(Monedero cuenta){
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
    }
    
    public static void devolverDinero(Monedero cuenta){
        
    }
}
