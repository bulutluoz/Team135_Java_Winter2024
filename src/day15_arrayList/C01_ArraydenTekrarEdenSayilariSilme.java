package day15_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_ArraydenTekrarEdenSayilariSilme {

    public static void main(String[] args) {

        // verilen bir int array'deki tekrar eden sayilari silip
        // array'i unique sayilardan olusan hale donusturun
        // input :  {3,5,6,7,2,3,4,5,6,7,8,2,3,4,5,6,7};
        // output : {3,5,6,7,2,4,8}

        int[] sayilar = {3,5,6,7,2,3,4,5,6,7,8,2,3,4,5,6,7};

        List<Integer> tekrarsizList = new ArrayList<>();

        for (int i = 0; i < sayilar.length ; i++) {

            if (!tekrarsizList.contains(sayilar[i])){

                tekrarsizList.add(sayilar[i]);
            }
        }

        System.out.println("Tekrarsiz liste : " + tekrarsizList);
        // Tekrarsiz liste : [3, 5, 6, 7, 2, 4, 8]


        sayilar = new int[tekrarsizList.size()]; // [0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i < sayilar.length; i++) {

            sayilar[i] = tekrarsizList.get(i);
        }

        System.out.println("Sayilar array'inin son hali : " + Arrays.toString(sayilar));


    }
}
