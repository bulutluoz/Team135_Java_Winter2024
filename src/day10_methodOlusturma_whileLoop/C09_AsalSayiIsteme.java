package day10_methodOlusturma_whileLoop;

import java.util.Scanner;

public class C09_AsalSayiIsteme {

    public static void main(String[] args) {

        // Kullanicidan asal bir sayi girmesini isteyin
        // kullanicinin girdigi sayiyi kontrol edip
        // asal sayi ise "Giris basarili" yazdirin
        // asal sayi degilse tekrar isteyin

        // Kac kere giris olacagini bilmiyoruz, while loop daha avantajli

        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0;
        boolean asalMi = false;

        while (!asalMi){ // asalMi == false

            System.out.println("Lutfen bir asal sayi giriniz...");
            girilenSayi = scanner.nextInt();

            asalMi = C03_AsalSayiSonucDondurme.isAsal(girilenSayi);

        }

        System.out.println("Giris basarili");
    }
}
