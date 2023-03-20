import java.util.Scanner;

public class towerOfHanoi {
    public static void towerOfHanoi1(int n, String src, String Helper, String Dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + Dest);
            return;
        }
        towerOfHanoi1(n - 1, src, Dest, Helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + Dest);
        towerOfHanoi1(n - 1, Helper, src, Dest);
    }

    public static void main(String[] args) {
        System.out.println("enetr the number of tupples:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        towerOfHanoi1(n, "S", "H", "D");

    }
}
