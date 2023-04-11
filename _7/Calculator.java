package javaOopAdvanced._7;

// You can change any code in this class if you think there is a bug!
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        int risultato = 0;

        if (b == 0 || a == 0){
            risultato=0;
        }else { risultato = a/b;}
            return risultato;
    }

    public double power(double base, double exponent) {
            double risultato = 0;
        if (exponent == 0||base==1.00){
            risultato=1;
        } else  {
            risultato = Math.pow(base, exponent);
        }
        return risultato;
    }
}



