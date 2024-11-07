
/** *
 * Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. Si es bisiesto, mostrar un mensaje especial.
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio_AñoBisiesto {

    public static void main(String[] args) {
        int año;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme el año que desea ingresar: ");
        año = tcl.nextInt();
        if (año % 4 == 0) {
            System.out.println("Si es año bisiesto el " + año + ":");
        } else {
            System.out.println("El año ingresado no es bisiesto");
        }

    }
}
/***
 * run:
 *Deme el a�o que desea ingresar: 2024
 *Si es a�o bisiesto el 2024:
 */
