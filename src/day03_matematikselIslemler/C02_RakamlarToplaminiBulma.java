package day03_matematikselIslemler;

import java.util.Scanner;

public class C02_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        // Kullanicidan 3 basamakli pozitif bir tam sayi alin
        // Sayinin rakamlar toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt(); // 245

        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        birlerBasamagi = sayi % 10;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        sayi = sayi / 10 ;

        birlerBasamagi = sayi % 10 ;
        rakamlarToplami = rakamlarToplami + birlerBasamagi;
        sayi = sayi / 10;

        rakamlarToplami = rakamlarToplami + sayi;

        System.out.println(girilenSayi + " sayisinin rakamlar toplami : " + rakamlarToplami);
    }
}







