package day13_arrays;

public class C10_OrtlamaBulma {

    public static void main(String[] args) {

        // Verilen iki katli int bir array'de
        // cift sayi olan elementlerin adedini ve
        // double olarak ortalamasini yazdirin

        int[][] arr = {{3,5,6},{1,8,2,3,4,2},{1,8,9,4}};

        int ciftSayiAdedi = 0;
        double toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j] % 2 == 0){

                    toplam += arr[i][j];
                    ciftSayiAdedi++;
                }
            }
        }

        System.out.println("Array'de bulunan " + ciftSayiAdedi +
                            " adet cift sayinin ortalamasi : " + toplam/ciftSayiAdedi);
    }
}
