public class FirstLetterUppercase {

    public static String ToUppercase(String str){

        StringBuilder newstr = new StringBuilder(" ");

        newstr.append(Character.toUpperCase(str.charAt(0)));

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length()-1){
                newstr.append(str.charAt(i));
                i++;
                newstr.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                newstr.append(str.charAt(i));
            }
        }
        return newstr.toString();
    }
    public static void main(String[] args){
        String str = "hi, i am tushar";
       System.out.println(ToUppercase(str));

    }
}