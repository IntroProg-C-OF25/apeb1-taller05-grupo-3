
/** *
 * Rango de Notas: Asignar una letra (A, B, C, D) a una calificación en función de su rango
 * (A para 90-100, B para 80-89, etc.).
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio7_RangoNotas {

    public static void main(String[] args) {
        int calificacion;
        String letra;

        Scanner tcl = new Scanner(System.in);

        System.out.print("Introduce la calificación (0-100): ");
        calificacion = tcl.nextInt();

        letra = "Su numero ingresado es incorrecto";

        if (calificacion >= 90 && calificacion <= 100) {
            letra = "A";
        }
        if (calificacion >= 80 && calificacion < 90) {
            letra = "B";
        }
        if (calificacion >= 70 && calificacion < 80) {
            letra = "C";
        }
        if (calificacion >= 60 && calificacion < 70) {
            letra = "D";
        }
        if (calificacion >= 0 && calificacion < 60) {
            letra = "F";
        }

        System.out.println("La letra obtenida es: " + letra);
    }
}
/**
 * *
 * run-single: Introduce la calificaci�n (0-100): 85 
 * La letra obtenida es: B
 */
