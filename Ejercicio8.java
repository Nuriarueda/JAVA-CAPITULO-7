/* Realiza un programa que pida la temperatura media que ha hecho en cada mes
de un determinado año y que muestre a continuación un diagrama de barras
horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
de asteriscos o cualquier otro carácter. */
import java.util.Scanner;
public class Ejercicio8 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
      String[] mes = {
        "enero", "febrero", "marzo", "abril", "mayo", "junio",
        "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"
      };
                    
      int[] temperatura = new int[12];
      
      String verde = "\033[32m";
      String naranja = "\033[33m";
      String azul = "\033[34m";
      String morado = "\033[35m";
      String blanco = "\033[37m";
            
      for (int i = 0; i < 12; i++) {
        System.out.print("Introduzca la temperatura media de " + mes[i] + ": ");
        temperatura[i] = sc.nextInt();
      }
  
      System.out.println();
      
      for (int i = 0; i < 12; i++) {
        System.out.printf(azul + "%12s " + verde + "│", mes[i]);
        for (int j = 0; j < temperatura[i]; j++) {
          System.out.print(morado + "▄");
        }
        System.out.println(naranja + " " + temperatura[i] + "ºC" + blanco);
      }
      
      sc.close();
    }
  }