package day16_foreachLoop_constructors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_arraydenTekrarEdenleriSilme {

    public static void main(String[] args) {
        //Soru 1- Verilen bir array’de tekrar eden elementler icin,
        //        tekrar edenleri silip,
        //        tum elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        Integer[] arr = {1,4,3,5,2,7,4,2,3,4,6,4,7,2,3,4,5,3,1,1,1,3};

        List<Integer> tekrarsizList = new ArrayList<>();

        for ( Integer each: arr
             ) {
            if (! tekrarsizList.contains(each)){
                tekrarsizList.add(each);
            }
        }

        System.out.println("Tekrarsiz list : " + tekrarsizList); // Tekrarsiz list : [1, 4, 3, 5, 2, 7, 6]

        arr = new Integer[tekrarsizList.size()]; // [null, null, null, null, null, null, null]


        for (int i = 0; i < arr.length ; i++) {

            arr[i] = tekrarsizList.get(i);
        }

        System.out.println("arr'nin son hali : " + Arrays.toString(arr));
        // arr'nin son hali : [1, 4, 3, 5, 2, 7, 6]
    }
}
