import java.lang.reflect.Array;

/**
 * Created by regnisalram on 2/17/17.
 */
public class Task2 {

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3},
                          {4, 5, 6}};
        System.out.println(reverseString("Green Fox"));
        System.out.println(countLetters("duck"));
        System.out.println(addNumbersInMatrix(matrix));
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

    private static int addNumbersInMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}
