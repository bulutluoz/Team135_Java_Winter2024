package day22_stringBuilder_accessModifier_encapsulation;

public class C06_RaporErisim {

    public static void main(String[] args) {

        C05_RaporClass obj = new C05_RaporClass();

        // satis tutari ve toplam satis tutari variable'larini
        // private yaptigimiz icin normal yollarla
        // bu variable'lara ulasilamaz


        // obj.satisTutari = 10; // olsun
        // System.out.println(obj.satisTutari);// olmasin

        // obj.toplamSatisTutari = 30; // olmasin
        // System.out.println(obj.toplamSatisTutari);// olsun

        obj.setSatisTutari(30);
        obj.setSatisTutari(40);
        obj.setSatisTutari(20);
        obj.setSatisTutari(10);

        System.out.println(obj.getToplamSatisTutari());// 100


    }

}
