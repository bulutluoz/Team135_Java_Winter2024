package day09_forLoop_methodOlusturma;

public class C11_MethodOlusturma {

    public static void main(String[] args) {

        String str = "Method Olusturma";

        // str'i buyuk harf olarak yazdirin
        System.out.println(str.toUpperCase()); // METHOD OLUSTURMA

        // str'i tamamen kucuk harflerden olusacak sekilde KAYDEDIN

        str = str.toLowerCase();

        System.out.println(str); // method olusturma


        System.out.println(str.substring(2)); // thod Olusturma


        System.out.println(str.charAt(0)); // M

        char sonHarf = str.charAt(str.length()-1);



    }
}
