public class revString {

    public static void RevString(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        RevString(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        RevString(str, str.length() - 1);
    }
}
