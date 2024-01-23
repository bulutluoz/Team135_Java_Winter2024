package day10_methodOlusturma_whileLoop;

import java.util.Scanner;

public class C10_SayiIsteme {

    public static void main(String[] args) {

        // Kullanicidan pozitif sayi isteyin
        // girilen sayinin pozitifTamBolenleriSayisi 5'den buyukse
        // "Guzel sayi" yazdirin ve islemi bitirin
        // buyuk degilse "Kotu sayi" yazdirin ve tekrar sayi girmesini isteyin

        Scanner scanner = new Scanner(System.in);
        int girilenSayi = 0;
        boolean devamMi = true;
        int ptbs = 0;

        while (devamMi){ // devamMi == true

            System.out.println("Pozitif bir tamsayi giriniz...");
            girilenSayi = scanner.nextInt();

            ptbs = pozitifTamBolenSayisiBul(girilenSayi);

            if (ptbs>5){
                System.out.println("Guzel sayi");
                // break;
                devamMi = false;
            }else{
                System.out.println("Kotu sayi");
            }

        }



    }

    public static int pozitifTamBolenSayisiBul(int sayi){

        int sayac = 0;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi % i == 0){
                sayac++;
            }
        }
        return sayac;
    }
}
