package day21_localDateTime_varargs;

public class C05_Varargs {

    public static void main(String[] args) {

        // argument olarak yollanan tamsayilardan
        // tek sayi olanlari toplayip, sonucu yazdiran bir method olusturun

        toplam(2); // 0
        toplam(2,4); // 0
        toplam(3,5,6); // 8
        toplam(1,6,8,4); // 1
        toplam(3,6,5,3,1,2,4,6,8); // 12


    }


    public static void toplam(int... sayilar){

        int toplam = 0;

        for ( int v :sayilar
             ) {
            if ( v %2 != 0 ) {
                toplam += v;
            }
        }

        System.out.println("tek sayilarin toplami : " + toplam);
    }
}
