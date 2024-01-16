package day06_stringManipulations;

public class C02_Equals {

    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "ali";
        String str3 = "ALI";
        String str4 = "ALi";
        String str5 = "Ali ";
        String str6 = "Ali";

        // equals() buyuk kucuk harfe dikkat ederek (case sensitive)
        // metinlerin ayni olup olmadigini kontro eder
        System.out.println(str1.equals(str2)); // Ali <==> ali ==> false
        System.out.println(str3.equals(str2)); // ALI <==> ali ==> false
        System.out.println(str3.equals(str4)); // ALI <==> ALi ==> false
        System.out.println(str1.equals(str5)); // "Ali" <==> "Ali " ==> false
        System.out.println(str1.equals(str6)); // Ali <==> Ali ==> true

        System.out.println("===========");
        // equalsIgnoreCase() ise buyuk kucuk harfe dikkat etmeden (case sensitive olmadan)
        // metinlerin ayni olup olmadigini kontro eder
        System.out.println(str1.equalsIgnoreCase(str2)); // Ali <==> ali ==> true
        System.out.println(str3.equalsIgnoreCase(str2)); // ALI <==> ali ==> true
        System.out.println(str3.equalsIgnoreCase(str4)); // ALI <==> ALi ==> true
        System.out.println(str1.equalsIgnoreCase(str5)); // "Ali" <==> "Ali " ==> false
        System.out.println(str1.equalsIgnoreCase(str6)); // Ali <==> Ali ==> true


    }
}
