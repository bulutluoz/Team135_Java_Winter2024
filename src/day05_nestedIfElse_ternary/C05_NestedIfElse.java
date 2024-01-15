package day05_nestedIfElse_ternary;

import java.util.Scanner;

public class C05_NestedIfElse {

    public static void main(String[] args) {

        //Soru 3- Kullanicidan bir sayi alin
        //        sayi tek ise negatif veya pozitif tek sayi oldugunu yazdirin,
        //        sayi cift sayi ise 10’un tam kati olup olmadigini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        if ( sayi % 2 == 0){ // sadece cift sayilar

            if (sayi % 10 == 0){
                System.out.println("10'un tam kati");
            }else{
                System.out.println("10'un tam kati degil");
            }

        }else { // sadece tek sayilar

            if (sayi>0){
                System.out.println("Pozitif tek sayi");
            }else {
                System.out.println("Negatif tek sayi");
            }
        }
    }
}
