package OPP_calculator;

import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        String[] options = new String[4];
        options[0] = "0.sumar";
        options[1] = "1.restar";
        options[2] = "2.multiplicar";
        options[3] = "3.dividir";

        System.out.println("Digite el número de la opción que quiera realizar: ");
        System.out.println( options[0]);
        System.out.println( options[1]);
        System.out.println( options[2]);
        System.out.println( options[3]);
        int choosedOption = input.nextInt();

        Operation op = new Operation();
        op.insertarNumeros();
        if (choosedOption ==0){
            op.sumar();
            op.resultadoSuma();
        }
        if (choosedOption ==1){
            op.restar();
            op.resultadoResta();
        }
        if (choosedOption ==2){
            op.multiplicar();
            op.resultadoMultiplicacion();
        }
        if (choosedOption ==3){
            op.dividir();
            op.resultadoMultiplicacion();
        }
    }
}
