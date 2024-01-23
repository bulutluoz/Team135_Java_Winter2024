package day09_forLoop_methodOlusturma;

public class C17_IsmiDuzenlekaydet {

    // Verilen isim,soyisim ve KK numarasini asagida verilen formatta
    // donduren bir method olusturun
    // input Ali, Kayali, 1234567890123456
    // output A** K*****, **** **** **** 3456

    public static void main(String[] args) {
        String isim = "Ali";
        String soyisim ="Can";
        String kkNo = "1234543267896543";

        // ismi duzenleyip kaydedelim
        String duzenlenmisHali = "";


        ismiDuzenleKaydet(isim,soyisim,kkNo);
        // 19.satirda method calisir ve duzenlenmis hali bize getirir
        // bu duzenlenmis halini YA kaydetmeli, YA DA direk yazdirmaliyiz

        System.out.println(ismiDuzenleKaydet(isim, soyisim, kkNo)); // A** C**, **** **** **** 6543


        // duzenlenmis halindeki tum *'lari # yapin
        duzenlenmisHali = ismiDuzenleKaydet(isim, soyisim, kkNo);
        System.out.println(duzenlenmisHali); // A** C**, **** **** **** 6543

        duzenlenmisHali = duzenlenmisHali.replace("*","#");

        System.out.println(duzenlenmisHali); // A## C##, #### #### #### 6543


    }


    public static String ismiDuzenleKaydet(String isim, String soyisim, String kkNo){

        String duzenlenmisHali= isim.toUpperCase().charAt(0) +
                                isim.substring(1).replaceAll("\\w","*")+
                                " "+
                                soyisim.toUpperCase().charAt(0)+
                                soyisim.substring(1).replaceAll("\\w","*")+
                                ", **** **** **** " +
                                kkNo.substring(kkNo.length()-4);
        return duzenlenmisHali;

    }
}
