package day04_ifStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {

    public static void main(String[] args) {
        // ogrencinin notunu isteyin
        // 0'dan kucuk veya 100'den buyuk notlar icin "gecersiz not" yazdirin
        //Ogrencinin notu 85 ve ustu ise AA,
        //(85 ve ustu  degilse) 65 ve ustu ise BB,
        //(65 ve ustu  de degilse) 50 ve ustu ise CC,
        //(geriye kalanlar) DD


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");

        double not = scanner.nextDouble();

        if (not<0 || not >100){
            System.out.println("Gecersiz not");
        } else if (not>=85) {
            System.out.println("AA");
        } else if (not>=65) {
            System.out.println("BB");
        } else if (not>=50) {
            System.out.println("CC");
        }else{
            System.out.println("DD");
        }
    }
}
