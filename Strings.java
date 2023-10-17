
// check if the string is pallindrome or not
import java.util.Scanner;

public class Strings {

    public static Scanner sc = new Scanner(System.in);

    public static boolean checkPallindrome(String str) {
        StringBuffer reverse = new StringBuffer(str);
        reverse.reverse();
        String newStr = reverse.toString();
        return str.equals(newStr);

    }

    public static void main(String args[]) {
        if (checkPallindrome(sc.nextLine())) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }

    }
}