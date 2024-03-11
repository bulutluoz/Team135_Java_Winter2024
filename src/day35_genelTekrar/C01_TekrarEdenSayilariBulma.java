package day35_genelTekrar;

import java.util.Set;
import java.util.TreeSet;

public class C01_TekrarEdenSayilariBulma {

    public static void main(String[] args) {

        int[] arr = {2,3,2,5,3,5,3,5,2,3,4,1,8,9,4};

        // verilen array'de birden fazla kullanilmis olan sayilari
        // bir list olarak kaydedin

        Set<Integer> tekrarEdenSayilar = new TreeSet<>();


        for (int i = 0; i <= arr.length-2 ; i++) { // bir sayiyi alacak

            for (int j = i+1; j < arr.length ; j++) {

                if (arr[i] == arr[j]){
                    tekrarEdenSayilar.add(arr[i]);
                }


            }


        }

        System.out.println(tekrarEdenSayilar);
    }
}
