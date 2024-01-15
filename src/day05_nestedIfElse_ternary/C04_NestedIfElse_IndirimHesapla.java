package day05_nestedIfElse_ternary;

import java.util.Scanner;

public class C04_NestedIfElse_IndirimHesapla {

    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedini ve indirimsiz fiyatini alin,
        //        kullaniciya musteri karti olup olmadigini sorun.
        //        Musteri karti varsa
        //              - 10 urunden fazla alirsa %20,
        //              - az alirsa %15 indirim yapin,
        //        Musteri karti yoksa
        //              - 10 urunden fazla alirsa %15,
        //              - az alirsa %10 indirim yapin
        // ve toplam fiyati yazdirin


        Scanner scanner = new Scanner(System.in);
        System.out.println("kac urun aldiginizi giriniz...");
        int urunAdedi = scanner.nextInt();

        System.out.println("Urunun indirimsiz fiyatini giriniz...");
        double indirimsizFiyat = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi ? E : Evet, H : Hayir");
        char kartVarMi = scanner.next().toUpperCase().charAt(0);

        double indirimsizToplamFiyat = urunAdedi * indirimsizFiyat;

        // ana degisken kart olsun

        if (kartVarMi == 'E'){ // karti olanlar

            if (urunAdedi>1000 || urunAdedi<0){
                System.out.println("Urun adedi gecersiz");
            }else if (urunAdedi>10){
                System.out.println("%20 indirimli toplam fiyat : " + indirimsizToplamFiyat*80/100);
            }else{
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat*85/100);
            }

        } else if (kartVarMi == 'H') { // karti olmayanlar

            if (urunAdedi>1000 || urunAdedi<0){
                System.out.println("Urun adedi gecersiz");
            }else if (urunAdedi>10){
                System.out.println("%15 indirimli toplam fiyat : " + indirimsizToplamFiyat*85/100);
            }else{
                System.out.println("%10 indirimli toplam fiyat : " + indirimsizToplamFiyat*90/100);
            }

        }else {
            System.out.println("Kart bilgisi icin E veya H girmelisiniz");
        }

    }
}
