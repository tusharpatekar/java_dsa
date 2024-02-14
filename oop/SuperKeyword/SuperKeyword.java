package oop.SuperKeyword;

public class SuperKeyword {
    public static void main(String[] args) {
        Dog d1 = new Dog();


    }
}

class Animal {
    Animal(){
        System.out.println("This animals constructor");
    }

}

class  Dog extends Animal {
    Dog() {
        super();
        System.out.println("this dogs constructor");
    }
}