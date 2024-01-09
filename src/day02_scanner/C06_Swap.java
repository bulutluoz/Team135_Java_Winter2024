package day02_scanner;

import java.util.Scanner;

public class C06_Swap {
    public static void main(String[] args) {

        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 1.sayiyi giriniz...");
        int sayi1 = scanner.nextInt();

        System.out.println("Lutfen 2.sayiyi giriniz...");
        int sayi2 = scanner.nextInt();

        int temp = 0;

        temp = sayi2;

        sayi2 = sayi1;

        sayi1 = temp ;

        System.out.println("Verdiginiz sayilarin yerini degistirdim...");
        System.out.println("sayi1 : " + sayi1 + " ve sayi2 : " + sayi2 + " oldu.");
    }
}
