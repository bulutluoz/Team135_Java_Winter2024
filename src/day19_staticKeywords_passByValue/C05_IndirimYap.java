package day19_staticKeywords_passByValue;

public class C05_IndirimYap {

    public static void main(String[] args) {

        /*
            1- bu karar bizim verecegimiz bir karar degildir
               Yazilim dilleri tercihlerini yaparlar
            2- PassByValue : method'lar arasinda variable gecisi yaptigimizda
                             variable'in kendisinin degil
                             degerinin(value) gecis yapmasini tercih etmistir
            3- PassByValue'nun dogal sonucu olarak
               baska method'da ayni isimde variable kullansak da
               her local variable kendi scope'unda gecerli olacagindan
               method'da yapilan degisiklik method'da kalir
            4- Baska method'da yapilan degisikligin kalici olmasini istersek
               method'dan yeni degeri dondurup
               asil scope'da atama yapabiliriz
         */



        // Main method’da verilen fiyat degerine %10, %20 ve %30 indirim yaparak,
        // indirimli fiyati bize döndüren 3 method olusturun.
        // Main method’dan bu 3 method’u arka arkaya cagirip,
        // return edilen fiyatlari yazdirin.

        int fiyat = 500;

        System.out.println("%10 idirimli fiyat : " + yuzde10Indirimyap(fiyat)); // 450
        System.out.println("%20 idirimli fiyat : " + yuzde20Indirimyap(fiyat)); // 400
        System.out.println("%30 idirimli fiyat : " + yuzde30Indirimyap(fiyat)); // 350

        System.out.println("indirimli yazdirilan fiyatlardan sonra fiyat : " + fiyat); // 500

    }

    public static int yuzde10Indirimyap(int fiyat){

        fiyat = fiyat * 90 / 100 ;

        return fiyat;
    }

    public static int yuzde20Indirimyap(int fiyat){

        fiyat = fiyat * 80 / 100 ;

        return fiyat;
    }

    public static int yuzde30Indirimyap(int fiyat){

        fiyat = fiyat * 70 / 100 ;

        return fiyat;
    }
}
