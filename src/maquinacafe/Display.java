package maquinacafe;

import java.util.Scanner;

public class Display {
    
     public static void menu(){
        System.out.println("************ MÁQUINA DE CAFE **************\n"
                         + "*     Bienvenido!                         *\n"
                         + "*          1)Selecionar Producto          *\n"
                         + "*          2)Introducir dinero            *\n"
                         + "*          3)Devolver dinero              *\n"
                         + "*          0)Salir                        *\n"
                         + "*******************************************\n");
    }
   
    public static void mostarProductos(Producto lista[]){
        System.out.print("*******************************************\n");
        for (int i=0;i<lista.length;i++){
           System.out.print("            "+(i+1)+") "+lista[i].getTipo()+"          \n");
        }
        System.out.print("*******************************************\n");
    }
    
    public static void mostrarPrecios(Producto lista[], int opcion){
        Scanner sc = new Scanner(System.in);
        System.out.print(lista[opcion-1]+"\n");
        Display.menu();
        System.out.print("--> ");
        int opcionMenu = sc.nextInt();
        Botonera.opcionesMenu(opcionMenu,lista);
    }
    
     public static void elaborarBebida(){
        System.out.println("Procesando bebida..........\n");
        System.out.println("Aqui esta su bebida. Hasta la proxima!");
    }
}
