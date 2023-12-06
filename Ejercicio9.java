/* Realiza un programa que pida 8 números enteros y que luego muestre esos
números junto con la palabra “par” o “impar” según proceda. */
import java.util.Scanner;
public class Ejercicio9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa te dira si los numeros son pares o impares");
        int [] array = new int[8];
        for(int i=0;i<8;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<8;i++){
            if(array[i]%2==0){
                System.out.println(array[i]+" es par");
            }else{
                System.out.println(array[i]+" es impar");
            }
        }
        sc.close();
        }
	}