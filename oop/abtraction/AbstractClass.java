package oop.abtraction;

public class AbstractClass {

    public static void main(String[] args) {
       // Animal a = new Animal(); this gives error

        Horse h = new Horse();
        System.out.println(h.color);
        h.changeColor();
        System.out.println(h.color);
        h.eat();
        h.walk();

        Human human = new Human();
        human.eat();
        human.walk();
    }
}

abstract class Animal {       //this class cannot have instance
    String color;
    Animal () {
        color = "Brown";
    }
    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk(); // this is abstract method which give idea that every animal has walk method may be different for different animals
}

class Horse extends Animal {
    void changeColor() {
        color = "Dark Brown";
    }
    void walk() {  //this method must be in Horse class because it extends Animal class
        System.out.println("horse has 4 legs");
    }
}

class Human extends Animal {
    void changeColor() {
        color = "Skin";
    }
    void walk() {
        System.out.println("Human walk on 2 legs");
    }
}