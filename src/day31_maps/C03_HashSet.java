package day31_maps;

import java.util.Arrays;
import java.util.HashSet;

public class C03_HashSet {

    public static void main(String[] args) {

        int[] arr = {2,4,5,6,7,5,3,2,4,6,8,9,7,2,3};

        // verilen array'deki tekrar eden sayilari silip
        // her sayinin sadece 1 kere bulundugu bir array yapin

        HashSet<Integer> tekrarsizSet = new HashSet<>();

        for (int each : arr
             ) {
            tekrarsizSet.add(each);

        }

        // System.out.println(tekrarsizSet); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        // array'deki elemntlerin unique olarak bulundugu bir set elde ettik
        // array'i bu hale dondurmeliyiz

        arr = new int[tekrarsizSet.size()];

        // set'deki herbir elemani alip array'e atayalim
        // set index desteklemez, array mutlaka index ister

        int index = 0;

        for (int each : tekrarsizSet
             ) {

            arr[index] = each;
            index++;
        }

        System.out.println("Array'in son hali : " + Arrays.toString(arr));

    }
}
