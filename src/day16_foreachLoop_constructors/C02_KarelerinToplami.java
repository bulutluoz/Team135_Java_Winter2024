package day16_foreachLoop_constructors;

public class C02_KarelerinToplami {

    public static void main(String[] args) {

        // Soru 2- Verilen int array’deki
        //         her elementin karelerini alip,
        //         karelerinin toplamini yazdiran bir method olusturun.


        int[] sayilar = {1,3,2,3,2,3,1,4,3,2};

        int karelerinToplami = 0;

        for ( int each: sayilar
             ) {

            karelerinToplami += each*each;
        }

        System.out.println("Arraydeki sayilarin kareleri toplami : " + karelerinToplami);

        // Arraydeki sayilarin kareleri toplami : 66
    }
}
