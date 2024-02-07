package day19_staticKeywords_passByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class C07_PassByValue_List {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(1,4,5,8));

        System.out.println(sayilar); // [1, 4, 5, 8]

        // verilen listeye eleman olarak 10 ekleyip
        // listenin yeni halini yazdiran bir method olusturun
        elemanEkle(sayilar);
        System.out.println("eleman ekle method'undan sonra sayilar : " + sayilar);
        // eleman ekle method'undan sonra sayilar : [1, 4, 5, 8, 10]


        // verilen listedeki 2.indeksde bulunan sayiyi silip
        // listeyi yazdiran bir method olusturun
        elemanSil(sayilar);

        System.out.println("Eleman sil method'undan sonra sayilar : " + sayilar);
        // Eleman sil method'undan sonra sayilar : [1, 4, 8, 10]

        // verilen listeye esit elemanda random sayilar iceren bir list olusturup
        // eski listeye yeni olusturulan listeyi atayan
        // ve ilk listenin son halini yazdiran bir method olusturun

        yeniListOlustur(sayilar);

        System.out.println("yeni liste olustur methodundan sonra sayilar : " + sayilar);
        // yeni liste olustur methodundan sonra sayilar : [1, 4, 8, 10]

    }

    public static void yeniListOlustur(List<Integer> sayilar){

        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < sayilar.size() ; i++) {

            randomList.add(random.nextInt(100) );
        }

        sayilar = randomList;

        System.out.println("random liste olustur methodunda sayilar : " + sayilar);
        // random liste olustur methodunda sayilar : [74, 75, 89, 30]
    }







    public static void elemanSil(List<Integer> list){

        list.remove(2);
        System.out.println("elaman sil methodunda liste : " + list);
        // elaman sil methodunda liste : [1, 4, 8, 10]
    }





        public static void elemanEkle(List<Integer> sayilar){

            sayilar.add(10);

            System.out.println("method icinde sayilar : "+ sayilar);
            // method icinde sayilar : [1, 4, 5, 8, 10]
        }
}
