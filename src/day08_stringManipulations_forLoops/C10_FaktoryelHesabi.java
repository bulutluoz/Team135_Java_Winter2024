package day08_stringManipulations_forLoops;

import java.util.Scanner;

public class C10_FaktoryelHesabi {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan 17’den kucuk bir sayi alip,
        //        bu sayinin faktoryel degerini hesaplayin.
        //       Ornek 6 ! = 6 * 5 * 4 * 3 * 2 * 1  ==> 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 17'den kucuk pozitif bir tamsayi giriniz...");
        int girilensayi = scanner.nextInt();
        int carpim = 1 ;


        for (int i = girilensayi; i >=1 ; i--) {
            carpim *= i;
        }

        System.out.println(girilensayi + "! = " + carpim);
    }
}
