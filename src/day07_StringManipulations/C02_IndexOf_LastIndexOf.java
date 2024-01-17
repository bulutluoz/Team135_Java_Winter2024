package day07_StringManipulations;

import java.util.Scanner;

public class C02_IndexOf_LastIndexOf {

    public static void main(String[] args) {

        // kullanicidan bir cumle ve aranan metin isteyin
        // indexOf() ve lastIndexOf() kullanarak
        // Kullaniciya asagidaki durumlardan uygun olani yazdirin
        // - aranan metin cumlede yok
        // - aranan metin cumlede sadece 1 kere kullanilmis
        // - aranan metin cumlede birden fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aradiginiz metni girin...");
        String metin = scanner.nextLine();

        int ilkIndex = cumle.indexOf(metin);
        int sonIndex = cumle.lastIndexOf(metin);

        if (ilkIndex == -1){
            System.out.println("aranan metin cumlede yok");
        } else if (ilkIndex == sonIndex) {
            System.out.println("aranan metin cumlede sadece 1 kere kullanilmis");
        }else {
            System.out.println("aranan metin cumlede birden fazla kullanilmis");
        }
    }
}
