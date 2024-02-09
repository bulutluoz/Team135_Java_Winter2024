package day20_ImmutableClasses_dateTime;

public class C02_StringPool {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "Ali";
        String str3 = new String("Ali");
        String str4 = "A" + "li";
        String str5 = "A";
        String str6 = "li";
        String str7 = str5 + str6 ;
        String str8 = str5.concat(str6);

        System.out.println(str1.equals(str2)); // Ali <==> Ali true
        System.out.println(str1.equals(str3)); // Ali <==> Ali true
        System.out.println(str1.equals(str4)); // Ali <==> Ali true
        System.out.println(str1.equals(str7)); // Ali <==> Ali true
        System.out.println(str1.equals(str8)); // Ali <==> Ali true
        System.out.println(str1.equals("Ali")); // Ali <==> Ali true

        System.out.println("================");

        System.out.println(str1 == str2); // Ali <==> Ali true
        System.out.println(str1 == str3); // Ali <==> Ali false
        System.out.println(str1 == str4); // Ali <==> Ali true
        System.out.println(str1 == str7); // Ali <==> Ali false
        System.out.println(str1 == str8); // Ali <==> Ali false
        System.out.println(str1 == "Ali"); // Ali <==> Ali true

    }
}
