package day13_arrays;

public class C02_PozitifElemanlariToplama {

    public static void main(String[] args) {
        //Soru 2- Verilen bir array’deki
        //        pozitif tamsayilari toplayip
        //        sonucu bize donduren bir method yaziniz.

        int[] arr = {3,5,-6,8,0,-9,5};

        System.out.println(pozitifElemanlariTopla(arr)); // 21

        // verilen int array'deki pozitif tamsayilarin
        // ortalamasini double olarak donduren bir method olusturun

        System.out.println(pozitifElemanlarinOrtalamasiniHesapla(arr)); // 21 / 4 ==> 5.25

    }


    public static int pozitifElemanlariTopla(int[] arr){
        int toplam = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0){

                toplam += arr[i] ;
            }
        }

        return toplam;
    }

    public static double pozitifElemanlarinOrtalamasiniHesapla(int[] arr){

        double toplam = 0 ;
        int pozitifSayiAdedi = 0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] > 0){

                toplam += arr[i];
                pozitifSayiAdedi++;
            }
        }

        return toplam/pozitifSayiAdedi ;
    }

}
