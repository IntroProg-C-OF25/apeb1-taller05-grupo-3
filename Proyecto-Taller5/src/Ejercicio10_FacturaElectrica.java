/*Facturación eléctrica: Desarrollar una solución que permita calcular y mostrar el valor a cancelar de una planilla de luz. 
Se debe ingresar el valor de costo por kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario tiene edad mayor a 65 años,
se debe descontar el 10% por pertenecer a la tercera edad.
/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Ejercicio10_FacturaElectrica {

    public static void main(String[] args) {
        double costokiloh, kilovatconsum, Edad, valor, valorMayorEdad;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame el valor del costo kilovatio por hora: ");
        costokiloh = tcl.nextDouble();
        System.out.print("Dame los kilovatios consumidos: ");
        kilovatconsum = tcl.nextDouble();
        valor = kilovatconsum * costokiloh;
        valorMayorEdad = valor - (valor * 0.10);
        System.out.print("Ingrese la Edad: ");
        Edad = tcl.nextDouble();
        if (Edad >= 65) {
            System.out.println("La cantidad de la planilla de luz, debido a que es mayor de edad es = " + valorMayorEdad);
        } else {
            System.out.println("El valor de la planilla de luz es = " + valor);
        }

    }
}
/***
 * run-single:
 *Dame el valor del costo kilovatio por hora: 5,8
 *Dame los kilovatios consumidos: 200
 *Ingrese la Edad: 65
 *La cantidad de la planilla de luz, debido a que es mayor de edad es = 1044.0
 */