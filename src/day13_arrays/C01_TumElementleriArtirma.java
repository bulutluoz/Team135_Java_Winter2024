package day13_arrays;

import java.util.Arrays;

public class C01_TumElementleriArtirma {

    public static void main(String[] args) {
        // Soru 1-  Verilen bir int array’in
        //          tum elemanlarini istenen sayi kadar artirip bize donduren
        //          bir method olusturun.
        //          Eski array’i yeni haliyle kaydedin.

        int[] arr = {5,7,9,10};

        for (int i = 0; i < arr.length ; i++) {

            arr[i] += 2;
        }

        System.out.println(Arrays.toString(arr)); // [7, 9, 11, 12]

        arr = elemanlariArtir(arr,3);

        System.out.println("3 artirilinca : "+ Arrays.toString(arr));

        arr = elemanlariArtir(arr,5);

        System.out.println("5 artirilinca : "+ Arrays.toString(arr));
    }

    public static int[] elemanlariArtir(int[] arr, int artisMiktari ){

        for (int i = 0; i <arr.length ; i++) {

            arr[i] += artisMiktari;
        }

        return arr;
    }

}
