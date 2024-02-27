package day30_listIterator_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(2,5,7,8,1,3,4));

        // verilen listedeki tum elementleri, index kullanmadan 2 artirin

        ListIterator lit = sayilar.listIterator();

        while (lit.hasNext()){

            lit.set( (Integer)lit.next()+2   );
        }

        System.out.println(sayilar); // [4, 7, 9, 10, 3, 5, 6]


        // listede var olan her element'den sonra
        // elementin 1 fazlasi degere sahip yeni bir element ekleyin
        // [4, 5, 7, 8, 9, 10, 10, 11, 3, 4, 5, 6, 6, 7]



        lit = sayilar.listIterator();

        while (lit.hasNext()){

            lit.add((Integer)lit.next()+1);

        }
        System.out.println(sayilar);

    }
}
