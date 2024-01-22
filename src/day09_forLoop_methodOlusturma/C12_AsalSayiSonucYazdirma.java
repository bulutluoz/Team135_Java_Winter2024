package day09_forLoop_methodOlusturma;

public class C12_AsalSayiSonucYazdirma {

    public static void main(String[] args) {

        // Verilen sayinin asal sayi olup olmadigini kontrol edip,
        // sonuc olarak “asal sayi” veya “asal sayi degil” yazdiran
        // bir method olusturun

        asalSayiMiSonucYazdir(15); // Verilen 15 sayisi asal degil
        asalSayiMiSonucYazdir(37); // Verilen 37 sayisi asal
        asalSayiMiSonucYazdir(9973); // Verilen 9973 sayisi asal

    }


    public static void asalSayiMiSonucYazdir(int sayi){

        for (int i = 2; i <=sayi ; i++) {

            if (i == sayi){
                System.out.println("Verilen "+ sayi+" sayisi asal");
            } else if ( sayi % i == 0) {
                System.out.println("Verilen "+sayi+" sayisi asal degil");
                break;
            }

        }
    }


}
