package day15_arrayList;

import java.util.List;
import java.util.Scanner;

public class C05_KullaniciyaListOlusturtma {

    public static void main(String[] args) {

        // Kullanicidan istedigi kadar ismi alarak bir liste olusturun
        // Kullanici liste girisini bitirmek icin Q'ya basmalidir
        List<String> isimler = C03_KullaniciyaListeOlusturtma.isimListesiOlustur();

        // Kullanicidan listeyi aldiktan sonra
        // Kullaniciya istemedigi harfi sorun
        // Kullanici bir harfden uzun bir metin girerse, hata mesaji verip
        // yeniden harf isteyin

        Scanner scanner = new Scanner(System.in);
        String istenmeyenHarf = "";

        while(istenmeyenHarf.length() != 1){
            System.out.println("istenmeyen harfi giriniz...");

            istenmeyenHarf = scanner.nextLine();

            if (istenmeyenHarf.length() != 1){
                System.out.println("Istenmeyen harf tek bir harf olmalidir");
            }

        }


        // Listede kullanicinin girdigi harfi buyuk veya kucuk harf olarak barindiran
        // tum isimleri silip
        // kalan listeyi kaydedin

        isimler = C04_VerilenListedeIstenmeyenHarfIcerenleriSilme
                        .istenmeyenHarfIcerenleriTemizle(isimler,istenmeyenHarf.toLowerCase());

        isimler = C04_VerilenListedeIstenmeyenHarfIcerenleriSilme
                .istenmeyenHarfIcerenleriTemizle(isimler,istenmeyenHarf.toUpperCase());


        System.out.println("Listenin son hali : " + isimler);

    }
}
