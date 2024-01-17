package day07_StringManipulations;

import java.util.Scanner;

public class C01_IndexOf {

    public static void main(String[] args) {

        // kullanicidan bir cumle ve aranan metin isteyin
        // Kullaniciya aranan metnin cumlede var olup olmadigini
        // indexOf method'u kullanarak yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz...");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen cumlede aradiginiz metni girin...");
        String metin = scanner.nextLine();

        System.out.println(cumle.contains(metin)); // true


        // indexOf() ile yapalim

        // cumle.indexOf(metin) ==> bize ya index verir veya -1

        if (cumle.indexOf(metin)>=0){
            System.out.println("Cumlede aranan metin var");
        }else {
            System.out.println("Cumlede aranan metin yok");
        }


        // cumlenin ikinci yarisinda aranan metin var mi ?

        if (cumle.indexOf(metin,(cumle.length()/2))>=0){
            System.out.println("cumlenin ikinci yarisinda aranan metin var");
        }else {
            System.out.println("cumlenin ikinci yarisinda aranan metin yok");
        }


        // aranan metnin ilk kullanimindan sonra, bir daha kullanilmis mi ? yazdirin

        int ilkKullanimIndexi = cumle.indexOf(metin);

        if (cumle.indexOf(metin,ilkKullanimIndexi+1)>=0){
            System.out.println("ilk kullanimdan sonra da metin var");
        }else {
            System.out.println("Sadece bir kere kullanilmis");
        }

    }
}
