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

    public void escogerOperacion() {


        System.out.println("Escoge una de las siguientes operaciones:");
    }
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

    public void resultadoSuma() {
        System.out.println("La suma es: " +suma);
    }

    public void resultadoResta() {
        System.out.println("La resta es: " +resta);
    }

    public void resultadoMultiplicacion() {
        System.out.println("La multiplicación es: " +multiplicacion);
    }

    public void resultadoDivision (){
        System.out.println("La división es: " +division);
    }
}
