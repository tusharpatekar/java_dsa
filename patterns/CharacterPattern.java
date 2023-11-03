public class CharacterPattern {
    public static void main(String[] args) {
        char a = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + "");
                a++;
            }
            System.out.println();

        }
    }

}
/*Output: */
/*
A
BC
DEF
GHIJ
 */