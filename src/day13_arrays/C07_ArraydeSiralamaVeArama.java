package day13_arrays;

import java.util.Arrays;

public class C07_ArraydeSiralamaVeArama {

    public static void main(String[] args) {

        int[] arr = {9,4,6,1,14};

        String[] isimler = { "Ali", "Adnan","Ahmet","Mahmut","Mehmet","Metin"};

        Arrays.sort(arr);

        Arrays.sort(isimler);

        // Arrays.sort() verilen array'i NATURAL ORDER'a uygun olarak duzenler
        // Metinlerde kucuk harf ve buyuk harf var ise ascii degerine gore dusunur

        System.out.println(Arrays.toString(arr)); // [1, 4, 6, 9, 14]

        System.out.println(Arrays.toString(isimler)); // [Adnan, Ahmet, Ali, Mahmut, Mehmet, Metin]


        int[] sayilar = {6,1,13,5,8,2};

        // bu array'de 5 var mi ?
        C03_ElemanKullanimSayisiniBulma.elemanSayisiYazdir(sayilar,5);
        // Verilen 5 sayisi, array'de 1 kere kullanilmis.

        // bu array'de 10 var mi ?
        C03_ElemanKullanimSayisiniBulma.elemanSayisiYazdir(sayilar,10);
        // Verilen sayi array'de hic kullanilmamis

        System.out.println(Arrays.binarySearch(sayilar, 5)); // -1
        System.out.println(Arrays.binarySearch(sayilar, 13)); // 2
        System.out.println(Arrays.binarySearch(sayilar,6)); // 0
        System.out.println(Arrays.binarySearch(sayilar,2)); // -1
        System.out.println(Arrays.binarySearch(sayilar,1)); // -1
        System.out.println(Arrays.binarySearch(sayilar,8)); // -3

        // binarySearch()'un saglikli calismasi icin, once array sort yapilmalidir
        // sort yapilmadan binarySearch() calistirilirsa, sonucu ongoremeyiz
        // dogru sonucu da verebilir, yanlis sonuc da verebilir

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar)); //  [1, 2, 5, 6, 8, 13]

        System.out.println(Arrays.binarySearch(sayilar, 5)); // 2
        System.out.println(Arrays.binarySearch(sayilar, 13)); // 5
        System.out.println(Arrays.binarySearch(sayilar,6)); // 3
        System.out.println(Arrays.binarySearch(sayilar,2)); // 1
        System.out.println(Arrays.binarySearch(sayilar,1)); // 0
        System.out.println(Arrays.binarySearch(sayilar,8)); // 4

        System.out.println(Arrays.binarySearch(sayilar, -5));// -1
        System.out.println(Arrays.binarySearch(sayilar, 0)); // -1
        System.out.println(Arrays.binarySearch(sayilar, 7)); // -5
        System.out.println(Arrays.binarySearch(sayilar, 9)); // -6
        System.out.println(Arrays.binarySearch(sayilar, 11)); // -6
        System.out.println(Arrays.binarySearch(sayilar, 15)); // -7
        System.out.println(Arrays.binarySearch(sayilar, 50)); // -7

        // binarySearch() array'de olan elementlerin INDEX'ini verir
        // OLMAYAN elementler icin, olsaydi HANGI SIRADA olacagini - isaretle verir

    }
}
