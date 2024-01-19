package day08_stringManipulations_forLoops;

public class C04_ForLoop {

    public static void main(String[] args) {

        // 1'den 10'a kadar(10 dahil) olan sayilari yazdirin

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // 2 basamakli cift sayilari yazdirin

        for (int i = 10; i < 100 ; i+=2 ) {

            System.out.print( i + " ");
        }
        System.out.println("");
        // 190'dan baslayip, geriye dogru 0'a kadar(0 dahil) 5'er beser azalarak yazdirin

        for (int i = 190; i >= 0 ; i-=5 ) {
            System.out.print(i + " ");
        }
        System.out.println("");

        // 3 basamakli sayilardan 17 ile bolunebilenleri yazdirin

        for (int i = 100; i <1000 ; i++) {
            if (i % 17 == 0){
                System.out.print(i + " ");
            }
        }





    }
}
