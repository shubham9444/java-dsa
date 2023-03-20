public class firstAndLastIndex {
    public static int first = -1;
    public static int last = -1;

    public static void findIndexs(String str, char element, int index) {

        if (index == str.length()) {
            System.out.println(first);
            System.out.print(last);
            return;
        }

        if (str.charAt(index) == element) {
            if (first == -1) {
                first = index;

            } else {
                last = index;
            }
        }

        findIndexs(str, element, index + 1);
    }

    public static void main(String[] args) {
        String str = "tabcdaafhedsaad";
        char elemet = 'a';
        findIndexs(str, elemet, 0);
    }
}
