import java.util.Scanner;
/**
 * @author: Angelo Aless. Chamale
 * @since: 02/07/24
 */
public class area_circunferencia {
public static void main (String []args){

    /**
     * Debemos calcular el area de una circunferencia
     */

    Scanner scan = new Scanner(System.in);
    
    /**
     * Primero obtenemos el radio y asi poder aplicar la formula 
     * agregamos "double" para cantidades con punto decimal :)
     */
    System.out.println("Ingresa el valor del radio:");
    double radio = scan.nextDouble();

    /**
     * Luego de haberlo obtenido, aplicamos la formula siguiente: (a = pi*(r*r))
     * dentro de java podemos utilizar la herramienta "Math" para realizar distintas operaciones matematicas
     * en esta ocasion utilizaremos "Math.PI" el cual nos da un resultado mas cercano a lo que seria Pi en cuestion
     * y utilizaremos "Math.pow" el cual nos ayuda a elevar potencias a distintas variables o cantidades 
     */

    double area = Math.PI * Math.pow(radio, 2);

    /**
     * Terminado la operacion, nos queda mostrar el resultado
     */

    System.out.println("El area de la circunferencia es: "+area);

    }
}