package day05_nestedIfElse_ternary;

import java.util.Scanner;

public class C06_Ternary {

    public static void main(String[] args) {

        // kullanicidan bir sayi alin
        // sayinin cift veya tek oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        if (sayi % 2 == 0){
            System.out.println("Sayi cift");
        }else {
            System.out.println("Sayi tek");
        }


        System.out.println(   sayi % 2 == 0  ? "Sayi cift" :  "Sayi tek" );
    }
}
