
/** *
 *Día de la Semana: Mostrar el nombre del día de la semana en función del número ingresado
 * (1 para lunes, 2 para martes, etc.).
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio_DiaSemana {

    public static void main(String[] args) {

        int numDia;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme num. del dia: ");
        numDia = tcl.nextInt();
        //Estructura de control de seleccion multiple
        //En casp de <=> switch
        switch (numDia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Error en el numero");

        }
    }
}
/**
 * *
 * run: Deme num. del dia: 5 Viernes run: Deme num. del dia: 10 Error en el
 * numero
 */
