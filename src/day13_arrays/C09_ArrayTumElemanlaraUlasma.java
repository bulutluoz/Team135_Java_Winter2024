package day13_arrays;

public class C09_ArrayTumElemanlaraUlasma {

    public static void main(String[] args) {

        int[] sayilar = {4,7,8,1};

        // sayilar array'indeki elemanlarin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < sayilar.length ; i++) {

            toplam += sayilar[i];
        }

        System.out.println(toplam); // 20



        int[][] arr = {{3,5},{2,3,4,2},{1}};

        toplam = 0;

        for (int i = 0; i < arr.length; i++) { // outer array'in icindeki inner array'leri kontrol eder

            for (int j = 0; j < arr[i].length ; j++) { // inner array'lerdeki sayilari kontrol eder

               toplam += arr[i][j];
            }

        }

        System.out.println("iki katli array'deki sayilarin toplami : " + toplam);
    }
}
