/* Escribe un programa que pida 8 palabras y las almacene en un array. A
continuación, las palabras correspondientes a colores se deben almacenar al
comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
auxiliares como quieras. Los colores que conoce el programa deben estar en
otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
blanco y morado. */
import java.util.Scanner;
public class Ejercicio14{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        System.out.println("Este programa destaca el numero minimo o maximo");
        String[] array= new String[8];

        for(int i=0;i<8;i++){
            array[i]=sc.next();
        }

        for(int i=0;i<8;i++){
            if(array[i].equals("rosa") || array[i].equals("azul") || array[i].equals("verde") || array[i].equals("morado") || array[i].equals("rojo") || array[i].equals("negro") || array[i].equals("blanco") || array[i].equals("naranja") || array[i].equals("verde") || array[i].equals("amarillo")){
                System.out.print(array[i]+" ");;
            }
        } 
        
        boolean imprimir;
        
        for(int i=0;i<8;i++){
            imprimir=true;
            if(array[i].equals("rosa") || array[i].equals("azul") || array[i].equals("verde") || array[i].equals("morado") || array[i].equals("rojo") || array[i].equals("negro") || array[i].equals("blanco") || array[i].equals("naranja") || array[i].equals("verde") || array[i].equals("amarillo")){
                imprimir=false;
            }

            if(imprimir){
                System.out.print(array[i]+" ");;
            }
        } 

        sc.close();
        }
	}
