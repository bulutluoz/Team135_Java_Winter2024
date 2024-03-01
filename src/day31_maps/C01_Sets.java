package day31_maps;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class C01_Sets {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();

        Set<Integer> treeSet = new TreeSet<>();

        long timeBaslangic = LocalTime.now().toNanoOfDay();

        Random rnd = new Random();

        for (int i = 0; i <1000000 ; i++) {
            hashSet.add(rnd.nextInt(1000000));
        }

        long timeBitis = LocalTime.now().toNanoOfDay();

        System.out.println( "HashSet sure : "+ (timeBitis-timeBaslangic));



        timeBaslangic = LocalTime.now().toNanoOfDay();


        for (int i = 0; i <1000000 ; i++) {
            hashSet.add(rnd.nextInt(1000000));
        }

        timeBitis = LocalTime.now().toNanoOfDay();

        System.out.println( "TreeSet sure : "+ (timeBitis-timeBaslangic));



    }
}
