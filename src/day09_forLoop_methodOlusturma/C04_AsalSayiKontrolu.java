package day09_forLoop_methodOlusturma;

import java.util.Scanner;

public class C04_AsalSayiKontrolu {

    public static void main(String[] args) {

        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip,
        //         sayinin asal sayi olup olmadigini kontrol edin
        //         ve sonucu yazdirin.
        //         Asal sayi : kendisi ve 1 disinda hic bir tamsayiya bolunemeyen sayi


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz...");
        int girilenSayi = scanner.nextInt();

        for (int i = 2; i <=girilenSayi ; i++) {

            if (i == girilenSayi){
                System.out.println("Girilen sayi asal");
            } else if (girilenSayi % i == 0) {
                System.out.println("Girilen sayi asal degil");
                break;
            }

        }
    }
}
