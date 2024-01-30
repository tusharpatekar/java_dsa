public class StringCompression {


    public static String compression(String str) {
        StringBuilder newstr = new StringBuilder(" ");


        for (int i=0; i< str.length(); i++){
            Integer count = 1;
            while (i < str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            if(count >= 1) {
                newstr.append(str.charAt(i));
                newstr.append(count.toString());
            }
        }
        return newstr.toString();

    }
    public static void main(String[] args) {
        String str = "abbccddiii";
        System.out.println(compression(str));

    }
}