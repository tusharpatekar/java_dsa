public class BasicStringBuilderOperation {

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Test");
        System.out.println(sb);

        System.out.println(sb.toString()); // toString convert any object into string but not like int a = 10 but if Integer a = 10 then it convert
        System.out.println(sb.append("append")); //append which append value on same location not going for new memory like String
    }
}