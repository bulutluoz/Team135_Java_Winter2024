package day14_arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C09_TumElemanlariKullanma {

    public static void main(String[] args) {

        int[] arr = {3,5,6,7,2,3,4,5,6,7,8,2,3,4,5,6,7};

        List<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }

        System.out.println(sayilar); // [3, 5, 6, 7, 2, 3, 4, 5, 6, 7, 8, 2, 3, 4, 5, 6, 7]

        // sayilar listesindeki tum elementlerin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < sayilar.size() ; i++) {

            toplam += sayilar.get(i) ;
        }

        System.out.println("Listedeki sayilarin toplami : " + toplam);
        // Listedeki sayilarin toplami : 83


        // Listedeki cift sayi adedini yazdirin

        int sayac = 0;

        for (int i = 0; i <sayilar.size() ; i++) {

            if (sayilar.get(i) % 2 == 0){
                sayac++;
            }
        }

        System.out.println("Listedeki cift sayi adedi : " + sayac);
        // Listedeki cift sayi adedi : 8


        // listedeki tek sayilarin ortalamasini ondalikli olarak yazdirin

        double tekSayilarinToplami = 0;
        int tekSayiAdedi = 0;

        for (int i = 0; i < sayilar.size() ; i++) {

            if ( sayilar.get(i) % 2 != 0){

                tekSayilarinToplami += sayilar.get(i);
                tekSayiAdedi++;
            }
        }

        System.out.println("Listedeki " + tekSayiAdedi + " adet tek sayinin ortalamasi : "
                             + tekSayilarinToplami/tekSayiAdedi);

        // Listedeki 9 adet tek sayinin ortalamasi : 5.0


        // Listedeki 5'den kucuk sayilarin carpimini yazdirin

        int carpim = 1;

        for (int i = 0; i < sayilar.size() ; i++) {

            if (sayilar.get(i) < 5){
                carpim *= sayilar.get(i);
            }
        }

        System.out.println("Listedeki 5'den kucuk sayilarin carpimi : " + carpim);
        // Listedeki 5'den kucuk sayilarin carpimi : 1728


    }
}
