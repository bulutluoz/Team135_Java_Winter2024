package day09_forLoop_methodOlusturma;

import java.util.Scanner;

public class C08_NestedForLoop {

    public static void main(String[] args) {
        /*
            Kullanicidan satir ve sutun sayisini alip
            asagidaki sekli olusturun

            or satir 3, sutun 7

            2 3 4 5 6 7 8
            3 4 5 6 7 8 9
            4 5 6 7 8 9 10
         */



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz...");
        int satir = scanner.nextInt();

        System.out.println("Lutfen her satirdaki sutun sayisini giriniz...");
        int sutun = scanner.nextInt();

        for (int i = 1; i <=satir ; i++) { // satirlar

            for (int j = 1; j <=sutun ; j++) { // satirdaki sutunlar

                System.out.print(i+j + " ");
            }
            System.out.println("");
        }

    }
}
