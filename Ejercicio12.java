/* Realiza un programa que pida 10 números por teclado y que los almacene en
un array. A continuación se mostrará el contenido de ese array junto al índice
(0 – 9). Seguidamente el programa pedirá dos posiciones a las que llamaremos
“inicial” y “final”. Se debe comprobar que inicial es menor que final y que ambos
números están entre 0 y 9. El programa deberá colocar el número de la posición
inicial en la posición final, rotando el resto de números para que no se pierda
ninguno. Al final se debe mostrar el array resultante. */
import java.util.Scanner;
public class Ejercicio12{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa cambia dos numeros de un array");
        int[] array= new int[10];

        for(int i=0;i<10;i++){
            array[i]=sc.nextInt();
        }

        for(int i=0;i<10;i++){
            System.out.printf("%3s",i);
        }

        System.out.println("");

        for(int i=0;i<10;i++){
            System.out.printf("%3s",array[i]);
        }
        
        //pedimos los numeros que queremos cambiar

        System.out.println("");
        System.out.println("Diga las posiciones que quiere cambiar, la inicial tiene que ser menor que la final");
        int inicial;
        int final_;

        //un bucle para comprobar que la inicial sea menor que la final
        
        do{
            System.out.print("La inicial: ");
            inicial=sc.nextInt();
            System.out.print("La final: ");
            final_=sc.nextInt();
        }while(final_<=inicial && final_>9 && inicial>9);
            
        //declaramos otro array para almacenar el array cambiado

        int[] array_final=new int[10];

        //si la posicion es igual a la final o inicial ponemos el contrario
        //si no almacena los numeros normales del array

        for(int i=0;i<10;i++){
            if(i==inicial){
                array_final[i]=array[final_];
            }else{
                if(i==final_){
                    array_final[i]=array[inicial];
                }else{
                    array_final[i]=array[i];
                }
            }
        }


        for(int i=0;i<10;i++){
            System.out.printf("%3s",i);
        }

        System.out.println("");

        for(int i=0;i<10;i++){
            System.out.printf("%3s",array_final[i]);
        }


        sc.close();
        }
	}