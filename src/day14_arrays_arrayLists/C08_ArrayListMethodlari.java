package day14_arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C08_ArrayListMethodlari {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();

        System.out.println(sayilar); // []

        System.out.println(sayilar.size()); // 0

        System.out.println(sayilar.isEmpty()); // true

        sayilar.add(10);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(8);

        System.out.println(sayilar); // [10, 5, 3, 8]

        System.out.println(sayilar.size()); // 4

        System.out.println(sayilar.isEmpty()); // false


        // bu listede eleman olarak 3 var mi ?

        System.out.println(sayilar.contains(3)); // true

        // ilk index'deki elemani yazdirin

        System.out.println(sayilar.get(0)); // 10

        // son elementi yazdirin

        System.out.println(sayilar.get(sayilar.size() - 1)); // 8


    }
}
