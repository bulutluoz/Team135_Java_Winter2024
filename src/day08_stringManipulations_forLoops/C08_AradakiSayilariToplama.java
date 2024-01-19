package day08_stringManipulations_forLoops;

import java.util.Scanner;

public class C08_AradakiSayilariToplama {

    public static void main(String[] args) {
        // Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Baslangic icin pozitif bir tamsayi giriniz..");
        int baslangic = scanner.nextInt();

        System.out.println("Bitis icin pozitif bir tamsayi giriniz..");
        int bitis = scanner.nextInt();

        if (bitis < baslangic){
            System.out.println("Bitis degeri baslangictan kucuk olamaz");
        }else {// toplama islemini yapabiliriz

            int toplam =0;

            for (int i = baslangic; i <=bitis ; i++) {

                toplam += i;
            }

            System.out.println("Baslangic ve bitis arasindaki sayilarin toplami : " + toplam);
        }
    }
}
