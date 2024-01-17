package day07_StringManipulations;

import java.util.Scanner;

public class C08_ReplaceAll {

    public static void main(String[] args) {

        // Kullanicidan bir cumle alip
        // Cumlede sayi, ozel karakter ve coklu space'leri temizleyip
        // son halini kaydedin
        // ornek input: "#Ja45!v0a     C1&*an073di_23@r"
        //       output : Java Candir

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir cumle giriniz...");

        String cumle = scanner.nextLine();

        // once sayilardan kurtulalim
        cumle = cumle.replaceAll("\\d","");

        // uzun space'i tek space haline getirelim
        cumle = cumle.replaceAll("\\s+"," ");

        // space'i koruma altina alalim
        cumle = cumle.replace(" ","5");

        // ozel karakterleri yok edelim
        cumle = cumle.replaceAll("\\W","");

        // _ w'nun kapsaminda oldugundan silmedi, onu da yok edelim
        cumle= cumle.replace("_","");

        // koruma altina aldigimiz space'i geri dondurelim
        cumle = cumle.replace("5"," ");

        System.out.println("Girdiginiz cumlenin temizlenmis hali : " + cumle);
    }
}
