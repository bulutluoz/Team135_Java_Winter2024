package day13_arrays;

public class C03_ElemanKullanimSayisiniBulma {

    public static void main(String[] args) {

        //Soru 4- Verilen bir array’de
        //        istenen bir elemanin var olup olmadigini
        //        ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr = {3,4,5,1,2,4,6,7,4,3,2,5,6,7,8,1,2,3,4,5};

        elemanSayisiYazdir(arr,3); // Verilen 3 sayisi, array'de 3 kere kullanilmis.

        elemanSayisiYazdir(arr,8); // Verilen 8 sayisi, array'de 1 kere kullanilmis.

        elemanSayisiYazdir(arr, 10); // Verilen sayi array'de hic kullanilmamis

    }


    public static void elemanSayisiYazdir(int[] arr , int arananSayi){

        int sayac = 0;

        for (int i = 0; i < arr.length ; i++) {

            if ( arr[i] == arananSayi){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Verilen sayi array'de hic kullanilmamis");
        }else {
            System.out.println("Verilen " + arananSayi + " sayisi, array'de " + sayac + " kere kullanilmis.");
        }
    }
}
