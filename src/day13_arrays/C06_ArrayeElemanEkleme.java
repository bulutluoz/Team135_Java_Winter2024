package day13_arrays;

import java.util.Arrays;

public class C06_ArrayeElemanEkleme {

    public static void main(String[] args) {

        //Soru 7- Verilen bir array’e
        //        istenen bir elemani ekleyip bize donduren bir method yazin,
        //        eski array’e yeni degeri atayin.

        int[] arr = {4,5,6,7};

        // bu array'e 5.eleman olarak 1 ekleyin

        //arr[4] = 1; // ArrayIndexOutOfBoundsException

        int[] yeniArr = {4,5,6,7,1};

        arr = yeniArr;

        System.out.println("manuel olarak 1 eklenmis hali : " + Arrays.toString(arr));
        // manuel olarak 1 eklenmis hali : [4, 5, 6, 7, 1]

        arr = arrayeElemanEkleme(arr,10);

        System.out.println("method ile 10 eklenmis hali : " + Arrays.toString(arr));
        // method ile 10 eklenmis hali : [4, 5, 6, 7, 1, 10]

        arr = arrayeElemanEkleme(arr,8);

        System.out.println("method ile 8 eklenmis hali : " + Arrays.toString(arr));
        // method ile 8 eklenmis hali : [4, 5, 6, 7, 1, 10, 8]

    }


    public static int[] arrayeElemanEkleme(int[] eskiArray , int eklenecekEleman){

        int[] yeniArr = new int[eskiArray.length+1];

        for (int i = 0; i < eskiArray.length; i++) {

            yeniArr[i] = eskiArray[i];
        }

        yeniArr[yeniArr.length-1] = eklenecekEleman;

        return yeniArr;
    }
}
