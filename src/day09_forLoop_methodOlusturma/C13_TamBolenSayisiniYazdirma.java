package day09_forLoop_methodOlusturma;

public class C13_TamBolenSayisiniYazdirma {

    public static void main(String[] args) {

        // Verilen pozitif bir tamsayinin
        // pozitif tam bolen sayisini yazdiran bir method olusturun
        // PTBS  input : 20  output :6    (1,2,4,5,10,20)

        tamBolenSayisiniYazdir(20); // Verilen 20 sayisinin 6 adet pozitif tam boleni var
        tamBolenSayisiniYazdir(10); // Verilen 10 sayisinin 4 adet pozitif tam boleni var

    }

    public static void tamBolenSayisiniYazdir(int sayi){

        int sayac = 0;

        for (int i = 1; i <=sayi ; i++) {

            if (sayi % i == 0){
                sayac++;
            }

        }

        System.out.println("Verilen " + sayi +" sayisinin " + sayac + " adet pozitif tam boleni var");
    }

}
