package day21_localDateTime_varargs;

public class C06_Varargs {

    public static void main(String[] args) {

        // argument olarak verilen tamsayilardan
        // ilki haric geriye kalanlari toplayip
        // bulunan toplam degeri ile ilk sayinin carpimini
        // yazdiran bir method olusturun

        islem(2); // 0  geriyeKalanlar [] bos bir array oldu, toplam degerine baslangicta 0 atadik
        islem(2,4); // 2 * (4) ==> 8
        islem(3,5,6); // 3 * (5+6) ==> 33
        islem(1,6,8,4); // 1 * (6+8+4) ==> 18
        islem(3,6,5,3,1,2,4,6,8); // 105
    }

    public static void islem(int ilkSayi, int... geriyeKalanlar){

        int toplam = 0;

        for (int each : geriyeKalanlar
             ) {

            toplam += each;
        }

        System.out.println("Islem sonucu : " + toplam*ilkSayi);
    }
}
