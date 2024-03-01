package day31_maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class C05_MapOlusturma {

    public static void main(String[] args) {

        // Biz ogrenci bilgilerini tutan bir map olusturacagiz
        // map no,isim,soyisim,sinif,sube ve bolum bilgilerini tutacak
        // bu bilgilerden no, map'in key'i olacak
        // kalan isim,soyisim,sinif,sube ve bolum bilgilerini bir String olarak birlestirip value yapacagiz
        // birlestirirken "isim-soyisim-sinif-sube-bolum" seklinde birlestirecegiz

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        System.out.println(ogrenciMap);
        /*
            {
               101=Ali-Can-11-H-MF,
               102=Veli-Cem-10-K-TM,
               103=Ali-Cem-11-K-TM,
               104=Ayse-Can-10-H-MF,
               105=Sevgi-Cem-11-M-TM,
               106=Sevgi-Can-10-K-MF,
               107=Esra-Han-11-M-SOZ}
         */

        // ogrenci map'indeki key'leri yazdirin

        System.out.println(ogrenciMap.keySet()); // [101, 102, 103, 104, 105, 106, 107]

        // 103 numarali ogrencinin value'sunu yazdirin

        System.out.println(ogrenciMap.get(103)); // Ali-Cem-11-K-TM

        // key olmadan, sadece value'lari bir liste olarak yazdirin

        System.out.println(ogrenciMap.values());
        // [Ali-Can-11-H-MF, Veli-Cem-10-K-TM, Ali-Cem-11-K-TM, Ayse-Can-10-H-MF, Sevgi-Cem-11-M-TM, Sevgi-Can-10-K-MF, Esra-Han-11-M-SOZ]


        // map'de 105 numarali ogrenci var mi ?

        System.out.println(ogrenciMap.containsKey(105)); // true

        // map'de ismi Ali olan bir ogrenci var mi ?
        // containsValue() value'deki isim,sinif gibi detaylari arayamaz
        // value olarak kaydedilen butunu arayabilir

        System.out.println(ogrenciMap.containsValue("Ali")); // false
        System.out.println(ogrenciMap.containsValue("Ali-Cem-11-K-TM")); // true


        // 104 numarali ogrencinin soyismini yazdirin  104=Ayse-Can-10-H-MF,
        // Map'de value'yu birden fazla bilginin birlesimi olan bir String olarak kullandik
        // Map'de amac kolay erisim degil, daha fazla bilgi tutmaktir
        // Tutulan bilgilere ulasmak, kodu yazan kisilerin gorevidir

        String tumValue104 = ogrenciMap.get(104); // Ayse-Can-10-H-MF

        String[] value104Arr = tumValue104.split("-"); // // [Ayse, Can, 10, H, MF]

        System.out.println("104 numarali ogrenci isim : " + value104Arr[0]);
        System.out.println("104 numarali ogrenci soyisim : " + value104Arr[1]);
        System.out.println("104 numarali ogrenci sinif : " + value104Arr[2]);
        System.out.println("104 numarali ogrenci sube : " + value104Arr[3]);
        System.out.println("104 numarali ogrenci bolum : " + value104Arr[4]);


    }
}
