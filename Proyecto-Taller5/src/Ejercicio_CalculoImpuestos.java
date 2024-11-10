/*Calculo de impuestos: Desarrollar una solución que permita leer los datos de un automóvil (marca, origen y costo) 
imprima el impuesto por pagar y el precio de venta (incluido el impuesto).
Si el origen es Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de Italia, 15%, y si es de USA, 8%
 * 
 */

/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Ejercicio_CalculoImpuestos {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double costo, impuesto = 0, Mimpuesto, Pventa;
        String marca, origen;
        System.out.println("Dame la marca del automovil");
        marca = tcl.nextLine();
        System.out.println("Dame el origen del automovil");
        origen = tcl.nextLine();
        System.out.println("Dame el costo del automovil");
        costo = tcl.nextDouble();
        switch (origen.toLowerCase()) {
            case "alemania":
                impuesto = 0.20;
                break;
            case "japon":
                impuesto = 0.30;
                break;
            case "italia":
                impuesto = 0.15;
                break;
            case "usa":
                impuesto = 0.08;
                break;
                    
    }
        Mimpuesto = costo * impuesto;
        Pventa = costo + Mimpuesto;
        System.out.println("Impuesto a pagar = " + Mimpuesto);
        System.out.println("Precio de ventas incluido con impuestos = " + Pventa);
    }
}

