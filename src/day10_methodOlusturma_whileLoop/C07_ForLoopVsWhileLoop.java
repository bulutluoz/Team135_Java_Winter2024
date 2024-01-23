package day10_methodOlusturma_whileLoop;

public class C07_ForLoopVsWhileLoop {

    public static void main(String[] args) {
        // Baslangic ve bitis degerleri belli ise
        // veya bir islemi kac kere yapacagimizi biliyorsak
        // for loop kullanmak ideal olur

        // 1'den 10'a kadar olan sayilari yan yana yazdirin

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");


        // ayni islemi while loop ile yapalim
        int sayi =1;

        while (sayi<=10){
            System.out.print(sayi + " ");
            sayi++;
        }


    }
}
