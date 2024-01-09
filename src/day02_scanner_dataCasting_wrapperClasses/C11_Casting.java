package day02_scanner_dataCasting_wrapperClasses;

import java.util.Scanner;

public class C11_Casting {

    public static void main(String[] args) {

        int sayi1 = 26;
        int sayi2 = 4;

        System.out.println(  sayi1 / sayi2  ); // 6

        double sayi3 = 30;

        System.out.println( sayi3 / sayi2 ); // 7.5

        // Soru 1- Int olarak verilen 3 degerin ortalamasini double olarak yazdiran bir kod yazin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 3 tamsayi giriniz");

        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();

        System.out.println("Girilen sayilarin ortalamasi : " + (s1+s2+s3)/3  ); // 8
        // eger bolunen ve bolen sayi int ise java sonucu int olarak verir

        System.out.println("Girilen sayilarin ortalamasi : " + (double)((s1+s2+s3)/3)  ); // 8.0
        // once islemi yapip ust satirdaki gibi 8 bulur
        // sonra 8'i double'a cast eder ve 8.0 bulur

        System.out.println("Girilen sayilarin ortalamasi : " + ((double)s1+s2+s3)/3  );// 8.333333333333334
        // sayilardan birini veya toplam sonucunu double yaparsak
        // bolme isleminin sonucunu double olarak verir


    }
}
