package day31_maps;

public class C04_JavaRunTimeProgramdir {

    public static void main(String[] args) {

        /*
         Java run time bir programdir
         Yani biz run tusuna bastigimizda
         Java herseyi sifirdan baslatir,
         olusturdugumuz tum variable'lar ve objeler
         Java calismaya devam ettigi surece saklanir,
         uzerlerinde yapilan tum degisikler muhafaza edilir

         ama calisma durdugu anda java her seyi sifirlar
         */


        int sayi = 10;

        System.out.println(sayi); // 10

        sayi++;
        sayi++;
        sayi++;
        // sayi deger atamasi oldugundan kalici olarak 13 olur

        System.out.println(sayi);  // 13

    }
}
