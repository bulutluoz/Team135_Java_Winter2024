package day06_stringManipulations;

public class C04_Substring {
    public static void main(String[] args) {

        String str = "Java Guzeldir";

        System.out.println(str.substring(2)); // va Guzeldir
        System.out.println(str.substring(0)); // Java Guzeldir

        // substring kullanarak son harfi yazdirin
        System.out.println(str.substring(str.length() - 1)); // r

        // son 3 harfi yazdirin
        System.out.println(str.substring(str.length() - 3)); // dir

        // son 5 harfi yazdirin
        System.out.println(str.substring(str.length() - 5)); // eldir

        // str.substring(20); // StringIndexOutOfBoundsException
        // degerden kaynaklanan hatalari Java Compile ederken farketmez
        // calistirinca 20.index'e ulasmak istediginde
        // 20.index'in sinirlar disinda oldugunu farkeder ve
        // Run Time Error RTE verir

        // str = 56; Compile Time Error CTE
        // string str4 = "Java";  CTE

    }
}
