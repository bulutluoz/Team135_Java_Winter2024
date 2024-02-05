package day17_constructors;

public class C03_KodOkuma {

    String isim = "atanmadi";
    String adres = "girilmedi";
    int yas;

    C03_KodOkuma(){
        yas = 40;
    }

    C03_KodOkuma(int yas){
        yas = 23;
        adres = "Cankaya";
    }

    C03_KodOkuma(String isim, String adres){
        this.isim = isim;
        this.adres = "Yenimahalle";
    }

    public static void main(String[] args) {

        C03_KodOkuma obj3 = new C03_KodOkuma("Ali","Cankaya");
        System.out.println(obj3.yas + "," + obj3.isim + "," + obj3.adres);
        // 0,Ali,Yenimahalle


        C03_KodOkuma obj2 = new C03_KodOkuma(44);
        System.out.println(obj2.yas + "," + obj2.isim + "," + obj2.adres);
        // 0,atanmadi,Cankaya

        C03_KodOkuma obj1 = new C03_KodOkuma();
        System.out.println(obj1.yas + "," + obj1.isim + "," + obj1.adres);
        // 40,atanmadi,girilmedi

    }

}
