package day16_foreachLoop_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_Runner {

    public static void main(String[] args) {

        /* Biz bir class'dan obje olusturdugumuzda
           o obje olusturuldugu class'daki
           tum variable ve method'lara ulasabilir

           Hatta sadece olusturuldugu class'daki variable ve method'lara ulasmakla kalmaz
           olustruruldugu class'da variable'lara atanan degerlere de sahip olur

           Java'da bir obje olusturdugumuzda
           objenin olusturuldugu class'daki Constructor calisir
           ve olusturulan objeye ilk deger atamasini (initialize) yapar

           C06_Hastane    pers1        =           new       C06_Hastane()         ;
           Class Ismi   obje adi   assignment    keyword     Constructor
           Data turu                 sign

           non-primitive variable'larin data turu, olusturulduklari class'dir

           C06_Hastane()  Hastane class'indaki parametresiz constructor'dir

           Biz yeni bir class olusturdugumuzda bu constructor'i gormuyoruz

           SEBEP :

           Bir class'dan bir obje olusturulup,
           ilk deger atamasinin yapilabilmesi icin CONSTRUCTOR'in calismasi ZORUNLUDUR
           tersten soylersek, bir constructor calismadan bir objeye ilk deger atamasi YAPILAMAZ

           Java bunu bildiginden
           olusturulan her class'a OTOMATIK olarak default constructor koyar.
           Biz kendi constructor'imizi olusturmak istersek olusturabiliriz
           SADECE sunu bilmemiz lazim
           biz bir gorunur constructor olusturdugumuzda
           Java DEFAULT CONSTRUCTOR'I SILER
         */

        List<String> liste = new ArrayList<>();
        liste.size();

        Scanner scanner = new Scanner(System.in);
        //scanner.next();

        String str = new String("");
        str.length();

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
