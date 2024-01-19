package day08_stringManipulations_forLoops;

import java.util.Scanner;

public class C02_SifreKontrolu {

    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        //          - ilk harf kucuk harf olmali
        //          - son karakter rakam olmali
        //          - sifre bosluk icermemeli
        //          - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz...");
        String sifre = scanner.nextLine();

        // Tum hatalari yazdirabilmemiz icin bagimsiz if cumleleri kullanmaliyiz
        // Bagimsiz if cumleleri kullanildiginda,
        // en sonda sifrenin basarili olup olmadigini kontrol etmek icin
        // ekstra bir variable ile kontrol yapmamiz gerekir

        int flag = 0; // hata buldukca bu flag degistirilecek
                      // en sonda flag degismis mi kontrol edip, sifre basarili/basarisiz diyecegiz

        //          - ilk harf kucuk harf olmali

        char ilkHarf = sifre.charAt(0);

        if ( !(ilkHarf>='a' && ilkHarf<= 'z')   )  {
            System.out.println("ilk harf kucuk harf olmali");
            flag++;
        }

        //          - son karakter rakam olmali

        char sonKarakter= sifre.charAt(sifre.length()-1);

        if (  !(sonKarakter>='0' && sonKarakter<='9') ){

            System.out.println("son karakter rakam olmali");
            flag++;
        }

        //          - sifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            flag++;
        }

        //          - uzunlugu en az 10 karakter olmali

        if (sifre.length() < 10){
            System.out.println("sifrenin uzunlugu en az 10 karakter olmali");
            flag++;
        }

        // baslangicta flag = 0 'di,

        if (flag == 0){
            System.out.println("sifre basariyla kaydedildi");
        }

    }
}
