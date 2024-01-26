package day12_scope_arrays;

import java.util.Arrays;

public class C03_ArrayOlusturma {

    public static void main(String[] args) {

        int[] arr = {2,3,4};
        // data turu array, icine konulacak elementlerin data turu int

        String[] str = {"a","s","d","f"};

        String[] str2 = {"Ali"};
        // str2 'nin data turu Array'dir . [] data turunun array oldugunu belirtir
        //                                 Basina yazilan String, array'in icine konulacak elementlerin data turudur

        String str3 = "Ali";

        // bir array nasil yazdirilabilir

        System.out.println(arr); // [I@2752f6e2
        System.out.println(str); // [Ljava.lang.String;@e580929

        // Array data turundeki variable'lar DIREK YAZDIRILAMAZLAR
        // direk yazdirmak istediginizde stack memory'deki referansi size yazdirir
        // array'i icindeki elemanlarla birlikte yazdirmak isterseniz

        System.out.println(Arrays.toString(arr)); // [2, 3, 4]
        System.out.println(Arrays.toString(str)); // [a, s, d, f]

        // Array'in icindeki herhangi bir elemente ulasmak, degistirmek veya yazdirmak istedigimizde
        // array'in ismini [ulasmak istedigimiz elementin index'i] yazdiririz

        // arr'deki 3'u yazdiralim
        System.out.println(arr[1]); // 3

        // arr'deki 4'un yerine 6 atayalim

        arr[2] = 6 ;

        System.out.println(Arrays.toString(arr)); // [2, 3, 6]

        // new int[4]; veya {1,2,3,4} seklinde deger atadigimiz bir array'e
        // besinci bir element atayamayiz veya
        // var olan bir elementi silip 3 elemanli bir hale donduremeyiz

        int[] sayilar = {4,6,9,5};
        System.out.println(Arrays.toString(sayilar)); // [4, 6, 9, 5]

        // bu array'e besinci element koymak istesek
        // sayilar[4] = 7; // var olan elementlerin sonuna 4.indekse yani 5.eleman olarak 7 atayalim
        // ArrayIndexOutOfBoundsException, Index 4 out of bounds for length 4


        // Arrays'de delete veya remove gibi bir elementi silebilecegimiz method yok
        // dolayisiyla var olan bir array'de uzunlugu degistirmek mumkun degildir.


        sayilar = new int[5];
        sayilar = new int[3];
        sayilar = new int[8];

        int[] yeniArr = {4,6,9,5,7};
        sayilar = yeniArr;
        System.out.println(Arrays.toString(sayilar)); // [4, 6, 9, 5, 7]

        // varolan arrayden 6 ve 9'u yok edelim, sadece 4,5,7 nin oldugu 3 elemanlik bir array olsun

        int[] yeniArr2 ={4,5,7};
        sayilar = yeniArr2;

        System.out.println(Arrays.toString(sayilar)); // [4, 5, 7]




    }
}
