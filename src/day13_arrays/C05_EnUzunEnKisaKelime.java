package day13_arrays;

public class C05_EnUzunEnKisaKelime {

    public static void main(String[] args) {

        // Soru 6- Verilen String bir array’deki en uzun
        //         ve en kisa kelimeleri yazdiran bir method olusturun.

        String[] isimler = {"Gokcen","Berk","Murat","Selcuk","Muhammed","Ali"};

        enUzunEnKisayiYazdir(isimler);

    }

    public static void enUzunEnKisayiYazdir(String[] kelimeler){

        String enUzunKelime = kelimeler[0];
        String enKisaKelime = kelimeler[0];

        for (int i = 0; i < kelimeler.length ; i++) {

            if (kelimeler[i].length() > enUzunKelime.length()){

                enUzunKelime = kelimeler[i];
            }

            if (kelimeler[i].length() < enKisaKelime.length()){

                enKisaKelime = kelimeler[i];
            }

        }

        System.out.println("En uzun kelime : " + enUzunKelime);
        System.out.println("En kisa kelime : " + enKisaKelime);

    }
}
