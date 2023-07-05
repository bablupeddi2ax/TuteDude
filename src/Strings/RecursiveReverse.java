package Strings;

public class RecursiveReverse {

    public static void main(String[] args) {
        String s = "The book is on the table";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        if (s.isBlank()) {
            return "";
        } else {
            int lastSpaceIndex = s.lastIndexOf(" ");
            if (lastSpaceIndex == -1) {
                return s;
            } else {
                String lastWord = s.substring(lastSpaceIndex + 1);
                return lastWord + " " + reverseWords(s.substring(0, lastSpaceIndex));
            }
        }
    }
}
