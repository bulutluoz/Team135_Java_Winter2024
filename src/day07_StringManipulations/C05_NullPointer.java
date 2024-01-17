package day07_StringManipulations;

public class C05_NullPointer {

    public static void main(String[] args) {

        // BAZEN degeri daha sonra atanmak uzere,
        // deger atanmadan bir non primitive variable olusturmak isteriz.
        //

        String ogrenci1 ;

        // System.out.println(ogrenci1); // Variable 'ogrenci1' might not have been initialized
                                         // ogrenci1'e deger atanmamis olabilir


        String ogrenci2 = "";

        System.out.println("Ogrenci2 :"+ogrenci2+"--"); // Ogrenci2 :--

        // "" de olsa ogrenci2'ye bir deger atanmis oluyor
        // Java'ya deger atanmayan kac ogrenci var diye sorsak
        // ogrenci2'yi DEGER ATANDI olarak kabul eder


        // null bir deger degil ogrenci3'un degeri olmadigini soyleyen bir isaretcidir(pointer)
        // null mavi olmasindan da anlasilacagi gibi bir keyword'dur
        String ogrenci3 = null ;

        System.out.println(ogrenci3); // null

        // bu sayede ogrenci3'u yazdirabiliriz
        // Java da ogrenci3'u DEGER ATANMADI olarak kabul eder

        System.out.println(ogrenci3 + " deger degil pointer'dir");
        // System.out.println(ogrenci1.length());
        System.out.println(ogrenci2.length());//0
        //System.out.println(ogrenci3.length()); // NullPointerException

        // System.out.println(ogrenci1.isEmpty());
        System.out.println(ogrenci2.isEmpty());// true
        System.out.println(ogrenci3.isEmpty());// NullPointerException
    }
}
