package day30_listIterator_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C06_LinkedList_Deque {

    public static void main(String[] args) {

        // Deque ==> Double Ended Queue ==> Iki uclu kuyruk

        Deque<Integer> sayilar = new LinkedList<>();
        System.out.println(sayilar.add(10)); // true
        sayilar.add(20);
        sayilar.add(60);
        sayilar.add(50);

        System.out.println(sayilar); // [10, 20, 60, 50]

        // Deque double ended queue oldugundan
        // hemen hemen butun methodlarin ...first() ve ...last() versiyonlari bulunur

        sayilar.addFirst(70);
        sayilar.addLast(90);

        System.out.println(sayilar); // [70, 10, 20, 60, 50, 90]

        sayilar.addFirst(20);
        sayilar.addLast(70);
        System.out.println(sayilar); // [20, 70, 10, 20, 60, 50, 90, 70]


        // removeFirstOccurrence(20) 20'nin ilk kullanimini siler
        // ve delil olarak true dondurur,
        // eger verilen eleman listede olmadigindan silinemezse, delil olarak false dondurur
        System.out.println(sayilar.removeFirstOccurrence(20));  // true
        System.out.println(sayilar); // [70, 10, 20, 60, 50, 90, 70]

        System.out.println(sayilar.removeFirstOccurrence(44)); // false

        System.out.println(sayilar.removeLastOccurrence(70)); // true
        System.out.println(sayilar); // [70, 10, 20, 60, 50, 90]


        // ilk elementi silip bize dondurur
        // removeFirst() ile ayni islevi yapar
        // bos bir listede calistirilirsa NoSuchElementException verir
        System.out.println(sayilar.pop()); // 70

        // listenin basina element ekler
        // addFirst() ile ayni isleve sahiptir
        sayilar.push(25);
        System.out.println(sayilar); // [25, 10, 20, 60, 50, 90]

        // ilk elementi silmeden bize getirir
        // peekFirst'den farki bos deque olunca exception firlatmasidir

        System.out.println(sayilar.getFirst()); // 25
        System.out.println(sayilar); // [25, 10, 20, 60, 50, 90]

        System.out.println(sayilar.getLast()); // 90
        System.out.println(sayilar); // [25, 10, 20, 60, 50, 90]


    }
}
