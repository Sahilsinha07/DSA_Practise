
// to check if the string is pallindrome or not which means the reverse of the string is same or not
import java.util.Scanner;

public class interviewquestions {
    public static Scanner sc = new Scanner(System.in);

    public static boolean reverese(String str) {
        String original = str;
        StringBuilder reversed = new StringBuilder(original);
        reversed.reverse();
        if (original.equals(reversed.toString())) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        String str = sc.nextLine();
        System.out.println(reverese(str)); // we cannont call non static objects directly unless we have made a object
                                           // of them
    }

}
