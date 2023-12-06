/* Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
y que los almacene en un array. El programa debe ser capaz de pasar todos
los números pares a las primeras posiciones del array (del 0 en adelante) y
todos los números impares a las celdas restantes. Utiliza arrays auxiliares si es
necesario */
public class Ejercicio10{
	public static void main(String[] args){

        System.out.println("Con este programa ordenaremos un array en pares e impares");
        int[] array= new int[20];

        //generamos los datos aleatorios

        for(int i=0;i<20;i++){
            array[i]=(int)(Math.random()*101);
        }

        for(int i=0;i<20;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        //creamos dos contadores para saber cuantos pares e impares hay

        int contador_pares=0;
        int contador_impares=0;
        for(int i=0;i<20;i++){
            if(array[i]%2==0){
                contador_pares++;
            }else{
                contador_impares++;
            }
        }

        //usamos los contadores para saber como de largos son los arrays auxiliares

        int[] auxiliar_pares=new int[contador_pares];
        int[] auxiliar_impares=new int[contador_impares];

        //estas variables nos serviran para ir almacenando valores en los arrays

        int espejo_contador_pares=0;
        int espejo_contador_impares=0;

        //recorremos el array y si es par lo almacenamos en el array par y aumenta el contador y viceversa

        for(int i=0;i<20;i++){
            if(array[i]%2==0){
                auxiliar_pares[espejo_contador_pares]=array[i];
                espejo_contador_pares++;
            }else{
                auxiliar_impares[espejo_contador_impares]=array[i];
                espejo_contador_impares++;
            }
        }

        
        //el ejercicio estaria ya terminado si imprimimos un array y luego otro
        //seria asi:
        for(int i=0;i<contador_pares;i++){
            System.out.print(auxiliar_pares[i]+" ");
        }
        for(int i=0;i<contador_impares;i++){
            System.out.print(auxiliar_impares[i]+" ");
        }
        System.out.println();
        
        //pero para que sea mas completo y funcional volvere a unirlos en uno solo
        //y seria asi:

        int []array_final=new int[20];
        int aumento=1;
        
        for(int i=0;i<20;i++){
            if(i<contador_pares){
                array_final[i]=auxiliar_pares[i];
            }else{
                array_final[(19-contador_impares)+1*aumento]=auxiliar_impares[i-(contador_pares)];
                aumento++;
            }
        }

        for(int i=0;i<20;i++){
            System.out.print(array_final[i]+" ");
        }
        
        }
	}