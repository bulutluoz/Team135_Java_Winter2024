package day10_methodOlusturma_whileLoop;

import java.util.Scanner;

public class C04_Soru {

    public static void main(String[] args) {

        // Kullanicidan pozitif bir tamsayi isteyin
        // girilen sayi asal ise sayinin 3 katini yazdirin
        // girilen sayi asal degilse sayinin 2 katini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz...");

        int sayi = scanner.nextInt();


        if (C03_AsalSayiSonucDondurme.isAsal(sayi)){

            System.out.println(sayi*3);

        }else {

            System.out.println(sayi*2);
        }

    }
}
