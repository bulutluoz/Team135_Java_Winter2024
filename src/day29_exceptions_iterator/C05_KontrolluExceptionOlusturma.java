package day29_exceptions_iterator;

import java.util.Scanner;

public class C05_KontrolluExceptionOlusturma {

    public static void main(String[] args) {

        /*
            EGER herhangi bir durumda exception olusmasini istedigimizde
            o durumda Java'nin hazir exception'i yoksa
            biz throw keyword kullanarak
            bir exception firlatabiliriz

            Ayrica kod'u belirli durumda baska bir yere gondermek istersek de
            throw new ... diyerek exception olusturabiliriz
         */

        // Kullanicidan notunu isteyip
        // gectin veya kaldin yazdirin
        // kullanici gecersiz not girerse, IllegalArgumentException firlatin


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz...");
        double not = scanner.nextDouble();

        if (not<0 || not>100){
            throw new IllegalArgumentException("GECERSIZ NOT");
        } else if (not<50) {
            System.out.println("Kaldin");
        }else {
            System.out.println("Tebrikler gectin");
        }

    }
}
