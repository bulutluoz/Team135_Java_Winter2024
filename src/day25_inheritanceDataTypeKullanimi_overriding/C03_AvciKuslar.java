package day25_inheritanceDataTypeKullanimi_overriding;

public class C03_AvciKuslar extends C02_Kuslar{
    String hareket = "ucarlar";
    String beslenme = "et yerler";
    String pence = "pencelidir";
    String gaga = "sivri gagali";

    /*
        Java'da ozellikler variable olarak olusturulursa
        Java data Type'ina odaklanir
        yani ozelligi aramaya data type olarak yazilan class'dan baslar
     */


    public static void main(String[] args) {

        C03_AvciKuslar kartal1 = new C03_AvciKuslar();
        // kartal'in butun avci kuslar ile ortak olan ozelliklerini goruntuler

        System.out.println(kartal1.omur); // Ha yasar ve olurler

        System.out.println(kartal1.solunum); //Ku Akcigerle
        System.out.println(kartal1.cogalma); // Ku yumurtayla cogalir
        System.out.println(kartal1.kanat); // Ku kanatlidir

        System.out.println(kartal1.hareket); // Av ucarlar
        System.out.println(kartal1.beslenme); // Av etle beslenir
        System.out.println(kartal1.gaga); // Av sivri gagalidir
        System.out.println(kartal1.pence); // Av pencelidir


        C02_Kuslar kartal2 = new C03_AvciKuslar();
        // kartal2'nin BUTUN KUSLAR ile ayni olan ozelliklerini goruntuler

        System.out.println(kartal2.omur); // Ha yasar ve olurler

        System.out.println(kartal2.solunum); //Ku Akcigerle
        System.out.println(kartal2.cogalma); // Ku yumurtayla cogalir
        System.out.println(kartal2.kanat); // Ku kanatlidir

        System.out.println(kartal2.hareket); // Ha hareket ederler
        System.out.println(kartal2.beslenme); // Ha beslenirler
        System.out.println(kartal2.gaga); // Ku gagalidir
        // System.out.println(kartal2.pence); // CTE aramaya kuslardan baslar ve pence bulamaz

        C01_Hayvanlar kartal3 = new C03_AvciKuslar();
        // kartal3'nin BUTUN HAYVANLAR ile ayni olan ozelliklerini goruntuler

        System.out.println(kartal3.omur); // Ha yasar ve olurler

        System.out.println(kartal3.solunum); // Ha nefes alir
        System.out.println(kartal3.cogalma); // Ha cogalir
        // System.out.println(kartal3.kanat); // CTE aramaya hayvanlar class'indan baslar ve bulamaz

        System.out.println(kartal3.hareket); // Ha hareket ederler
        System.out.println(kartal3.beslenme); // Ha beslenirler
        // System.out.println(kartal3.gaga); // CTE aramaya hayvanlar class'indan baslar ve bulamaz
        // System.out.println(kartal3.pence); // CTE aramaya kuslardan baslar ve pence bulamaz













    }
}
