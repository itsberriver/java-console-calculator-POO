package OPP_calculator;

import javax.swing.*;

public class Operation {
    //Atributos
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;

    //Métodos
    public void insertarNumeros() {

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Inserte un número"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Inserte otro número"));
    }

    public void sumar() {
        suma = numero1+numero2;
    }

    public void restar() {
        resta = numero1-numero2;
    }

    public void multiplicar() {
        multiplicacion = numero1*numero2;
    }

    public void dividir() {
        division = numero1/numero2;
    }

    public void mostrarResultados() {
        System.out.println("La suma es: " +suma);
        System.out.println("La resta es: " +resta);
        System.out.println("La multiplicación es: " +multiplicacion);
        System.out.println("La división es: " +division);
    }
}
