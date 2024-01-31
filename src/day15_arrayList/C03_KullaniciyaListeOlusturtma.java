package day15_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03_KullaniciyaListeOlusturtma {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan istedigi kadar isim alip,
        //        Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek
        //        bir method olusturun.

        System.out.println(isimListesiOlustur());
    }


    public static List<String> isimListesiOlustur(){

        Scanner scanner = new Scanner(System.in);
        List<String> isimlerListesi = new ArrayList<>();
        String girilenIsim = "";

        while (! girilenIsim.equalsIgnoreCase("q")){

            System.out.println("Listeye eklenmek icin isim girin, bitirmek icin Q'ya basin");

            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")){
                isimlerListesi.add(girilenIsim);
            }

        }


        return isimlerListesi;

    }
}
