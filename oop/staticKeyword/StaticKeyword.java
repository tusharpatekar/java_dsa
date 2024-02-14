package oop.staticKeyword;

public class StaticKeyword {

    public  static void main(String[] args) {

        Student s1 = new Student();
        s1.schoolName = "Sanjivani";
        System.out.println(s1.schoolName);
        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println( s2.percentage(10, 20, 30));


    }
}

class  Student {
    int rollNo;
    String name;
    static String schoolName; // declaration of static variable

    static int percentage ( int phy, int chem, int math) {         // Static function
        return (phy + chem + math) / 3;
    }



    void setName(String name) {
        this.name = name;
    }
    void getName() {
         System.out.println(this.name);
    }
}