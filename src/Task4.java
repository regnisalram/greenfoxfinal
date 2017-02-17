
/**
 * Created by regnisalram on 2/17/17.
 */
public class Task4 {

    public static void main(String[] args) {
        System.out.println(reverseString("Green Fox"));
        System.out.println(countLetters("duck"));
    }

    private static String reverseString(String input) {
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
        }
        return output;
    }

    private static int countLetters(String input) {
        int output = 0;
        for (int i = 0; i < input.length(); i++) {
            output += 1;
        }
        return output;
    }

}