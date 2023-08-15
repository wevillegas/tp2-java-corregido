package programacion2.trabajopractico2;
import java.util.Scanner;

public class TrabajoPractico2 {

    public static void main(String[] args) {
        System.out.println("Ingrese el numero (del 1 al 11) del ejercicio que desea ejecutar");
        System.out.println("------------------------------------------------------------------");
        
         int ejercicio;
         Scanner teclado = new Scanner(System.in);
         ejercicio = teclado.nextInt();
         
         switch (ejercicio){
             case 1:
                 int binario1, binario2;
                 int i = 0;
                 int re = 0;
                 int[] sum = new int[20];
                 System.out.println("Ingresar dos números de cuatro dígitos, "
                         + "expresados en el sistema binario, "
                         + "presentar por pantalla ambos números y su suma.");
                 System.out.println("Ingrese el primer binario");
                 binario1 = teclado.nextInt();
                 System.out.println("Ingrese el segundo binario");
                 binario2 = teclado.nextInt();          
                 P1 ejercicio1 = new P1 (binario1, binario2);
                 ejercicio1.binarios();
                 break;
             case 2:
                 int n;
                 System.out.println("Se ingresa un número natural, "
                         + "presentar por pantalla el desarrollo del factorial de dicho número, "
                         + "como así también el valor del factorial.");
                 System.out.println("Ingresa un numero natural");
                 n = teclado.nextInt();
                 P2 ejercicio2 = new P2(n);
                 ejercicio2.factorial();
         }
    }
}
