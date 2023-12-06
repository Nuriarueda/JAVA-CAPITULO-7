/* Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos). A continuación
el programa mostrará el array y preguntará si el usuario quiere destacar el
máximo o el mínimo. Seguidamente se volverá a mostrar el array escribiendo
el número destacado entre dobles asteriscos. */
import java.util.Scanner;
public class Ejercicio13{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa destaca el numero minimo o maximo");
        int[] array= new int[100];

        for(int i=0;i<100;i++){
            array[i]=(int)(Math.random()*501);
        }

        for(int i=0;i<100;i++){
            System.out.print(array[i]+" ");
        }
        
        System.out.println("");
        System.out.print("Que numero quieres destacar: 1.Minimo 2.Maximo :");
        int decision=sc.nextInt();

        //declaramos variables para almacenar el valor minimo o el maximo

        int maximo=0;
        int minimo=501;

        switch(decision){
            case 1:

                for(int i=0;i<100;i++){
                    if(array[i]<minimo){
                        minimo=array[i];
                    }
                }

                for(int i=0;i<100;i++){

                    if(array[i]==minimo){
                        System.out.print("**"+array[i]+"** ");
                    }else{
                        System.out.print(array[i]+" ");
                    }
                }


            break;

            case 2:

                for(int i=0;i<100;i++){
                    if(array[i]>maximo){
                        maximo=array[i];
                    }
                }

                for(int i=0;i<100;i++){
                    
                    if(array[i]==maximo){
                        System.out.print("**"+array[i]+"** ");
                    }else{
                        System.out.print(array[i]+" ");
                    }
                }


            break;
        }


        sc.close();
        }
	}
