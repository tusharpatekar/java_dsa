package backTracking;

public class PossibleSubsetOfString {


    public static void findSubset(String str, String ans, int i){
        // Base case

        if(i == str.length()){
            if(ans.isEmpty()){
                System.out.println("null");
            }else{
                System.out.println(ans);

            }
            return;
        }

        // work starting
        //if choice is yes

        findSubset(str, ans+str.charAt(i), i+1);

        // if choice is no

        findSubset(str, ans, i+1);

    }

    public static void main(String[] args){

        String str = "abc";
        findSubset(str, "", 0);
    }
}
