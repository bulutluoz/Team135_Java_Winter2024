package day11_whileLoop_doWhileLoop_scope;

public class C06_ClassLevelVariables {

    /*
        Class level variable'lar adindan da anlasilacagi uzere
        class'in icinde ama tum kod bloklarinin disinda olusturulur.
          - Class Level variable'lar class'in en ustunde olusturulmak zorunda degillerdir
            AMAAA genel bir kabul olarak, rahatlikla gorulmesi acisindan en ustte olusturulurlar
          - Class level'da olusturulan variable'lar kullanim amacina bagli olarak
            static keywordu kullanabilirler. Local variable'lar static olarak isaretlenemez
          - static olarak isaretlenmeyen variable'lara instance variable'lar denir
          - Class level variable'lar ister static olsun ister instance olsun, scope'lari tum class'dir
            yani Tum class'dan kullanilabilirler.
            ANCAK
              - static variable'lar her yerden direk kullanilabilirler
              - instance variable'lar ise
          - Class level variable'lar ister static, ister instance olsun
            deger atamasi olmadan deklare edilebilir ve KULLANILABILIRLER
            Eger biz deger atamadan class level variable'lari kullanirsak
            Java her data turu icin belirledigi default degerleri atama yapar
            Java'nin default olarak belirledigi degerler :
            char ==> hiclik
            boolean ==> false
            sayisal primitive'ler ==> 0
            non-primitive'ler ==> null
     */

    String str1 = "Java";
    static int sayi1 = 10;
    static char a;
    static boolean b;
    static String c ;
    static int d;
    static double e;

    public static void main(String[] args) {
        // static int a = 20;
        System.out.println(sayi1); // sayi1 static oldugu icin her yerden direk kullanilabilir
        //System.out.println(str1); // str1 instance oldugundan method secici olur
                                    // main method static oldugu icin str1'i kabul etmez

        System.out.println("char : "+a);
        System.out.println("boolean : "+b);
        System.out.println("String : "+ c);
        System.out.println("int : "+d);
        System.out.println("double : "+e);



    }

    public static void method1(){
        sayi1 = 20; // sayi1 static oldugu icin her yerden direk kullanilabilir
        // str1 ="tava";  // str1 instance oldugundan method secici olur
                          // method1 static oldugu icin str1'i kabul etmez
    }

    public void method2(){
        sayi1 = 30; // sayi1 static oldugu icin her yerden direk kullanilabilir
        System.out.println(sayi1);
        System.out.println(str1); // str1 instance oldugundan method secici olur
                                  // method2 de secici olmadigindan str1'i kabul eder
    }

}
