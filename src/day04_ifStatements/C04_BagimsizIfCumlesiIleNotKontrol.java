package day04_ifStatements;

import java.util.Scanner;

public class C04_BagimsizIfCumlesiIleNotKontrol {

    public static void main(String[] args) {

        //Soru 5- Kullanicidan notunu alin
        //        50 veya daha buyukse ”Sinifi Gectin”,
        //        50’den kucukse “Maalesef kaldin” yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen notunuzu giriniz");
        double girilenNot = scanner.nextDouble();

        if (girilenNot >= 50){
            System.out.println("Sinifi Gectin");
        }

        if (girilenNot<50){
            System.out.println("Maalesef kaldin");
        }
    }
}
