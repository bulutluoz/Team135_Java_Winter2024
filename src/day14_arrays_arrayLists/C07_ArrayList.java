package day14_arrays_arrayLists;

import java.util.ArrayList;
import java.util.List;


public class C07_ArrayList {

    public static void main(String[] args) {

        // ArrayList Array altyapisini kullanir
        // ama ekleme ve silme yapmaya musaade eder
        // yani esnek yapidaki bir array gibidir

        List<Integer> sayilar = new ArrayList<>(); // Type argument cannot be of primitive type

        System.out.println(sayilar); // []

        sayilar.add(5);
        sayilar.add(8);
        sayilar.add(3);

        System.out.println(sayilar); // [5, 8, 3]

        // 5 ile 8'in arasinda 4 ekleyelim

        sayilar.add(1,4);

        System.out.println(sayilar); // [5, 4, 8, 3]

    }
}
