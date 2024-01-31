package day15_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_ArrayiListeCevirme {

    public static void main(String[] args) {

        Integer[] arr = {3,4,5,6,7,8,9,6,5,4,4,3,1,2,3,4,5,6};

        // Bu array'i 3 sekilde list'e cevirebiliriz

        // 1- loop ile

        List<Integer> sayilar1 = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar1.add(arr[i]);
        }

        System.out.println(sayilar1); // [3, 4, 5, 6, 7, 8, 9, 6, 5, 4, 4, 3, 1, 2, 3, 4, 5, 6]

        sayilar1.add(10);
        sayilar1.remove(0);

        System.out.println(sayilar1); // [4, 5, 6, 7, 8, 9, 6, 5, 4, 4, 3, 1, 2, 3, 4, 5, 6, 10]


        // 2- arr'deki degerleri direk list olarak olusturabiliriz

        List<Integer> sayilar2 = new ArrayList<>(Arrays.asList(3,4,5,6,7,8,9,6,5,4,4,3,1,2,3,4,5,6));

        System.out.println(sayilar2); // [3, 4, 5, 6, 7, 8, 9, 6, 5, 4, 4, 3, 1, 2, 3, 4, 5, 6]

        sayilar2.add(20);
        sayilar2.remove(1);

        System.out.println(sayilar2); // [3, 5, 6, 7, 8, 9, 6, 5, 4, 4, 3, 1, 2, 3, 4, 5, 6, 20]


        // 3- direk arr'yi list'e cevirebiliriz
        //    ANCAK bu yontemin 2 buyuk yan etkisi var
        //     - bu sekilde olusturulan listede ekleme-silme gibi uzunlugu degistiren method'lar KULLANILAMAZ
        //     - bu yontemle atama yapildiginda java array ve list'i ilisiklendirir
        //       birinde yapilan degisiklik, otomatik olarak otekine de islenir

        List<Integer> sayilar3 = Arrays.asList(arr);

        System.out.println(sayilar3); // [3, 4, 5, 6, 7, 8, 9, 6, 5, 4, 4, 3, 1, 2, 3, 4, 5, 6]

        // sayilar3.add(30); // UnsupportedOperationException
        // sayilar3.remove(2); // UnsupportedOperationException

        // arr'in ilk elamanin degerini 20 yapalim
        arr[0] = 20;

        System.out.println("arrayde degisiklik yaptiktan sonra sayilar3 : "+ sayilar3);
        // [20, 4, 5, 6, 7, 8, 9, 6, 5, 4, 4, 3, 1, 2, 3, 4, 5, 6]
    }
}
