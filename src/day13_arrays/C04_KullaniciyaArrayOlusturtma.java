package day13_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C04_KullaniciyaArrayOlusturtma {

    public static void main(String[] args) {
        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip
        //        array’i olusturan ve bize donduren bir method olusturun.

        int[] arr = intArrayOlustur();

        System.out.println(Arrays.toString(arr));
    }


    public static int[] intArrayOlustur(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("kac elemanli bir array olusturmak istersiniz ?");

        int arrayBoyutu = scanner.nextInt();

        int[] arr = new int[arrayBoyutu];

        for (int i = 0; i <arrayBoyutu ; i++) {

            System.out.println(i + ". index icin bir tamsayi giriniz...");
            arr[i] = scanner.nextInt();
        }
        return arr;

    }
}
