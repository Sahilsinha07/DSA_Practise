import java.util.Scanner;

class Revision2 {
    private static Scanner sc = new Scanner(System.in);

    // tower of hanoi
    private static void tower(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Trasnfer disc " + n + "from " + source + "to " + destination);
            return;
        }
        tower(n - 1, source, destination, helper);
        System.out.println("Trasnfer disc " + n + "from " + source + "to " + destination);
        tower(n - 1, helper, source, destination);

    }

    public static void main(Strings args[]) {
        int n = sc.nextInt();
        tower(n, "Source", "Helper", "Destination");
    }
}