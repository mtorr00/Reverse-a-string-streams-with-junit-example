import java.util.Scanner;

public class ReverseStringStream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String tobeReversed = input.nextLine();
        System.out.println(reverseString(tobeReversed));
    }

    public static String reverseString(String s) {

        String answer = s.chars().mapToObj(y -> (char) y).reduce("", (x, y) -> y + x, (x, y) -> y + x);

        return answer;
    }
}
