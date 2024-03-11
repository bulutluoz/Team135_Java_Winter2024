package day35_genelTekrar;

public class C04_StringFiyatlariToplama {

    public static void main(String[] args) {

        // bir String array olarak verilen
        // farkli para birimlerindeki fiyatlarin toplamini yazdirin

        String[] fiyatlar = {"$1", "$23", "$134", "$2", "$7", "$24", "£32", "£40", "£2", "£65", "£4"} ;

        int toplam = 0;
        int fiyat = 0;

        for (int i = 0; i <fiyatlar.length ; i++) {

            fiyat = Integer.parseInt(fiyatlar[i].replaceAll("\\D",""));
            toplam += fiyat;
        }

        System.out.println("Toplam fiyat : " + toplam);


    }
}
