package oop.polymorphism;

import java.net.StandardSocketOptions;

public class MethodOverriding {
    public static void main (String[] args) {
        Deer obj = new Deer();
        obj.eat();
        obj.eat();

    }
}

class Animal {
    void eat() {
        System.out.println("Animal can eats every things");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Deer eats grass");
    }
}