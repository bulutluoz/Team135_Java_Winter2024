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

        // List<Integer> list1 = new List<>(); // 'List' is abstract; cannot be instantiated

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);

        System.out.println(list2); // [10, 20]

        List<Integer> list3 = new ArrayList<Integer>(); // Explicit type argument Integer can be replaced with <>

        sayilar.addAll(list2);

        System.out.println(sayilar); // [5, 4, 8, 3, 10, 20]

        // list2'nin elementlerini sayilarin en basina ekleyin

        sayilar.addAll(0,list2);

        System.out.println(sayilar); // [10, 20, 5, 4, 8, 3, 10, 20]
    }
}
