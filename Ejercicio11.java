/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
primos a las primeras posiciones, desplazando el resto de números (los que no
son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar el
array resultante. */
import java.util.Scanner;
public class Ejercicio11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa ordena el array por primos y no primos");
        int[] array= new int[10];

        for(int i=0;i<10;i++){
            array[i]=sc.nextInt();
        }

        //declaramos una variable boolean para comprobar si son primos

        boolean primo=true;
        for(int i=0;i<10;i++){
            primo=true;

                for(int j=2;j<array[i];j++){
                    if(array[i]%j==0){
                        primo=false;
                    }
                }
                if(primo){
                    System.out.print(array[i]+" ");
                }
            }
            
            for(int i=0;i<10;i++){
                primo=true;
                
                for(int j=2;j<array[i];j++){
                    if(array[i]%j==0){
                        primo=false;
                    }
                }
                if(!primo){
                    System.out.print(array[i]+" ");
                }
            }
            
        sc.close();
        }
	}