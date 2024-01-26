package day12_scope_arrays;

import java.util.Arrays;

public class C04_Array {

    public static void main(String[] args) {

        /*
            Bir array'deki tum elementleri ayni isleme tabii tutacaksak
            bir for loop olusturup

            arr[i] uzerinden tum elementlere yapmak istedigimiz islemi yapabiliriz
         */



        // verilen bir int array'deki
        // tum elementleri toplayip yazdirin

        int[] arr = {3,5,7,9,1};

        int toplam = 0;


        for (int i = 0; i < arr.length ; i++) {

            toplam += arr[i];
        }

        System.out.println("elemanlarin toplami : "+ toplam); // 25


        // verilen array'deki tum sayilarin carpimini yazdirin

        int carpim = 1;

        for (int i = 0; i < arr.length ; i++) {

            carpim *= arr[i];
        }

        System.out.println("elemanlarin carpimi : "+ carpim); // 945

        // verilen array'deki tum elemanlari 3 artirin

        System.out.println("Verilen array : " + Arrays.toString(arr)); // Verilen array : [3, 5, 7, 9, 1]

        for (int i = 0; i < arr.length ; i++) {

            arr[i] +=3;
        }

        System.out.println("Verilen array'in artirilmis hali : " + Arrays.toString(arr));
        // [6, 8, 10, 12, 4]


        // verilen array'deki 7'den buyuk sayilari 2 azaltip,
        // 7 ve daha kucuk sayilari 2 artirin

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 7 ){
                arr[i] -= 2;
            }else{

                arr[i] += 2;
            }
        }

        System.out.println("Arrayin son hali : " + Arrays.toString(arr));
        // [8, 6, 8, 10, 6]

    }
}
