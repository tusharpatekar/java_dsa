package oop.inheritance;

public class SimpleInheritance {

        public static void main(String[] args){
            FishSimple shark  = new FishSimple() ;

            shark.eat();
            shark.swim();

        }
}
    //base class
    class AnimalSimple{
        String color;

        void eat() {
            System.out.println("Animal eats");
        }

        void breathe() {
            System.out.println("Animal class Breathes");
        }
    }

    //Derived class
    class FishSimple extends AnimalSimple {

        int fins;

        void swim() {
            System.out.println("Swims in the water");
        }

    }

