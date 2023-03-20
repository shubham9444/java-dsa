import java.util.Scanner;

public class arraySearching {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int arr[] = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }

        int searchNumber = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (searchNumber == arr[i]) {
                System.out.println("element is found is index number" + i);
            }
        }
    }
}
