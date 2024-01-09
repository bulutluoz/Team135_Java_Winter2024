package day02_scanner;

import java.util.Scanner;

public class C03_Scanner {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        //        dikdortgenin alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen dikdortgenin kenar uzunluklarini giriniz");

        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();

        System.out.println("Dikdortgenin alani : " + kenar2*kenar1);

    }
}
