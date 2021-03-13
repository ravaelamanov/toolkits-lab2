public class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double multiply (double num1, double num2) {
        return num1 * num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double division(double num1, double num2) {
        return num1 / num2;
    }

    public double complexFunction(double val, double pow) {
        return Functions.sqrt(Functions.pow(val, pow)) * Functions.sin(val);
    }
}
