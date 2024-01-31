package day15_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArrayListmethodlari {

    public static void main(String[] args) {

        List<String> isimler = new ArrayList<>();

        isimler.add("Damra");
        isimler.add("Gokcen");
        isimler.add("Baris");
        isimler.add("Fuat");

        System.out.println(isimler); //  [Damra, Gokcen, Baris, Fuat]

        isimler.add(2,"Bugra"); // gokcen ve baris arasina bugra'yi ekler

        System.out.println(isimler); // [Damra, Gokcen, Bugra, Baris, Fuat]

        // 2.index'deki ismi Furkan yapin

        isimler.set(2,"Furkan");
        // set() verilen index'deki elementi verilen yeni deger olarak update eder
        //       ve silinen eski elementi bize döndürür

        System.out.println(isimler); // [Damra, Gokcen, Furkan, Baris, Fuat]

        System.out.println(isimler.set(3, "Ali")); // Baris

        System.out.println(isimler); // [Damra, Gokcen, Furkan, Ali, Fuat]


        // Ali'yi silin

        System.out.println(isimler.remove("Ali")); // true

        System.out.println(isimler); // [Damra, Gokcen, Furkan, Fuat]

        // "Ceren" i silin

        System.out.println(isimler.remove("Ceren")); // false
        // verilen isim listede varsa silip, true dondurur
        //         isim listede yoksa silemez ve false dondurur

        System.out.println("Ceren'den sonra : " + isimler); // Ceren'den sonra : [Damra, Gokcen, Furkan, Fuat]


       // verilen isim listede varsa silsin
       // yoksa verilen isim hatali, listede bulunamadi yazdirsin

       String silinecekIsim = "Kemal";

       if ( ! isimler.remove(silinecekIsim) ){
           System.out.println("verilen "+silinecekIsim+" ismi hatali, listede bulunamadi");
       } // verilen Kemal ismi hatali, listede bulunamadi

        System.out.println(isimler); // [Damra, Gokcen, Furkan, Fuat]

        System.out.println(isimler.remove(0)); // Damra

        // verilen index'deki ismi siler
        // ve bize silinen ismi dondurur

        System.out.println(isimler); // [Gokcen, Furkan, Fuat]


        // isimler.remove(10); // IndexOutOfBoundsException


        List<Integer> sayilar = new ArrayList<>(Arrays.asList(3,4,3,5,6,7,9));

        System.out.println(sayilar); // [3, 4, 3, 5, 6, 7, 9]

        sayilar.remove(3); // 3.index'deki 5'i siler

        System.out.println(sayilar); // [3, 4, 3, 6, 7, 9]

        // sayilar.remove(9); // IndexOutOfBoundsException

        // Listemiz sayilardan olusuyorsa,
        // bir sayi yazdigimizda obje mi index mi ? diye suphe olmamasi icin
        // Java otomatik olarak girilen sayiyi index kabul eder
        // Eger siz obje olarak 9'u silmek isterseniz
        // once bir variable olarak olusturmalisiniz

        Integer silinecekSayi = 9;

        sayilar.remove(silinecekSayi);

        System.out.println(sayilar); // [3, 4, 3, 6, 7]



    }
}
