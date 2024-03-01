package day31_maps;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02_HashSet {

    public static void main(String[] args) {

        Set<Integer> sayilar = new HashSet<>();
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(30);
        sayilar.add(25);
        sayilar.add(12);


        System.out.println(sayilar); // [20, 25, 12, 30]

        sayilar.add(25);
        sayilar.add(12);

        System.out.println(sayilar); // [20, 25, 12, 30]

        // sayilar set'indeki cift sayilarin toplamini yazdirin

        int toplam = 0;

        for ( Integer each : sayilar
             ) {

            if (each % 2 == 0){
                toplam += each;
            }
        }

        System.out.println(toplam); // 62


        // set'deki tek sayilari silin

        /*
        for (Integer each : sayilar
             ) {
            if ( each %2 != 0){
                sayilar.remove(each);
            }
        }

         */

        Iterator iterator = sayilar.iterator();

        while (iterator.hasNext()){

            if (  (Integer)iterator.next() % 2 != 0 ){

                iterator.remove();
            }
        }


        System.out.println(sayilar); // [20, 12, 30]


        // Set'deki tum elementleri 2 artirin


        // Set index desteklemedigi icin for loop kullanamiyoruz
        // for-each loop ile degisiklikleri kaydetmek de mumkun degil
        // Iterator kullanabiliriz ama onda da deger degistirme yok
        // Bu sebeplerle, yeni bir set olusturup eski set'deki elemanlarin
        // 2'ser fazlalarini yeni set'e koyalim
        // sonra yeni set'i eski set'e atayalim

        Set<Integer> temp = new HashSet<>();

        for ( Integer each : sayilar
             ) {

            temp.add( each +2 );

        }

        sayilar = temp;

        System.out.println(sayilar); // [32, 22, 14]

    }
}
