package day04_ifStatements;

import java.util.Scanner;

public class C06_IfElseStatements {

    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        char girilenKarakter = scanner.next().charAt(0);

        if (girilenKarakter >= 'A'  && girilenKarakter <= 'Z'){
            System.out.println("Girilen karakter buyuk harf");
        }else {
            System.out.println("Girilen karakter buyuk harf degil");
        }


        // Charecter wrapper class'i ile yapalim

        if (Character.isUpperCase(girilenKarakter)){
            System.out.println("Girilen karakter buyuk harf");
        }else {
            System.out.println("Girilen karakter buyuk harf degil");
        }

    }
}
