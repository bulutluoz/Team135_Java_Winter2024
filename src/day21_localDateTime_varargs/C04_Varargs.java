package day21_localDateTime_varargs;

public class C04_Varargs {

    public static void main(String[] args) {

        /*
            Varargs : variety of arguments, demektir
            yani bir method kullanirken, yollayacagimiz argument sayisi degisken ise
            farkli method'lar olusturmak yerine
            method'da parametre olarak varargs kullanabiliriz

            Java varargs'i array altyapisi ile kullanir
            yani yollanan tum argument'leri bir array'e koyar

         */


        carpim(5,7); // 35
        carpim(-3,-21); // 63
        carpim(3,4,5); // 60

        toplam(2); // 2
        toplam(2,4); // 6
        toplam(3,5,6); // 14
        toplam(1,6,8,4); // 19
        toplam(3,6,5,3,1,2,4,6,8); // 38

    }

    public static void carpim(int a, int b){

        System.out.println(a*b);
    }

    public static void carpim(int a, int b,int c){

        System.out.println(a*b*c);
    }

    public static void toplam(int... sayilar){
        // sayilar bir array
        // array'in butun elementlerini toplamak icin
        int toplam = 0;

        for (int each:sayilar
             ) {
            toplam += each;
        }

        System.out.println("Tum sayilarin toplami : " + toplam);
    }
}
