package day07_StringManipulations;

import java.util.Scanner;

public class C03_IndexOf {

    public static void main(String[] args) {

        // kullanicidan bir cumle ve aranan metin isteyin
        // indexOf()
        // Kullaniciya asagidaki durumlardan uygun olani yazdirin
        // - aranan metin cumlede yok
        // - aranan metin cumlede sadece 1 kere kullanilmis
        // - aranan metin cumlede 2 kere kullanilmis
        // - aranan metin cumlede 2'den fazla kullanilmis

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aradiginiz metni girin...");
        String metin = scanner.nextLine();

        int ilkIndex = -1;
        int ikinciIndex = -1;
        int ucuncuIndex = -1;

        // once ilk index'i bulalim
        ilkIndex = cumle.indexOf(metin);

        // EGER ilk index != -1 ise ikinci index'i aratalim
        if (ilkIndex != -1){

            ikinciIndex = cumle.indexOf(metin,ilkIndex+1);
        }

        // EGER ikinci index != -1 ise ucuncu index'i aratalim

        if (ikinciIndex != -1){
            ucuncuIndex = cumle.indexOf(metin,ikinciIndex+1);
        }

        // - aranan metin cumlede yok
        // - aranan metin cumlede sadece 1 kere kullanilmis
        // - aranan metin cumlede 2 kere kullanilmis
        // - aranan metin cumlede 2'den fazla kullanilmis

        if (ilkIndex == -1){
            System.out.println("aranan metin cumlede yok");
        }else if (  ikinciIndex == -1  ){ // && ilkIndex != -1 intelliJ gereksiz dedi
            System.out.println("aranan metin cumlede sadece 1 kere kullanilmis");
        } else if (ucuncuIndex == -1) {
            System.out.println("aranan metin cumlede 2 kere kullanilmis");
        }else {
            System.out.println("aranan metin cumlede 2'den fazla kullanilmis");
        }


    }
}
