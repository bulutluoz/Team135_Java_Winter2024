package day11_whileLoop_doWhileLoop_scope;

public class C05_LocalVariables {

    /*
        Local variable'lar bir method veya kod blogu icerisinde olusturulan variable'lardir
          - Local variable'larin scope'u icinde olusturulduklari kod blogudur
            ve bu kod blogunun disinda KULLANILAMAZLAR
          - bir method icinde olusturulan loop gibi kod bloklari da local'dir
            o bloklarin icinde olusturulan variable'lar
            o bloklarin disinda kullanilamaz
          - Eger hep loop'un icinde hem de loop'un disinda kullanmak istedigimiz variable varsa
            bu variable'lari loop'dan once OLUSTURMALIYIZ
          - Local variable'lar deger atamasi olmadan deklare edilebilir
            ANCAK deger atamasi yapilmadan KULLANILAMAZ
     */


    public static void main(String[] args) {
        String str = "Java Candir";
        // System.out.println(sayi);
        // chr = 'k';

        for (int i = 0; i <10 ; i++) {

            boolean bl = true;
            System.out.println(i);
            System.out.println(bl);
            System.out.println(str);
            str= "Hava";
        }

        // System.out.println(i);
        // System.out.println(bl);

        String s;
        int a;
        char b;

        // System.out.println(s); // Variable 's' might not have been initialized
        // a++; // Variable 'a' might not have been initialized

    }


    public static void method1(){
        // System.out.println(str);
        int sayi = 20;
        //System.out.println(chr);
    }

    public void method2(){
        // str = "Hava";
        // sayi =30;
        char chr = 'a';

    }
}
