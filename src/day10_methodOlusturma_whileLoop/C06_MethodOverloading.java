package day10_methodOlusturma_whileLoop;

public class C06_MethodOverloading {

    public static void main(String[] args) {


        topla(6); // Tek integer : 12
        topla(3,5); // int int : 8
        topla(6.3,5); // double int : 11.3
        topla(2.4F,5);// float int : 7.4
        topla(2.3,3.4); // double double : 5.699999999999999
        topla('a',5); // int int : 102
        topla(2.3f,3.5f); // double double : 5.799999952316284
        topla(4,5.2); // double double : 9.2

    }

    public static void topla(int sayi){ // topla int

        System.out.println("Tek integer : " + (sayi + sayi));

    }//1  topla int

    public static void topla(int a, int b){ // topla int int

        System.out.println("int int : " + (a+b));
    }//2  topla int int

    public static void topla(double c, int d){ // topla double int

        System.out.println("double int : " + (c+d));
    }//3 topla double int

    public static void topla(float c, int d){ // topla float int

        System.out.println("float int : " + (c+d));
    }//4 topla float int

    public static void topla(double c, double d){ // topla double double

        System.out.println("double double : " + (c+d));
    }//5 topla double double
}
