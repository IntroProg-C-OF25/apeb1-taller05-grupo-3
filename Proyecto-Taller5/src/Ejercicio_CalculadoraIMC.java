/*
 * Calculadora de IMC: Calcular el índice de masa corporal (IMC) de una persona y clasificarla en función de su valor 
(bajo peso, peso normal, sobrepeso, etc.).

/**
 *
 * @author Chente15
 */
import java.util.Scanner;

public class Ejercicio_CalculadoraIMC {

    public static void main(String[] args) {
        double peso, altura, IMC;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Dame la altura en metros");
        altura = tcl.nextDouble();
        System.out.println("Dame el peso en kilogramos");
        peso = tcl.nextDouble();
        IMC = peso / (altura * 2);
        System.out.println("El IMC es = " + IMC);
        if (IMC < 18.5) {
            System.out.println("Bajo peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Peso normal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }

}
//run-single:
//Dame la altura en metros
//1,80
//Dame el peso en kilogramos
//50
//El IMC es = 13.88888888888889
//Bajo peso
