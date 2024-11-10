
/** Categoría de Edad: Clasificar a una persona en una categoría de edad
 * (niño, adolescente, adulto) en función de su edad.
 *
 * @author Chente15
 */
import java.util.Scanner;
public class Categoria_Edad {

    public static void main(String[] args) {
        int Edad;
        String categoria;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Dame la edad");
        Edad = tcl.nextInt();
        if (Edad < 13) {
            categoria = "Niño";
        }
        if (Edad >= 13 && Edad < 18) {
            categoria = "Adolescente";
        } else {
            categoria = "Adulto";
        }

        System.out.println("La categoría de edad es: " + categoria);
    }
}
//Dame la edad
//15
//La categor�a de edad es: Adolescente
