package day09_forLoop_methodOlusturma;

public class C05_NestedForLoop {

    public static void main(String[] args) {
        /*
            Kullanicidan bir sayi alip
            asagidaki sekli olusturun

            or : sayi 4
            1 2 3 4
            2 4 6 8
            3 6 9 12
            4 8 12 16
         */

        // for loop ile 1 2 3 4 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(i*1 + " ");
        }
        System.out.println("");

        // for loop ile 2 4 6 8 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(i*2 + " ");
        }
        System.out.println("");

        // for loop ile 3 6 9 12 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(i*3 + " ");
        }
        System.out.println("");


        // for loop ile 4 8 12 16 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(i*4 + " ");
        }
        System.out.println("");

        System.out.println("===============");

        for (int i = 1; i <=4 ; i++) { // disardaki loop satirlari kontrol eder

            for (int j = 1; j <=4 ; j++) { // icerdeki loop her satirdaki sutunlari kontrol eder

                System.out.print(i*j + "  ");

            }
            System.out.println("");
        }

    }
}
