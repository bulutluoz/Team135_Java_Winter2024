package day02_scanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        //         bunlarin toplamini ve carpimini yazdirin.


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz...");
        int girilenTamsayi = scanner.nextInt();

        System.out.println("Lutfen ondalikli bir sayi giriniz...");
        double girilenDouble = scanner.nextDouble();

        System.out.println("Girilen sayilarin toplami : " + (girilenDouble+girilenTamsayi));
        System.out.println("Girilen sayilarin carpimi : " + girilenDouble*girilenTamsayi);

    }
}
