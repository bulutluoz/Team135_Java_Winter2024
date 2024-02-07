package day19_staticKeywords_passByValue;

public class C02_StaticBlocks {

    /*
        static bloklar class calismaya basladiginda
        tum kod bloklarindan
        HATTA main method'dan bile once calisir

        EGER class calismaya baslamadan
        bazi ayarlarin yapilmasi
        bazi variable'lara database'den deger alinip atanmasi gibi...
        islemlere ihtiyac varsa static blok kullanilir

        birden fazla static blok varsa
        diger kod bloklarina gore DEGIL
        static blok'lar arasindaki siralamaya bakilir
        once ustteki static blok calisir

     */

    C02_StaticBlocks(){
        System.out.println("parametresiz constructor calisti");
    }
    C02_StaticBlocks(String isim){
        System.out.println("parametreli constructor calisti");
    }
    static {
        System.out.println("static blok 2 calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");
        method1();
        C02_StaticBlocks obj1 = new C02_StaticBlocks();

    }

    public static void method2(){
        System.out.println("method2 calisti");
    }
    public static void method1(){
        System.out.println("method1 calisti");
    }

    static {
        System.out.println("static blok calisti");
    }
}
//main method calisti
//method1 calisti
//parametresiz constructor calisti