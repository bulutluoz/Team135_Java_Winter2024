package day16_foreachLoop_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_Runner {

    public static void main(String[] args) {

        // Biz bir class'dan obje olusturdugumuzda
        // o obje olusturuldugu class'daki
        // tum variable ve method'lara ulasabilir

        List<String> liste = new ArrayList<>();
        //liste.size();

        Scanner scanner = new Scanner(System.in);
        //scanner.next();

        String str = new String("");
        //str.length();

        C06_Hastane pers1 = new C06_Hastane();

        System.out.println(pers1.personelIsmi); // Isim atanmadi
        pers1.personelYas = 40;
        System.out.println(pers1.personelYas); // 40


        C06_Hastane pers2 = new C06_Hastane();
        System.out.println(pers2.personelYas); // 0
        pers2.personelIsmi = "Rasit";

        System.out.println(pers2.personelIsmi); // Rasit

    }


}
