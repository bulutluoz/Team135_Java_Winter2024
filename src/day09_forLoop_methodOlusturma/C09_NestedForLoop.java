package day09_forLoop_methodOlusturma;

import java.util.Scanner;

public class C09_NestedForLoop {

    public static void main(String[] args) {

        /*
            Kullanicidan satir sayisini alip
            asagidaki sekli olusturun

            1
            1 2
            1 2 3
            1 2 3 4
            1 2 3 4 5

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { // satirlari

            for (int j = 1; j <=i ; j++) { // her satirdaki sutunu

                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }
}
