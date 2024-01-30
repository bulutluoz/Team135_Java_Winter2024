package day14_arrays_arrayLists;

public class C03_SonElemanlariToplama {

    public static void main(String[] args) {

        //Soru 5- Verilen 2 katli bir array’de
        //        her bir inner array’in son elementlerinin
        //        toplaminini yazdiran bir method olusturun.


        int[][] arr = {{3,5,6},{1,8,2,3,4,2},{1,8,5,4},{5,3},{7}};

        sonElemanlarinToplami(arr);

    }

    public static void sonElemanlarinToplami(int[][] arr){

        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {
            toplam += arr[i][arr[i].length-1];
        }

        System.out.println("Son elemanlarin toplami : " + toplam);
        // Son elemanlarin toplami : 22

    }
}
