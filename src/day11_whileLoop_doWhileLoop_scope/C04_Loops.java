package day11_whileLoop_doWhileLoop_scope;

import java.util.Scanner;

public class C04_Loops {

    public static void main(String[] args) {
        // Soru 3- Kullanicidan bir pozitif sayi isteyin,
        //         sayının tam kare olup olmadığını bulunuz,
        //         tamkare ise true değilse false yazdırınız.
        //	       Ornek :  input : 16, output: true ( 4 * 4 = 16)


        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamkare kontrolu icin pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();


        // for loop ile yapalim
        boolean tamkareMi = false ;
        for (int i = 1; i*i <= girilenSayi ; i++) {

            if ( i* i == girilenSayi){
                tamkareMi = true;
            }

        }

        System.out.println(girilenSayi + " sayi icin for loop sonuc : " + tamkareMi );


        // while loop ile yapalim
        tamkareMi = false ;
        int sayi = 1;

        while ( sayi*sayi <= girilenSayi){

            if (sayi * sayi == girilenSayi){
                tamkareMi = true;
            }
            sayi++;
        }

        System.out.println(girilenSayi + " sayi icin while loop sonuc : " + tamkareMi );



        // do while loop ile yapalim

        tamkareMi = false ;
        sayi = 1;

        do {
            if (sayi * sayi == girilenSayi){
                tamkareMi = true;
            }
            sayi++;

        }while (sayi*sayi <= girilenSayi);

        System.out.println(girilenSayi + " sayi icin do while loop sonuc : " + tamkareMi );

    }
}
