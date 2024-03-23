package backTracking;

public class PossiblePermutation {

    public static void findPermutation(String str, String ans){
        // base case

        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        // recursion
        for (int i = 0; i<str.length(); i++){
            char current = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            findPermutation(newStr, ans+current);
        }
    }

    public static void main(String[] args){
        String str = "abc";
        findPermutation(str, "");
    }
}
