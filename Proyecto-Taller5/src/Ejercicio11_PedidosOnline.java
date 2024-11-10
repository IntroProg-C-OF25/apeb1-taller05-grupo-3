
/**
 *Pedidos online: Desarrollar una solución que imprima el costo de un pedido de un artículo del cual se tiene la descripción,
 * la cantidad que se requiere y el precio unitario. Si la cantidad pedida excede de 50 unidades, se hace un descuento de 15%.
 *
 * @author Daniel Matute
 */
import java.util.Scanner;

public class Ejercicio11_PedidosOnline {

    public static void main(String[] args) {
        String descripcion;
        int cantidad;
        double precioUnitario, costoTotal;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Deme la descripcion del articulo: ");
        descripcion = tcl.nextLine();
        System.out.print("Deme la Cantidad de las unidades: ");
        cantidad = tcl.nextInt();
        System.out.print("Deme el precio unitario: ");
        precioUnitario = tcl.nextDouble();
        //Calcular sin descuento
        costoTotal = cantidad * precioUnitario;
        //Calculo aplicando el descuento
        if (cantidad > 50) {
            costoTotal = costoTotal * 0.85;
        }
        System.out.println("Detalles del pedido:");
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Costo total: $" + costoTotal);
    }
}
/***
 * run-single:
 *Deme la descripcion del articulo: hamburguesas
 *Deme la Cantidad de las unidades: 51
 *Deme el precio unitario: 5
 *Detalles del pedido:
 *Descripcion: hamburguesas
 *Cantidad: 51
 *Precio unitario: $5.0
 *Costo total: $216.75
 */
