import java.util.Scanner;

public class Stringss {
    public static void main(String[] args) {
        // String name1 = "shubham";
        // String name2 = "vaghela";

        // concatination
        // System.out.println(name1 + name2);

        // print length of strings

        // String fullname = "vaghela shubham";
        // System.out.println(fullname.length());

        // taking input in strings

        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();

        // for (int i = 0; i < name.length(); i++) {
        // System.out.println(name.charAt(i));
        // }
        // compare strings
        String name1 = "shubham";
        String name2 = "shubham";

        if (name1.compareTo(name2) == 0) {
            System.out.println("string is equal");
        } else {
            System.out.println("string is not equal");
        }

        if (name1 == name2) {
            System.out.println("string is equal");
        } else {
            System.out.println("string is not equal");
        }

        if (new String("shubham") == new String("Shubham")) {
            System.out.println("string is equal");
        } else {
            System.out.println("string is not equal");
        }
        if (new String("shubham").compareTo(new String("shubham")) == 0) {
            System.out.println("string is equal");
        } else {
            System.out.println("string is not equal");
        }
    }
}
