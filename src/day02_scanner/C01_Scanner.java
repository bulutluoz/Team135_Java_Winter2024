package day02_scanner;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alip
        // tamsayinin karesini yazdirin

        // 1.adim bir scanner objesi olusturalim

        Scanner scanner = new Scanner(System.in);

        // 2.adim kullaniciya ne istedigimizi soyleyin

        System.out.println("Lutfen bir tamsayi giriniz...");

        // 3.adim : istediginiz bilgiyi depolayabilecek bir variable olusturun
        //          scanner objesi ile uygun method'u kullanip,
        //          kullanicidan istenen bilgiyi alin

        int girilenSayi = scanner.nextInt();

        System.out.println("Girdiginiz sayinin karesi : " + girilenSayi*girilenSayi);

    }
}
