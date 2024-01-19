package day08_stringManipulations_forLoops;

public class C05_ForLoop {
    public static void main(String[] args) {

        // 123 ile 789 (dahil) arasindaki sayilarin toplamini yazdirin

        int toplam = 0;

        for (int i = 123; i <=789 ; i++) {

            toplam += i;
        }

        System.out.println("toplam isleminin sonucu : " + toplam);
        // toplam isleminin sonucu : 304152


        // 897 ile 1345 (dahil) arasindaki 7 ile bolunebilen sayilari toplayin

        toplam = 0;

        for (int i = 897; i <=1345 ; i++) {

            if ( i % 7 == 0 ){
                toplam += i;
            }

        }

        System.out.println("toplam isleminin sonucu : " + toplam);


        // verilen bas ve bitis sayilari dahil olarak
        // aradaki tum sayilari toplayip, sonucu yazdirin

        int bas = 50;
        int bit = 145;
        toplam = 0;
        for (int i = bas; i <=bit ; i++) {
            toplam += i;
        }

        System.out.println("toplam isleminin sonucu : " + toplam);
    }
}
