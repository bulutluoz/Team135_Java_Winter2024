package day30_listIterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C05_LinkedList_Queue {

    public static void main(String[] args) {

        /*
            Queue (Kuyruk) FIFO

            yeni gelenler standart olarak sona eklenir
            cikacaklar ise bas kisimdan cikarilir



         */

        Queue<Integer> sayilar = new LinkedList<>();

        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(10);
        sayilar.add(50);
        System.out.println(sayilar); // [20, 30, 10, 50]
        // kuyruk yapisindan dolayi araya ekleme yoktur

        sayilar.remove();
        // bize index yazma hakki tanimiyor, kuyruk yapisi geregi bastaki elemani siliyor

        System.out.println(sayilar); // [30, 10, 50]

        System.out.println(sayilar.remove()); // 30

        System.out.println(sayilar); // [10, 50]


        Queue<Integer> sayilar2 = new LinkedList<>();

        // sayilar2.remove(); // NoSuchElementException
        // bos bir listede kullanilirsa exception olusur



        System.out.println(sayilar); // [10, 50]

        sayilar.poll();

        System.out.println(sayilar); // [50]

        System.out.println(sayilar.poll()); // 50

        System.out.println(sayilar); // []

        System.out.println(sayilar.poll()); // null

        // queue'nun basindaki elementi siler ve bize dondurur
        // remove'dan farkli olarak
        // bos bir listede calistirirsak, exception olusmaz, null dondurur


        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(10);
        sayilar.add(50);
        System.out.println(sayilar); // [20, 30, 10, 50]

        sayilar.offer(25);

        System.out.println(sayilar); // [20, 30, 10, 50, 25]

        // listede bir kapasite sinirlamasi yoksa verilen elementi listeye ekler



        System.out.println(sayilar.peek()); // 20
        System.out.println(sayilar2.peek()); // null
        // listenin basindaki elementi, silmeden bize getirir
        // eger liste bos ise null dondurur


        System.out.println(sayilar.element()); // 20
        // System.out.println(sayilar2.element()); // NoSuchElementException

        // listenin basindaki elementi, silmeden bize getirir
        // eger liste bos ise NoSuchElementException verir


    }
}
