/**
 * @author nical
 */
public class TestCode {


    public static void main(String[] args) {
        String input = "aabbcccbbad";
        String result = calculate2(input);
        System.out.println(result);
    }

    public static String calculate1(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean changesMade;
        do {
            changesMade = false;
            StringBuilder temp = new StringBuilder();
            int i = 0;
            while (i < sb.length()) {
                int j = i;
                while (j < sb.length() && sb.charAt(j) == sb.charAt(i)) {
                    j++;
                }
                if (j - i < 3) {
                    temp.append(sb, i, j);
                } else {
                    changesMade = true;
                }
                i = j;
            }
            sb = temp;
            System.out.println(temp);
        } while (changesMade);

        return sb.toString();
    }

    public static String calculate2(String s) {
        StringBuilder sb = new StringBuilder(s);
        boolean changesMade;
        do {
            changesMade = false;
            StringBuilder temp = new StringBuilder();
            int i = 0;
            while (i < sb.length()) {
                int j = i;
                while (j < sb.length() && sb.charAt(j) == sb.charAt(i)) {
                    j++;
                }
                if (j - i >= 3) {
                    char replacement = (char) (sb.charAt(i) - 1);
                    if (replacement < 'a') {
                        replacement = 'a';
                    }
                    temp.append(replacement);
                    changesMade = true;
                } else {
                    temp.append(sb, i, j);
                }
                i = j;
            }
            sb = temp;
            System.out.println(temp);
        } while (changesMade);

        return sb.toString();
    }

}
