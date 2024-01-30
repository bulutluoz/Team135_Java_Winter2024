package day14_arrays_arrayLists;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {

    public static void main(String[] args) {

        // Array'ler ekleme-silme yapamadigimiz icin bizi cok kisitliyor

        int[] arr = {3,5,8};

        // arr'ye 4.eleman olarak 20 ekleyin

        // arr[3] = 20; // ArrayIndexOutOfBoundsException

        int[] yeniArr = {3,5,8,20};

        arr = yeniArr;

        System.out.println(Arrays.toString(arr)); // [3, 5, 8, 20]

        // bu array'den 5'i silin ve array'i 3 elemanli hale getirin

        int[] yeniArr2 = {3,8,20};

        arr = yeniArr2;

        System.out.println(Arrays.toString(arr)); // [3, 8, 20]

    }
}
