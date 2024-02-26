package day29_exceptions_iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C09_Iterator_ElemanlariToplama {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>(Arrays.asList(9,3,5,4,6,6,7,8));

        // index kullanmadan, listedeki tum elementlerinin toplamini yazdirin

        Integer sayi = 0;
        Integer toplam = 0;

        Iterator itr = sayilar.iterator();

        while (itr.hasNext()){

            sayi = (Integer) itr.next();

            toplam += sayi;

        }

        System.out.println("Toplam : " + toplam); // Toplam : 48
    }
}
