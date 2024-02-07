package day19_staticKeywords_passByValue;

import java.util.Arrays;

public class C06_PassByValueCokluElement {

    public static void main(String[] args) {

        // verilen int array'deki herbir elemani
        // 2 artirip, array'in yeni halini yazdiran
        // bir method olusturun

        int[] arr = {3,4,5};

        elemanlariArtir(arr);

        System.out.println("method call'dan sonra arr : " + Arrays.toString(arr));
        // method call'dan sonra arr : [5, 6, 7]

        // verecegimiz bir array'in
        // uzunlugundan 1 eleman fazla olan yeni bir array olusturup
        // tum elemanlara 3 degeri atayan ve
        // elde edilen yeni array'i de yolladigimiz array'e atayip
        // array'in son halini yazdiran bir method olusturun

        arrayiUzat(arr);

        System.out.println("arrayi uzat methodu calistiktan sonra arr : " + Arrays.toString(arr));

    }

    public static void arrayiUzat(int[] arr){

        int[] yeniArr = new int[arr.length+1];

        for (int i = 0; i < yeniArr.length ; i++) {
            yeniArr[i] = 3;
        }

        arr = yeniArr;
        System.out.println("Array'in son hali : " + Arrays.toString(arr));
        // Array'in son hali : [3, 3, 3, 3]
    }


    public static void elemanlariArtir(int[] arb){

        for (int i = 0; i < arb.length ; i++) {

            arb[i]+=2;
        }

        System.out.println(Arrays.toString(arb)); // [5, 6, 7]

    }
}
