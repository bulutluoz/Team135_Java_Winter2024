package day09_forLoop_methodOlusturma;

public class C14_IsmiIstenenFormattayazdirma {

    public static void main(String[] args) {

        // Verilen isim,soyisim ve KK numarasini asagida verilen formatta yazdiran
        // bir method olusturun
        // input Ali, Kayali, 1234567890123456
        // output A** K*****, **** **** **** 3456

        isimDuzenleYazdir("Berk","Yilmazlar","9087123465436789");
        // B*** Y********, **** **** **** 6789

        isimDuzenleYazdir("Selcuk emin","Yilmaz","7658987623415674");
        // S***** **** Y*****, **** **** **** 5674
    }


    public static void isimDuzenleYazdir(String isim, String soyisim, String kkNo){

        String duzenlenmisHali = isim.toUpperCase().charAt(0) +
                                 isim.substring(1).replaceAll("\\w","*")+
                                 " "+
                                 soyisim.toUpperCase().charAt(0)+
                                 soyisim.substring(1).replaceAll("\\w","*")+
                                 ", **** **** **** " +
                                 kkNo.substring(kkNo.length()-4);

        System.out.println(duzenlenmisHali);

    }
}
