package day28_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C05_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        /*
            Bildigimiz exception'lar

            Exception

            RunTimeException

            ArraysIndexOutOfBoundsException
            StringIndexOutOfBoundsException
            ArithmeticException
            NullPointerException
            InputMismatchException


            Compile Time Exceptions

            Compile Time Exception,
            kodlarimizi yazdigimiz sirada Javanin farkina vardigi exception turleridir
            Genellikle dosya islemlerinde karsilasiriz

            Compile Time Exception'lar da RunTimeExceptions gibi
            try-catch bloklari ile handle edilip
            sorun olussa bile kodun calismaya devam etmesi saglanabilir

            Compile Time Exception'da java bize bir opsiyon daha sunuyor

            EGER hata olusursa kodlarin calismaya devam etmesini ISTEMIYORSANIZ
            amaciniz sadece KIRMIZI CIZGIYI yokedip java'nin calismasini saglamak ise
            method signature'ina THROWS keywordu ile uyari ekleyebilirsiniz

            throws FileNotFoundException
            bu sadece bir uyari yazisidir
            exception olusursa, onu kontrol altina almaz
            exception firlatir ve calismayi durdurur
         */

        String dosyaYolu = "src/day28_exceptions/deneme.txt";

        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        // Unhandled exception: java.io.FileNotFoundException

    }
}
