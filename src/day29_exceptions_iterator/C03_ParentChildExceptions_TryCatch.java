package day29_exceptions_iterator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ParentChildExceptions_TryCatch {

    public static void main(String[] args) {

        /*
            Eger kodu try catch icine alip
            exception'i handle etmek istersek
            Java 4 alternatif sunuyor

            1- var olan catch disinda bir catch daha eklemek
               Eger birden fazla catch cumlesi kullanacaksak
               ve exception'lar arasinda parent-child iliskisi varsa
               once child yazilmalidir.
               Cunku once parent'i yazarsak, parent tum exception'lari yakalayacagindan
               chil exception'i yazmak anlamsiz olacaktir.
            2- parent exception tum riskleri kapsadigindan,
               catch cumlesinde sadece parent'i yazmak
               bu durumda aciklama yazdiracaksak,
               parent exception'a uygun genel bir aciklama yazdirilmalidir
            3- nested try-catch kullanmak
            4- method signature'ina uyari yazmak
         */

        String dosyaYolu = "src/day28_exceptions/deneme.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

            int k=0;
            while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
                System.out.print((char) k);
            }



        } catch (FileNotFoundException e) {

            System.out.println("Verilen dosya yolu hatali");

        } catch (IOException e) {
            System.out.println("Dosya okuma-yazma ile ilgili bir sorun var");
        }

    }
}
