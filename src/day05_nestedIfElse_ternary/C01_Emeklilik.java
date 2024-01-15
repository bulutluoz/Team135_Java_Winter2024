package day05_nestedIfElse_ternary;

import java.util.Scanner;

public class C01_Emeklilik {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        //        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cinsiyetinizi giriniz. E : Erkek, K: Kadin");
        char cinsiyet = scanner.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz..");
        int yas = scanner.nextInt();

        if (cinsiyet == 'E' && yas >= 65){
            System.out.println("Erkek, emekli olabilir");
        } else if (cinsiyet == 'E' ) { // && yas < 65 intelliJ gereksiz dedi
            System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calisman gerekir");
        } else if (cinsiyet == 'K' && yas>=60) {
            System.out.println("Kadin, emekli olabilir");
        } else if (cinsiyet == 'K' ) { // && yas<60
            System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calisman gerekir");
        }else {
            System.out.println("Cinsiyet olarak E veya K secmelisiniz");
        }


    }
}
