
/**
 *Ordenamiento de Tres Números: Dados tres números, ordenarlos en orden ascendente.
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio9_OrdenamientoTresNumeros {

    public static void main(String[] args) {
        int numero1, numero2, numero3, numeroMenor, numeroMayor, numeroMedio;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame el primer numero: ");
        numero1 = tcl.nextInt();
        System.out.print("Dame el segundo numero: ");
        numero2 = tcl.nextInt();
        System.out.print("Dame el tercer numero: ");
        numero3 = tcl.nextInt();

        numeroMenor = numero1;
        numeroMedio = numero2;
        numeroMayor = numero3;

        if (numero2 < numeroMenor) {
            numeroMenor = numero2;
            numeroMedio = numero1;
        }
        if (numero3 < numeroMenor) {
            numeroMenor = numero3;
            numeroMedio = (numero1 < numero2) ? numero1 : numero2;
            numeroMayor = (numero1 > numero2) ? numero1 : numero2;
        }

        // Aseguramos que 'mayor' sea el más grande
        if (numero1 > numeroMayor) {
            numeroMayor = numero1;
            numeroMedio = (numero2 < numero3) ? numero2 : numero3;
            numeroMenor = (numero2 > numero3) ? numero2 : numero3;
        }
        if (numero2 > numeroMayor) {
            numeroMayor = numero2;
            numeroMedio = (numero1 < numero3) ? numero1 : numero3;
            numeroMenor = (numero1 > numero3) ? numero1 : numero3;
        }

        System.out.println("Numeros en orden ascendente: " + numeroMenor + ", " + numeroMedio + ", " + numeroMayor);
    }
}
/***
 * run-single:
 *Dame el primer numero: 74
 *Dame el segundo numero: 58
 *Dame el tercer numero: 80
 *Numeros en orden ascendente: 58, 74, 80
 */
