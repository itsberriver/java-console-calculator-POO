package OPP_calculator;

public class Main {
    public static void main (String [] args){
        Operation op = new Operation();

        op.insertarNumeros();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
        op.mostrarResultados();
    }
}
