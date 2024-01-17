package day07_StringManipulations;

public class C04_isEmpty_isBlank {

    public static void main(String[] args) {

        String str1 = "";
        String str2 = " ";
        String str3 = "    ";
        String str4 = "  .  ";

        System.out.println(str1.isEmpty()); // true
        System.out.println(str2.isEmpty()); // false
        System.out.println(str3.isEmpty()); // false
        System.out.println(str4.isEmpty()); // false

        System.out.println(str4.isBlank()); // false
        System.out.println(str3.isBlank()); // true
        System.out.println(str2.isBlank()); // true
        System.out.println(str1.isBlank()); // true

    }
}
