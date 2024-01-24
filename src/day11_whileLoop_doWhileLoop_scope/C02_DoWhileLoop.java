package day11_whileLoop_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {

    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        // Kullaniciya bitirmek istediginde 0'a basmasini soyleyin
        // Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdigini
        // ve bunlarin toplaminin kac oldugunu yazdirin
        // Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin
        // bu negatif sayiyi sayi adedine ve toplama eklemeyin


        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0;
        int pozitifSayilarinToplami = 0;
        int pozitifSayiAdedi = 0 ;

        do {

            System.out.println("Toplanmak uzere pozitif tamsayi giriniz...");
            girilenSayi = scanner.nextInt();

            if (girilenSayi>0){
                pozitifSayilarinToplami += girilenSayi;
                pozitifSayiAdedi++;
            } else if (girilenSayi < 0) {
                System.out.println("negatif sayi kullanamazsiniz");
            }

        }while (girilenSayi != 0);

        System.out.println("Girdiginiz " + pozitifSayiAdedi + " adet pozitif sayinin toplami : " + pozitifSayilarinToplami);


    }
}
