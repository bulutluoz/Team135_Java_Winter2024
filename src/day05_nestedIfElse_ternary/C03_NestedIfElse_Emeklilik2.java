package day05_nestedIfElse_ternary;

import java.util.Scanner;

public class C03_NestedIfElse_Emeklilik2 {
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

        // ana degisken olarak yas secelim

        if (yas<18 || yas>90){
            System.out.println("Girilen yas icin emeklilik hesaplanamaz");
        } else if (yas >= 65) { // 65 ile 90 arasi
            System.out.println("Emekli olabilirsin");
        } else if (yas>=60) { // 60 ile 65 arasi
            if (cinsiyet == 'K'){
                System.out.println("Emekli olabilirsin");
            } else if (cinsiyet == 'E') {
                System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calisman gerekir");
            }else {
                System.out.println("cinsiyet icin E veya K secmelisiniz");
            }
        } else{ // 18 ile 60 arasi
            if (cinsiyet == 'K'){
                System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calisman gerekir");
            } else if (cinsiyet == 'E') {
                System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calisman gerekir");
            }else {
                System.out.println("cinsiyet icin E veya K secmelisiniz");
            }
        }
    }
}
