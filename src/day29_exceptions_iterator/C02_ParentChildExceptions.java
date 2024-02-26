package day29_exceptions_iterator;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ParentChildExceptions {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*
            Olusmasi muhtemel exception'lar arasinda
            Parent - Child iliskisi varsa

            Parent exception, daha fazla exception yakalamak uzere hazirlanmistir
            Parent exception, tum child exception'lari kapsadigindan
            child exception'larin yakalayacagi exception'lari da yakalar

            Bu sebeple iki exception'i yazmak yerine
            daha kapsamli olan parent exception'i yazmak yeterli olacaktir
         */






        // deneme.txt dosyasinin icerigini yazdirin

        String dosyaYolu = "src/day28_exceptions/deneme.txt";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

        int k=0;
        while((k= fileInputStream.read() ) != (-1)) { // dosyayi okuyup, bize getirme
            // Unhandled exception: java.io.IOException
            System.out.print((char) k);
        }

    }
}
