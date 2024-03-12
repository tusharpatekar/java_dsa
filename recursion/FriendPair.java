package recursion;

public class FriendPair {


    public static int friendPair(int n) {
        if (n==1 || n==2)
            return n;

        int fmn1 = friendPair(n-1);
        int fmn2 = friendPair(n-2);

        int pair = (n-1) * fmn2;

        return  fmn1 + pair;
    }
    public static void main(String[] args){

        System.out.println(friendPair(3));

    }
}
