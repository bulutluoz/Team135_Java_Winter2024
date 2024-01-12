package day04_ifStatements;

import java.util.Scanner;

public class C08_IfElseStatements {

    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir harf isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen karakteri girildigi gibi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz...");
        String girilenKelime= scanner.next();

        char girilenKarakter = girilenKelime.charAt(0);

        if (Character.isLowerCase(girilenKarakter)){
            System.out.println(Character.toUpperCase(girilenKarakter));
        }else System.out.println(girilenKarakter);


        if (girilenKarakter>='a' && girilenKarakter<='z'){
            System.out.println(      (char)(girilenKarakter - 32 )          );
        }else System.out.println(girilenKarakter);
    }
}
