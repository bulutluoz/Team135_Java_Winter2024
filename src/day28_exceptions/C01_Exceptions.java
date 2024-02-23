package day28_exceptions;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_Exceptions {

    public static void main(String[] args) {

        // kullanicidan iki tamsayi alip
        // bu sayilarin bolumunu yazdirin



        Scanner scanner = new Scanner(System.in);
        int sayi1 = 0;
        int sayi2 = 0;
        boolean problemVarMi = true;

        while (problemVarMi){ // loop problemvarmi = false oldugunda biter
            try {
                scanner = new Scanner(System.in);
                System.out.println("Lutfen iki tamsayi giriniz...");
                sayi1 = scanner.nextInt();
                sayi2 = scanner.nextInt();
                problemVarMi=false;
            } catch (InputMismatchException e) {

                System.out.println("Tamsayi dedik....");
            }
        }

        if (sayi2 == 0){
            System.out.println("Ikinci sayi 0 olamaz");
        }else {
            System.out.println("Verilen sayilarin bolumu : " + sayi1 / sayi2);
        }

        System.out.println("Kodda bir hata olursa bu satir calismaz");
    }
}
