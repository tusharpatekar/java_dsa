import java.util.Scanner;

public class BasicStringOperation{
    public static void main(String[] args){
        String name = "Hello";
        String name1 = new String("world");

        System.out.println(name + " " + name1);

        Scanner sc = new Scanner(System.in);

//        String halfName = sc.next(); // .next accept  single word
//        System.out.println(halfName);

        String fullName = sc.nextLine(); // this accepts full line
        System.out.println(fullName);


        System.out.println(fullName.length()); //length of string
        System.out.println(fullName.charAt(2));


        String concatenation = name + name1; //String concatenation
        System.out.println(concatenation);

    }
}