package day31_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.SplittableRandom;

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

    public static Map<Integer, String> numaraIleSoyisimDegistir(Map<Integer, String> ogrenciMap, int ogrenciNo, String yeniSoyisim) {

        // verilen ogrenciNo'ya ait value'yu kaydedelim

        String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Can-11-H-MF

        // value'deki bilgilere erismek ve update edebilmek icin array'e cevirelim

        String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Can, 11, H, MF]

        // array'de istenen degisikligi yapalim

        ogrenciValueArr[1] = yeniSoyisim;

        // 6- array'de yaptigimiz degisikligi, map'e kaydedebilmek icin
        //    array'i yeniden String ogrenci value'sunun formatina getir

        String yeniValue =  String.join("-",ogrenciValueArr);

        // 7- ogrenciNo ve yeniValue'yu ogrenciMap'e ekleyelim
        ogrenciMap.put(ogrenciNo,yeniValue);

        return ogrenciMap;
    }

    public static Map<Integer, String> isimSoyisimDuzenle(Map<Integer, String> ogrenciMap) {

        // 1- tum key'leri kaydet
        Set<Integer> ogrenciNoSet = ogrenciMap.keySet();

        // 2- tum key'lere ait value'lari gozden gecirmek icin for-each loop olustur

        for (Integer ogrenciNo: ogrenciNoSet
             ) {
            // 3- for-each'in getirdigi no'daki ogrenci value'sunu kaydet
            String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Can-11-H-MF

            // 4- ogrenci value'sundeki bilgilere ulasmak icin array'e cevir
            String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5- parametre olarak gonderilen bilgilerle
            //    array'de istenen update'i yap

            ogrenciValueArr[0] = ogrenciValueArr[0].substring(0,1).toUpperCase()+
                                 ogrenciValueArr[0].substring(1).toLowerCase();

            ogrenciValueArr[1] = ogrenciValueArr[1].toUpperCase();
            // 6- array'de yaptigimiz degisikligi, map'e kaydedebilmek icin
            //    array'i yeniden String ogrenci value'sunun formatina getir

            String yeniValue =  String.join("-",ogrenciValueArr);

            // 7- ogrenciNo ve yeniValue'yu ogrenciMap'e ekleyelim
            ogrenciMap.put(ogrenciNo,yeniValue);

        }
        return ogrenciMap;
    }

    public static Map<Integer, String> yilSonuSinifArtirma(Map<Integer, String> ogrenciMap) {

        // 1- tum key'leri kaydet
        Set<Integer> ogrenciNoSet = ogrenciMap.keySet();

        // 2- tum key'lere ait value'lari gozden gecirmek icin for-each loop olustur

        for (Integer ogrenciNo: ogrenciNoSet
        ) {
            // 3- for-each'in getirdigi no'daki ogrenci value'sunu kaydet
            String ogrenciValue = ogrenciMap.get(ogrenciNo); // Ali-Can-11-H-MF

            // 4- ogrenci value'sundeki bilgilere ulasmak icin array'e cevir
            String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Can, 11, H, MF]

            // 5- parametre olarak gonderilen bilgilerle
            //    array'de istenen update'i yap

            switch (ogrenciValueArr[2]){ // sinif bilgisine gore

                case "9" :
                    ogrenciValueArr[2]="10";
                    break;
                case "10" :
                    ogrenciValueArr[2]="11";
                    break;
                case "11" :
                    ogrenciValueArr[2]="12";
                    break;
                case "12" :
                    ogrenciValueArr[2]="Mezun";

            }

            // 6- array'de yaptigimiz degisikligi, map'e kaydedebilmek icin
            //    array'i yeniden String ogrenci value'sunun formatina getir

            String yeniValue =  String.join("-",ogrenciValueArr);

            // 7- ogrenciNo ve yeniValue'yu ogrenciMap'e ekleyelim
            ogrenciMap.put(ogrenciNo,yeniValue);

        }

        return ogrenciMap;
    }

    public static Map<Integer, String> topluBolumDegistir(Map<Integer, String> ogrenciMap, String eskiBolum, String yeniBolum) {

        // 1- tum entry'leri almak icin entrySet olusturalim
        Set<Map.Entry<Integer,String>> ogrenciEntrySeti = ogrenciMap.entrySet();

        // 2- tum entry'leri elden gecirmek icin for-each loop olusturalim
        for (Map.Entry<Integer,String>  eachEntry : ogrenciEntrySeti
             ) {
            // 3- value'deki bilgilere erisebilmek icin value'yu array olarak kaydedelim
            String[] valueArr = eachEntry.getValue().split("-");  // [Ali, Can, 11, H, MF]

            // 4- array'de istenen update'i yap
            if (valueArr[4].equalsIgnoreCase(eskiBolum)){ // [Ali, Can, 11, H, SAY]
                valueArr[4]=yeniBolum;
            }

            // 5- update edilen array'i entry'nin value'su olarak set edelim

            eachEntry.setValue( String.join("-",valueArr)  );
        }

        return ogrenciMap;
    }

    public static Map<Integer, String> setData(Map<Integer, String> ogrenciMap, int ogrenciNo, String degisecekBilgi, String yeniDeger) {

        // 1- ogrenci numarasi verilen ogrencinin value'sunu String olarak kaydedelim
        String ogrenciValue = ogrenciMap.get(ogrenciNo);

        // 2- ogrenci value'sundaki bilgilere ulasabilmek icin array'e split edelim
        String[] ogrenciValueArr = ogrenciValue.split("-"); // [Ali, Can, 11, H, SAY]

        switch (degisecekBilgi.toLowerCase()){

            case "isim" :
                ogrenciValueArr[0] = yeniDeger;
                break;
            case "soyisim" :
                ogrenciValueArr[1] = yeniDeger;
                break;
            case "sinif" :
                ogrenciValueArr[2] = yeniDeger;
                break;
            case "sube" :
                ogrenciValueArr[3] = yeniDeger;
                break;
            case "bolum" :
                ogrenciValueArr[4] = yeniDeger;
        }

        // 3- array'de degisiklik yaptik, array'in yeni halini yeni value olarak kaydedelim
        String yeniValue = String.join("-",ogrenciValueArr);

        // 4- Ogrenci no ve yeni value ile map'i update edelim
        ogrenciMap.put(ogrenciNo,yeniValue);

        return ogrenciMap;
    }
}
