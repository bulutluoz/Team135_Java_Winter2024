package day25_inheritanceDataTypeKullanimi_overriding;

public class C06_AvciKuslar extends C05_Kuslar{

    public void hareket() {
        System.out.println("ucarlar");
    }

    public void beslenme() {
        System.out.println("et yerler");
    }

    public void pence() {
        System.out.println("pencelidir");
    }

    public void gaga() {
        System.out.println("sivri gagali");
    }

    /*
        ozellikler variable olarak olusturulmussa
        Java data turune odaklanir
        data turu olarak secilen class ve parent'larina bakar
        ve ilk buldugunu kullanir

        ozellikler method olarak olusturuldugunda
        hem data turu, hem de constructor'in oldugu class ONEM KAZANIR

        - once aramaya data turu olan class'dan baslayip
          o ozellik bulunur,
          bulunduktan sonra constructor'in oldugu class'a kadar
          daha guncel bilgi var mi diye kontrol edilir

        - data turunden aramaya baslandiginda
          ozellik bulunamazsa CTE verir
          guncel halini arastirmaz

     */

    public static void main(String[] args) {

        C06_AvciKuslar kartal1 = new  C06_AvciKuslar();

        kartal1.omur(); // Ha yasar ve olurler

        kartal1.solunum(); // Ku akcigerle solunum
        kartal1.cogalma(); // Ku yumurtayla cogalirlar
        kartal1.kanat(); // Ku kanatlidirlar

        kartal1.hareket(); // Av ucarlar
        kartal1.beslenme(); // Av etle beslenirler
        kartal1.pence(); // Av pencelidir
        kartal1.gaga(); // Av sivri gagalidir


        C05_Kuslar kartal2 = new  C06_AvciKuslar();
        // Kartal2'nin BUTUN KUSLARIN sahip oldugu method'larin
        // en guncel halini goruntuler

        kartal2.omur(); // Ha yasar ve olurler

        kartal2.solunum(); // Ku akcigerle solunum
        kartal2.cogalma(); // Ku yumurtayla cogalirlar
        kartal2.kanat(); // Ku kanatlidirlar

        kartal2.hareket(); // Av ucarlar
        kartal2.beslenme(); // Av etle beslenirler
        // kartal2.pence(); // CTE aramaya kuslardan baslar ve pence bulamaz
        kartal2.gaga(); // Av sivri gagalidir












    }
}
