
/** *
 * Edad para Votar: Determinar si una persona es elegible para votar en función de su edad minimo 18 años.
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio_EdadVotar {

    public static void main(String[] args) {
        int edad;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame edad: ");
        edad = tcl.nextInt();
        if (edad >= 18) {
            System.out.println("Si puede votar");
        } else {
            System.out.println("No puede votar");
        }

    }
}
         /**
         * *
         * run: Dame edad: 50 
         * Si puede votar
         */
