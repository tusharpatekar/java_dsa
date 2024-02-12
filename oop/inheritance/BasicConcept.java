package oop.inheritance;

public class BasicConcept {
    public static void main(String[] args){
        Fish shark = new Fish();

        shark.eat();
        shark.swim();

    }


}
//base class
class Animal{
    String color;

    void eat() {
        System.out.println("Animal eats");
    }

    void breathe() {
        System.out.println("Animal class Breathes");
    }
}

//Derived class
class Fish extends Animal {

    int fins;

    void swim() {
        System.out.println("Swims in the water");
    }

}