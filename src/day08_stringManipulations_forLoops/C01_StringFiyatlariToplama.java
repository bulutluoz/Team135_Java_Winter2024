package day08_stringManipulations_forLoops;

public class C01_StringFiyatlariToplama {

    public static void main(String[] args) {

        //Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        //		input1 : “15.35 €” , input2 : “11.40 €”
        //		output : 26.75 €


        String fiyat1 = "15.35 €";
        String fiyat2 = "11.40 €";
        // Eger para birimi degisebilir denseydi, sona  € yazmak yerine
        // en bastaki para birimini yazmaliydik

        // bunun icin space'den sonrasini almamiz lazim

        int spaceIndex = fiyat1.indexOf(" ");
        String paraBirimi = fiyat1.substring(spaceIndex);


        System.out.println(fiyat2+fiyat1); // 11.40 €15.35 €

        fiyat1 = fiyat1.replaceAll("\\D","");
        fiyat2 = fiyat2.replaceAll("\\D","");

        System.out.println(fiyat2+fiyat1); // 11401535

        double fiyat1Dbl = Double.parseDouble(fiyat1);
        double fiyat2Dbl = Double.parseDouble(fiyat2);

        System.out.println(fiyat1Dbl+fiyat2Dbl); // 2675.0

        System.out.println(  (fiyat1Dbl+fiyat2Dbl)/100   + " €"      );



        System.out.println(  (fiyat1Dbl+fiyat2Dbl)/100   + paraBirimi      );
    }
}
