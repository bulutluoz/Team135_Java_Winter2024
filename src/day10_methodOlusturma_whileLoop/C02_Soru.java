package day10_methodOlusturma_whileLoop;

import java.util.Scanner;

public class C02_Soru {

    public static void main(String[] args) {

        // kullanicidan pozitif bir rakam ve bir sayi alin
        // eger sayi rakamin foktoryel degerinden buyukse rakami
        // sayi rakamin faktoryel degerinden buyuk degilse sayiyi yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pozitif bir rakam giriniz...");
        int rakam = scanner.nextInt();

        System.out.println("Pozitif bir tamsayi giriniz...");
        int sayi = scanner.nextInt();

        int rakaminFaktoryelDegeri = C01_FaktoryelSonucuDondurme.faktoryelHesapla(rakam);

        if (sayi > rakaminFaktoryelDegeri){
            System.out.println(rakam);
        }else{
            System.out.println(sayi);
        }
    }
}
