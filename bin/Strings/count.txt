package Strings;

public class Count {

    public static void main(String[] args) {
        String a = "Example1@gmail.com";
        int uc = 0;
        int lc = 0;
        int sc = 0;
        int nc = 0;

        for (int i = 0; i < a.length(); i++) {
            if (Character.isLowerCase(a.charAt(i))) {
                lc++;
                System.out.println("lowercase: " + a.charAt(i));
            } else if (Character.isUpperCase(a.charAt(i))) {
                uc++;
                System.out.println("uppercase: " + a.charAt(i));
            } else if (Character.isDigit(a.charAt(i))) {
                nc++;
                System.out.println("digit: " + a.charAt(i));
            } else {
                sc++;
                System.out.println("special: " + a.charAt(i));
            }
        }

        System.out.println("LowerCase Count: " + lc);
        System.out.println("UpperCase Count: " + uc);
        System.out.println("Number Count: " + nc);
        System.out.println("Special Character Count: " + sc);
    }
}
