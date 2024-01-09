package day02_scanner;

import java.util.Scanner;

public class C10_DataCasting_Char {

    public static void main(String[] args) {

        // kullanicidan herhangi bir karakter girmesini isteyin
        // ascii tablosunda, kullanicinin girdigi degerden sonra gelen ilk 3 karakteri yazdirin
        // Ornek :  input : 'a' ==> output : 'b','c','d'


        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen herhangi bir karakter giriniz...");

        char girilenKarakter = scanner.next().charAt(0);

        System.out.println( (char)(girilenKarakter +1) );
        System.out.println( (char)(girilenKarakter +2) );
        System.out.println( (char)(girilenKarakter +3) );


    }
}
