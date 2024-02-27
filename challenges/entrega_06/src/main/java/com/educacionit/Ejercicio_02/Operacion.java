package com.educacionit.Ejercicio_02;

public class Operacion {
    private double a;
    private double b;
    private char operador;

    public Operacion(double a, double b, char operador) {
        this.a = a;
        this.b = b;
        this.operador = operador;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public char getOperador() {
        return operador;
    }

    public double suma() {
        return (a + b);
    }

    public double resta() {
        return (a - b);
    }

    public double producto() {
        return (a * b);
    }

    public double division() {
        if (b == 0) {
            throw new ArithmeticException("No se puede realizar la división por cero.");
        }
        return (a / b);
    }

    public double resto() {
        if (b == 0) {
            throw new ArithmeticException("No se puede realizar el resto con el valor cero");
        }
        return (a % b);
    }

    @Override
    public String toString() {
        return "Operacion: " + a + " " + operador + " " + b + " = ";
    }

}
