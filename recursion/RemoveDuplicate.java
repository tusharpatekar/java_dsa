package recursion;

public class RemoveDuplicate {

    public static void removeDuplicate(String str, int idx, StringBuilder newStr, Boolean[] map) {

        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }

        char currentChar = str.charAt(idx);

        if (map[currentChar - 'a'] != null && map[currentChar - 'a']) {
            removeDuplicate(str, idx + 1, newStr, map);
        } else {
            if (map[currentChar - 'a'] == null) {
                map[currentChar - 'a'] = true;
            }
            removeDuplicate(str, idx + 1, newStr.append(currentChar), map);
        }

    }

    public static void main(String[] args) {

        String str = "intercollegiate";

        removeDuplicate(str, 0, new StringBuilder(), new Boolean[26]);

    }
}
