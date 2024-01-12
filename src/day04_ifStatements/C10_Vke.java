package day04_ifStatements;

import java.util.Scanner;

public class C10_Vke {

    public static void main(String[] args) {
        //Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        //        vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        //        vucut kitle endeksi
        //          30’dan buyukse obez,
        //          25-30 arasi ise kilolu,
        //          20-25 arasi ise normal,
        //          20’den kucukse zayif yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Kg olarak kilonuzu giriniz...");
        double kilo = scanner.nextDouble();

        System.out.println("Lutfen cm olarak boyunuzu giriniz...");
        double boy = scanner.nextDouble();

        double vke = (kilo*10000 / (boy *boy)) ;

        System.out.println("Vucut kitle endeksiniz : " + vke);

        if (kilo<30 || kilo > 200 || boy < 50 || boy > 250){
            System.out.println("Degerleri kontrol ediniz");
        } else if (vke > 30) {
            System.out.println("Obez");
        } else if (vke > 25) {
            System.out.println("Kilolu");
        } else if (vke > 20) {
            System.out.println("Normal");
        }else{
            System.out.println("zayif");
        }

    }
}
