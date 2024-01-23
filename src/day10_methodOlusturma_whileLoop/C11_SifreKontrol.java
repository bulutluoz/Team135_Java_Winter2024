package day10_methodOlusturma_whileLoop;

import java.util.Scanner;

public class C11_SifreKontrol {

    public static void main(String[] args) {

        //Soru 4 : Kullanicidan bir sifre isteyip,
        //         asagidaki sartlari kontrol edin
        //         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        //         tum sartlari saglayincaya kadar yeniden sifre isteyin
        //         tum sartlar saglanirsa, "sifre basariyla kaydedildi" yazdirin ve bitirin
        //          - ilk harf kucuk harf olmali
        //          - son karakter rakam olmali
        //          - sifre bosluk icermemeli
        //          - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        String girilenSifre = "";
        boolean sifreUygunMu = false;

        while (!sifreUygunMu){ // sifreUygunMu == false

            System.out.println("Lutfen bir sifre giriniz...");
            girilenSifre = scanner.nextLine();
             sifreUygunMu = sifreKontrolEt(girilenSifre);

        }
        System.out.println("sifre basariyla kaydedildi");

    }






    public static boolean sifreKontrolEt(String sifre){
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

        if (flag == 0){
            return true;
        }else {
            return false;
        }
    }
}
