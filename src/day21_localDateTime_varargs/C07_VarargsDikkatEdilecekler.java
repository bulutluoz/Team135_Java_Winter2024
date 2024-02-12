package day21_localDateTime_varargs;

public class C07_VarargsDikkatEdilecekler {

    public static void main(String[] args) {

        /*
            Varargs konusunda dikkat etmemiz gereken tek bir sey var

            EGER bir method'da parametre olarak varargs varsa, en sonda olmalidir

            bu kuralin sonucu olarak,
            bir method'da birden fazla varargs OLAMAZ
         */
        // argument olarak verilen tamsayilardan
        // son sayi haric geriye kalanlari toplayip
        // bulunan toplam degeri ile son sayinin carpimini
        // yazdiran bir method olusturun

        islem(2); // 0
        islem(2,4); // (2) * 4 ==> 8
        islem(3,5,6); // (3+5) * 6  ==> 48
        islem(1,6,8,4); // (1+6+8) * 4 ==> 60
        islem(3,6,5,3,1,2,4,6,8); // 240
    }

    //public static void islem(int... geriyeKalanlar, int sonSayi){
      // varargs devreye girdiginde
      // tum argumentleri alir
      // sonda baska element ayirmaniza izin vermez
    //}

    public static void islem(int... geriyeKalanlar){
        // varargs sonrasinda eleman ayiramadigimiz icin
        // soruda istenilen islemi tek vararg icinde halledelim

        int toplam = 0;
        int sonSayi = geriyeKalanlar[geriyeKalanlar.length-1];

        for (int i = 0; i <= geriyeKalanlar.length-2 ; i++) {

            toplam  += geriyeKalanlar[i];
        }

        System.out.println("Islem sonucu : " + toplam*sonSayi);
    }
}
