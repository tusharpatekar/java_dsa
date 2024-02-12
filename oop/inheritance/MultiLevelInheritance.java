package oop.inheritance;

public class MultiLevelInheritance {
    public static void main(String[] args){
        Shark shark  = new Shark() ;

        shark.eats();
        shark.swim();
        shark.eat();

    }
}
class AnimalMultiLevel {
    String color;

    void eats() {
        System.out.println("Animal eats");
    }

    void breathe() {
        System.out.println("Animal class Breathes");
    }
}

//Derived class
class FishMultiLevel extends AnimalMultiLevel {

    int fins;

    void swim() {
        System.out.println("Swims in the water");
    }

}

class Shark extends FishMultiLevel {
    void eat() {
        System.out.println("Shark eats");
    }
}