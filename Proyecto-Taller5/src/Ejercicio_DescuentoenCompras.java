
/** *
 * Descuento en compras: Calcular el precio final de un producto con un descuento del 10% si el precio original es mayor de 100;
 * de lo contrario, no hay descuento.
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Ejercicio_DescuentoenCompras {

    public static void main(String[] args) {
        double preciOriginal, descuento, precioFinal;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame el precio original del producto: ");
        preciOriginal = tcl.nextInt();
        descuento = 0;
        if (preciOriginal > 100) {
            descuento = preciOriginal * 0.10;
            precioFinal = preciOriginal - descuento;
            System.out.println("Precio original: $" + preciOriginal);
            System.out.println("Descuento aplicado: $" + descuento);
            System.out.println("Precio final: $" + precioFinal);
        }

    }

}
//run-single:
//Deme el precio original del producto: 120
//Precio original: $120.0
//Descuento aplicado: $12.0
//Precio final: $108.0
