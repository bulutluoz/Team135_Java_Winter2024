package day06_stringManipulations;

public class C03_Equals_DoubleEqualSign {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "Ali";
        String str3 = new String("Ali");
        String str4 = "A" + "li";
        String s = "A";
        String t = "li";
        String str5 = s + t ;

        // == variable'lari karsilastirirken
        // hem referansa, hem de metne bakar

        System.out.println(str1 == str2); // Ali == Ali ==> true
        System.out.println(str1 == str3); // Ali == Ali ==> false
        System.out.println(str1 == str4); // Ali == Ali ==> true
        System.out.println(str1 == str5); // Ali == Ali ==> false

        System.out.println("=======");
        // equals() ve equalsIgnoreCase() sadece metne bakar
        System.out.println(str1.equals(str2)); // Ali <==> Ali ==> true
        System.out.println(str1.equals(str3)); // Ali <==> Ali ==> true
        System.out.println(str1.equals(str4)); // Ali <==> Ali ==> true
        System.out.println(str1.equals(str5)); // Ali <==> Ali ==> true

        System.out.println("=======");
        System.out.println(str1.equalsIgnoreCase(str2)); // Ali <==> Ali ==> true
        System.out.println(str1.equalsIgnoreCase(str3)); // Ali <==> Ali ==> true
        System.out.println(str1.equalsIgnoreCase(str4)); // Ali <==> Ali ==> true
        System.out.println(str1.equalsIgnoreCase(str5)); // Ali <==> Ali ==> true

    }
}
