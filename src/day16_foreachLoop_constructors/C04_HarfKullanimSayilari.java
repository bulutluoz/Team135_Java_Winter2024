package day16_foreachLoop_constructors;

import java.util.Arrays;
import java.util.Scanner;

public class C04_HarfKullanimSayilari {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        //        harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //        kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine(); // Ali topu at,at Ali at

        System.out.println("Lutfen bir harf giriniz...");
        String harf = scanner.next(); // a

        String[] harfler = cumle.split(""); // [A, l, i,  , t, o, p, u,  , a, t, ,, a, t,  , A, l, i,  , a, t]

        int sayac = 0 ;

        for ( String each : harfler
             ) {

            if (each.equalsIgnoreCase(harf)){
                sayac++;
            }
        }

        if (sayac == 0){
            System.out.println("Verilen " + harf + " harfi, cumlede KULLANILMAMIS");
        }else{
            System.out.println("Verilen " + harf + " harfi, cumlede " + sayac + " kere kullanilmis");
        }
    }
}
