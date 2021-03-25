package actividad7cenjav;

import java.util.Scanner;

/**
 * @author Luis_
 */
public class Actividad7CenJav {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Valores a calcular: ");
        int valor = scan.nextInt();
        //Metodo numeros primos
        NumerosPrimos(valor);
        //Metodo de Fibonacci
        MetodoFibonacci(valor);
    }
    //Metodo de numeros primos
    public static int[] NumerosPrimos(int valor){
        int[] numerosPrimos = new int[valor];
        int x = 2;
        boolean primo = true;
        int y = 2;
        for(int i = 0; i < valor; i++){
            primo = true;
            y = 2;
            while(primo && y != x){
                if(x%y == 0){
                    primo = false;
                }
                y++;
            }
            if(primo){
                numerosPrimos[i] = x;
            }
            else{
                i--;
            }
            x++;
        }
        System.out.println("Numeros Primos:");
        for(int i = 0; i<valor; i++){
            System.out.print(numerosPrimos[i]+",");
        }
        System.out.println();
        return numerosPrimos;
    }
    //Metodo de Fibonacci
    public static int[] MetodoFibonacci (int valor){
        int[] fibonacci = new int[valor];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for(int i=2; i < valor; i++){
            fibonacci[i] = (fibonacci[i-1] + fibonacci[i-2]);
        }
        System.out.println("Sucesion Fibonacci:");
        for(int i = 0; i<valor; i++){
            System.out.print(fibonacci[i]+",");
        }
        System.out.println();
        return fibonacci;
    }
}
