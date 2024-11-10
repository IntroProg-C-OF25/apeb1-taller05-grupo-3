
/**
 *Sistema de reservas hoteleras: En una hosteria de la ciudad de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días,
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días. Elaborar un solución que pida como datos de entrada el número de días
 * y el precio diario de la habitación y luego calcule e imprima el subtotal por pagar, el descuento y el total por pagar.
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio_ReservaHoteles {

    public static void main(String[] args) {
        int dias;
        double precioDiario, subTotal, descuento, total;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme el numero de dias de hospedaje: ");
        dias = tcl.nextInt();
        System.out.print("Deme el precio diario por la habitacion: ");
        precioDiario = tcl.nextDouble();
        subTotal = dias * precioDiario;
        descuento = 0;
        if (dias > 5) {
            descuento = subTotal * 0.10;
        }
        if (dias > 10) {
            descuento = subTotal * 0.15;
        }
        if (dias > 15) {
            descuento = subTotal * 0.20;
        }
        total = subTotal - descuento;
        System.out.println("Detalles de la reserva: ");
        System.out.println("Subtotal a pagar es de :$ " + subTotal);
        System.out.println("Descuento aplicado es de :$ " + descuento);
        System.out.println("El total a pagar es :" + total);

    }

}
/***
 * run-single:
 *Deme el numero de dias de hospedaje: 16
 *Deme el precio diario por la habitacion: 10
 *Detalles de la reserva: 
 *Subtotal a pagar es de :$ 160.0
 *Descuento aplicado es de :$ 32.0
 *El total a pagar es :128.0
 */