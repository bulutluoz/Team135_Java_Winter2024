package day15_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_Fibonacci {

    public static void main(String[] args) {

        //Soru 4- Verilen pozitif bir n tamsayisini alarak,
        //        bize ilk n tane tane Fibonacci sayisini
        //        bir list olarak donduren bir method olusturun.
        //        Fibonacci serisi :  0 1 1 2 3 5 8 13 21 34 ........

        System.out.println(fibonacciListesiOlustur(5)); // [0, 1, 1, 2, 3]
        System.out.println(fibonacciListesiOlustur(10)); // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
        System.out.println(fibonacciListesiOlustur(20));
        // [0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181]

        System.out.println(fibonacciListesiOlustur(30));



    }


    public static List<Integer> fibonacciListesiOlustur(int sayiAdedi){

        List<Integer> fibonacciListesi = new ArrayList<>(); // []

        if (sayiAdedi <= 0){
            System.out.println("sayi adedi pozitif olmadigindan, size bos bir liste donduruyorum");
        } else if (sayiAdedi == 1) {
            fibonacciListesi.add(0);
        } else if (sayiAdedi == 2) {
            fibonacciListesi.add(0);
            fibonacciListesi.add(1);
        }else { // sayi adedi > 2

            fibonacciListesi.add(0);
            fibonacciListesi.add(1);

            for (int i = 2; i <sayiAdedi ; i++) {

                fibonacciListesi.add(fibonacciListesi.get(i-2) + fibonacciListesi.get(i-1));
            }
        }

        return fibonacciListesi;
    }
}






