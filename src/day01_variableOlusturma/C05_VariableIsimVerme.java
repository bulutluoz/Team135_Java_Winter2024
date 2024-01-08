package day01_variableOlusturma;

public class C05_VariableIsimVerme {

    public static void main(String[] args) {

        // Kural1 - Variable isimleri case sensitive(buyuk kucuk harf duyarli)'dir
        int Not = 20;
        int NOT = 30;
        int not = 40;

        System.out.println(Not); // 20

        // Kural 2 - variable isimleri kucuk harfle baslar
        //           Buyuk harfle baslatirsaniz Java kirmizi yapmaz ama genel kabul acisindan uygun bulunmaz


        // Kural 3 - ismlerde _ ve $ disinda ozel karakter veya space kullanilamaz
        int sayi$3 = 20;


        // Kural4 - Java'nin kullandigi keyword'ler ism olarak kullanilamaz

        // int for = 4;
        // int class = 5;
        // int int = 9;

        // Kural5 - isimler birden fazla kelimeden olusuyorsa
        //          CamelCase kullanilir

        String ogrenciIsmi = "Ali";
        char isminIlkHarfi = 'a';
    }
}
