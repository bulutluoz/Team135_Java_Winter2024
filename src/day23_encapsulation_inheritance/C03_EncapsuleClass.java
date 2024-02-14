package day23_encapsulation_inheritance;

public class C03_EncapsuleClass {

    private String isim = "isim variable'ina atama yapilabilsin ama yazdirilamasin";
    private String okulIsmi = "Yildiz Koleji"; // herkes yazdirabilsin ama kimse degistiremesin

    public String adres ; // bu variable'a herkes ulasabilir
    private String telefon;
    // hem yazdirilabilsin, hem de deger atabilsin

    public void setIsim(String isim) {
        this.isim = isim;
        // ogrenciyi bu bilgilerle database'e kaydedebiliriz
    }

    public String getOkulIsmi() {
        return okulIsmi;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
