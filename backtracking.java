// import java.util.Scanner;
class backtracking {
    // private static Scanner sc = new Scanner(System.in);
    private static void printPermutiation(String str, String perm, int index) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            printPermutiation(newstr, perm + currentChar, index + 1);
        }
    }

    public static void main(String args[]) {
        String strii = "ABC";
        printPermutiation(strii, " ", 0);
    }
}