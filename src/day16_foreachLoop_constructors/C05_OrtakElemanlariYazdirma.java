package day16_foreachLoop_constructors;

import java.util.ArrayList;
import java.util.List;

public class C05_OrtakElemanlariYazdirma {

    public static void main(String[] args) {
        //Soru 5- Verilen iki array’in elementlerini karsilastirip,
        //        ikisinde ortak olan elementleri
        //        ayri bir liste olarak veren bir program yazin.

        int[] arr1 = {3,6,9,1,3,9,3,3,5,5,5,5};
        int[] arr2 = {5,3,1,4,7,8,8,6,7,6,7,8};

        List<Integer> ortakElementlerListesi = new ArrayList<>();


        for (int each1 : arr1
             ) {
            for ( int each2: arr2
                 ) {

                if (each1 == each2 && !ortakElementlerListesi.contains(each1)){
                    ortakElementlerListesi.add(each1);
                }
            }
        }

        System.out.println("Ortak elementler : " + ortakElementlerListesi);
     }
}








