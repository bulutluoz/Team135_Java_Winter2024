package day08_stringManipulations_forLoops;

import java.util.Scanner;

public class C11_RakamlarToplaminiBulma {

    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt(); // 2451

        int sayi = girilenSayi;
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;

        // islemi basamak sayisi kadar tekrar etmemliyiz

        int basamakSayisi = (sayi+"").length();  // 4

        for (int i = 1; i <=basamakSayisi ; i++) { // basamak sayisi kadar islemi tekrar edecegiz

            birlerBasamagi = sayi % 10;

            rakamlarToplami += birlerBasamagi;

            sayi /= 10;
        }

        System.out.println("Sayinin rakamlar toplami : " + rakamlarToplami);
    }
}
