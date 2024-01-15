package day05_nestedIfElse_ternary;

import java.util.Scanner;

public class C02_NestedIfElse_Emeklilik {

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

        // Eger birden fazla degiskene gore kod yazmamiz gerekiyorsa
        // kodun daha anlasilir olmasi icin Nested if else kullanabiliriz

        // Nested if else kullanmak icin,
        // once degiskenlerden birini (yas /cinsiyet) ana degisken kabul edelim
        // biz cinsiyeti sectik

        if (cinsiyet == 'K'){ // bu if body'sinde sadece kadinlar olacak
            if (yas<18 || yas>90){
                System.out.println("Girdiginiz yas icin emeklilik hesaplanamaz");
            } else if (yas>=60) {
                System.out.println("kadin, emekli olabilir");
            }else {
                System.out.println("Emekli olmak icin " + (60-yas) + " yil daha calisman gerekir");
            }

        } else if (cinsiyet == 'E') { // bu else if body'sinde ise sadece erkekler olacak
            if (yas<18 || yas>90){
                System.out.println("Girdiginiz yas icin emeklilik hesaplanamaz");
            } else if (yas>=65) {
                System.out.println("Erkek, emekli olabilir");
            }else {
                System.out.println("Emekli olmak icin " + (65-yas) + " yil daha calisman gerekir");
            }

        }else {
            System.out.println("Cinsiyet olarak K veya E secmelisiniz");
        }

    }
}
