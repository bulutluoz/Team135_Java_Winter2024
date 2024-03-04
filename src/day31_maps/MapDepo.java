package day31_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDepo {

    // Bu class Ogrenci map'i ile kullanabilecegimiz
    // method'lari depolamak icin olusturuldu

    // Map olusturup, donduren method olusturalim

    public static Map<Integer,String>  mapOlustur(){

        Map<Integer, String> ogrenciMap = new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");
        ogrenciMap.put(107,"Esra-Han-11-M-SOZ");

        return ogrenciMap;
    }

    public static String getBolum(Map<Integer,String> ogrenciMap, Integer istenenNo){

        String istenenNoValue = ogrenciMap.get(istenenNo); // Sevgi-Cem-11-M-TM

        String[] istenenValueArr = istenenNoValue.split("-"); // [Sevgi, Cem, 11, M, TM]

        return istenenValueArr[4];
    }

    public static String getSinif(Map<Integer,String> ogrenciMap, int istenenNo){

        String istenenOgrValue = ogrenciMap.get(istenenNo) ; // "Ali-Cem-11-K-TM"

        String[] istenenValueArr = istenenOgrValue.split("-"); // [Ali, Cem, 11, K, TM]

        return istenenValueArr[2]; // 11
    }

    public static String getData(Map<Integer,String> ogrenciMap, int istenenNo, String istenenBilgi){
        // verilen bir ogrenci map'inde
        // istenen numaradaki ogrencinin
        // Isim,Soyisim,Sinif,Sube veya Bolum bilgisini dondursun

        String istenenOgrValue = ogrenciMap.get(istenenNo) ; // "Ali-Cem-11-K-TM"

        String[] istenenValueArr = istenenOgrValue.split("-"); // [Ali, Cem, 11, K, TM]


        switch (istenenBilgi.toUpperCase()){

            case "ISIM" :
                return istenenValueArr[0];

            case "SOYISIM" :
                return istenenValueArr[1];

            case "SINIF" :
                return istenenValueArr[2];

            case "SUBE" :
                return istenenValueArr[3];

            case "BOLUM" :
                return istenenValueArr[4];

            default:
                return "Yanlis bilgi istegi";
        }



    }

    public static void sinifSubeListesiYazdir(Map<Integer,String> ogrenciMap, Integer sinif , String sube){

        // 1- tum ogrencileri gozden gecirebilmek icin
        //    once tum ogrenci numaralarini elde etmeliyim
        Set<Integer> ogrenciNoSeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106, 107]

        // 2- bu Key'leri kullanarak her bir key icin value'lari bize getirecek
        //    bir for-each loop olusturalim

        System.out.println("No Isim  Soyisim");
        System.out.println("================");

        for ( Integer eachKey: ogrenciNoSeti
             ) { // 101
            // 3- for-each loop'da gelen ogrenci numarasina ait value'yu kaydedelim
            String eachvalue = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF

            // 4- value'daki bilgilere erisebilmek icin
            //    value'yu array'e cevirelim

            String[] valueArr = eachvalue.split("-"); // [Ali, Can, 11, H, MF]

            // 5- istenen sartlari kontrol edip,
            //    istenen sartlari saglayan ogrencilerin
            //    numara, isim ve soyisimlerini yazdiralim

            if ( valueArr[2].equals(sinif+"") && valueArr[3].equalsIgnoreCase(sube)){

                System.out.println(
                        eachKey+ " " +       // ogrenci no
                        valueArr[0] + " " +  // ogrenci isim
                        valueArr[1]          // ogrenci soyisim

                );

            }


        }
    }

    public static void isimSoyisimIleOgrenciBilgiYazdir(Map<Integer,String> ogrenciMap,String isim, String soyisim){

        // 1- tum key'leri kaydet
          Set<Integer> ogrenciNoSet = ogrenciMap.keySet();

        // 2- tum key'lere ait value'lari gozden gecirmek icin for-each loop olustur
        System.out.println("No Sinif  Sube Bolum");

        for ( Integer ogrenciNo : ogrenciNoSet
             ) { // 101

            // 3- for-each'in getirdigi no'daki ogrenci value'sunu kaydet
            String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Can-11-H-MF

            // 4- ogrenci value'sundeki bilgilere ulasmak icin array'e cevir
            String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5- parametre olarak yollanan bilgilere uyan ogrencilerin
            //    istenen bilgilerini yazdir
            if (ogrenciValueArr[0].equalsIgnoreCase(isim) &&
                ogrenciValueArr[1].equalsIgnoreCase(soyisim)){

                System.out.println(
                        ogrenciNo + "  "+
                        ogrenciValueArr[2] + "    "+
                        ogrenciValueArr[3] + "    "+
                        ogrenciValueArr[4]
                );

            }


        }

    }

    public static void sinifListesiYazdir(Map<Integer,String> ogrenciMap, Integer sinif){

        // 1- tum key'leri kaydet
        Set<Integer> ogrenciNoSet = ogrenciMap.keySet();

        // 2- tum key'lere ait value'lari gozden gecirmek icin for-each loop olustur
        System.out.println("No Sube Isim Soyisim ");

        for (Integer ogrenciNo : ogrenciNoSet
             ) {

            // 3- for-each'in getirdigi no'daki ogrenci value'sunu kaydet
            String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Can-11-H-MF

            // 4- ogrenci value'sundeki bilgilere ulasmak icin array'e cevir
            String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5- parametre olarak yollanan bilgilere uyan ogrencilerin
            //    istenen bilgilerini yazdir

            if (ogrenciValueArr[2].equals(sinif+"")){

                System.out.println( ogrenciNo + "  " + ogrenciValueArr[3] + "  " +
                                    ogrenciValueArr[0] + " " + ogrenciValueArr[1] );
            }
        }


    }

    public static void soyisimIleOgrenciListele(Map<Integer,String> ogrenciMap,String soyisim){

        // 1- tum key'leri kaydet
        Set<Integer> ogrenciNoSet = ogrenciMap.keySet();

        // 2- tum key'lere ait value'lari gozden gecirmek icin for-each loop olustur
        System.out.println("No Sube Isim Soyisim ");

        for (Integer ogrenciNo : ogrenciNoSet
             ) {

            // 3- for-each'in getirdigi no'daki ogrenci value'sunu kaydet
            String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Can-11-H-MF

            // 4- ogrenci value'sundeki bilgilere ulasmak icin array'e cevir
            String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5- parametre olarak yollanan bilgilere uyan ogrencilerin
            //    istenen bilgilerini yazdir

            if (ogrenciValueArr[1].equalsIgnoreCase(soyisim)){

                System.out.println( ogrenciNo + "  " + ogrenciValueArr[3] + "  " +
                                    ogrenciValueArr[0] + " " + ogrenciValueArr[1]);
            }


        }

    }

    public static Map<Integer, String> subeDegistir(Map<Integer, String> ogrenciMap, String eskiSube, String yeniSube) {

        // 1- tum key'leri kaydet
        Set<Integer> ogrenciNoSet = ogrenciMap.keySet();

        // 2- tum key'lere ait value'lari gozden gecirmek icin for-each loop olustur

        for (Integer ogrenciNo : ogrenciNoSet
             ) {

            // 3- for-each'in getirdigi no'daki ogrenci value'sunu kaydet
            String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Can-11-H-MF

            // 4- ogrenci value'sundeki bilgilere ulasmak icin array'e cevir
            String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5- parametre olarak gonderilen bilgilerle
            //    array'de istenen update'i yap

                if (ogrenciValueArr[3].equalsIgnoreCase(eskiSube)){
                    ogrenciValueArr[3] = yeniSube;
                }
            // 6- array'de yaptigimiz degisikligi, map'e kaydedebilmek icin
            //    array'i yeniden String ogrenci value'sunun formatina getir

            String yeniValue =  String.join("-",ogrenciValueArr);

            // 7- ogrenciNo ve yeniValue'yu ogrenciMap'e ekleyelim
            ogrenciMap.put(ogrenciNo,yeniValue);
        }
        return ogrenciMap;
    }
}
