package day16_foreachLoop_constructors;

import java.util.ArrayList;
import java.util.List;

public class C03_KelimeleriDuzenle {

    public static void main(String[] args) {

        //Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        //	        - Kelimenin uzunlugu cift sayi ise ilk yarisini
        //	        - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //	      yeni bir listeye ekleyip yazdirin.

        String[] isimler = {"Selcuk","Fuat","Berk","Muhammed","Bilal","Damra","Bugra"};

        List<String> duzenlenmisIsimler = new ArrayList<>();

        for ( String each: isimler
             ) {

            if (each.length() % 2 == 0 ){ // ismin uzunlugu cift sayi

                duzenlenmisIsimler.add( each.substring(0,each.length()/2));
            }else{//ismin uzunlugu tek sayi

                duzenlenmisIsimler.add(each.substring(each.length()/2));
            }
        }

        System.out.println(duzenlenmisIsimler);

    }
}
