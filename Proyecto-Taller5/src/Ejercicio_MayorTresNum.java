
/** *
 * Mayordetresnumeros: Dado tres numeros determinar cual es mayor.
 * Si son iguales, mostrar un mensaje
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Ejercicio_MayorTresNum {

    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame el num1:");
        num1 = tcl.nextInt();
        System.out.print("Dame el num2:");
        num2 = tcl.nextInt();
        System.out.print("Dame el num3:");
        num3 = tcl.nextInt();
        if (num1 == num2 && num2 == num3) {
            System.out.println("Los tres números son iguales.");
        } else {

            int mayor;
            if (num1 > num2 && num1 > num3) {
                mayor = num1;
            } else if (num2 > num3) {
                mayor = num2;
            } else {
                mayor = num3;
            }
            System.out.println("El número mayor es: " + mayor);
        }
        //Dame el num1:50
        //Dame el num2:30
        //Dame el num3:40
        //El n�mero mayor es: 50

    }
}
