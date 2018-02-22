package maquinacafe;

import java.util.Scanner;

public class Botonera {
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
