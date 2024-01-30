import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String word = sc.nextLine();
        int flag = 0;

        for(int i=0; i<=word.length()/2; i++){
            if(word.charAt(i) == word.charAt(word.length() - i - 1)){
                flag = 1;
            }
            else {
                flag = 0;
            }

        }

        if (flag == 1){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("It not a palindrome");
        }
    }

}