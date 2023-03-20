import java.util.Scanner;

// import javafx.scene.SceneAntialiasing;

public class StringsHW {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // int number = sc.nextInt();

        // String arr[] = new String[number];

        // int arrayLength = 0;

        // for (int i = 0; i < number; i++) {
        // arr[i] = sc.nextLine();
        // arrayLength = arrayLength + arr[i].length();
        // }

        // System.out.println(arrayLength);

        // replace original string

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // String result = "";

        // for (int i = 0; i < name.length(); i++) {
        // if (name.charAt(i) == 'e') {
        // result = result + 'i';
        // } else {
        // result = result + name.charAt(i);
        // }
        // }

        // System.out.println(result);

        // Scanner sc = new Scanner(System.in);
        // String email = sc.nextLine();
        // String userName = "";

        // for (int i = 0; i < email.length(); i++) {
        // if (email.charAt(i) != '@') {
        // userName += email.charAt(i);
        // } else {
        // break;
        // }
        // }

        // System.out.println(userName);

        StringBuilder sb = new StringBuilder("shubham");
        String reverse = "";

        for (int i = sb.length() - 1; i >= 0; i--) {
            reverse = reverse + sb.charAt(i);
        }

        System.out.print(reverse);

    }
}
