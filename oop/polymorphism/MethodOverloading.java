package oop.polymorphism;

public class MethodOverloading {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 6));
        System.out.println(c.add(5, 6, 7));
        System.out.println(c.add(5.5, 6.6));

    }
}
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
