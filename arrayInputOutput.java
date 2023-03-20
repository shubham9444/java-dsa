import java.util.Scanner;

public class arrayInputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int array[] = new int[number];
        // input array
        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }
        // output arrays
        for (int i = 0; i < number; i++) {
            System.out.print(array[i]);
        }
    }
}
