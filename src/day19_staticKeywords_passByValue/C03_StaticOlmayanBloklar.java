package day19_staticKeywords_passByValue;

public class C03_StaticOlmayanBloklar {

    /*
        EGER obje olusturmak istedigimizde, obje olusturulmadan
        bazi ayarlarin yapilmasi
        bazi variable'lara database'den deger alinip atanmasi gibi...
        islemlere ihtiyac varsa static olmayan blok kullanilir

        Yani
        static bloklar class calismaya baslamadan devreye girer,
        static olmayan bloklar ise constructor calismaya baslamadan devreye girer

     */

    {
        System.out.println("static olmayan blok calisti");
    }

    {
        System.out.println("static olmayan blok2 calisti");
    }

    C03_StaticOlmayanBloklar(){
        System.out.println("Constructor calisti");
    }


    public static void main(String[] args) {

        System.out.println("main method calisti");

        C03_StaticOlmayanBloklar obj1 = new C03_StaticOlmayanBloklar();
        C03_StaticOlmayanBloklar obj2 = new C03_StaticOlmayanBloklar();

    }
}
