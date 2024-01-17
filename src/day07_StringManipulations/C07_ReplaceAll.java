package day07_StringManipulations;

public class C07_ReplaceAll {

    public static void main(String[] args) {

        String str = "#Ja45!v0a C1&*an073di23@r";

        // sayilardan kurtulmak istiyorum

        /*
        str= str.replace("4","");
        str= str.replace("5","");
        str= str.replace("0","");
        str= str.replace("7","");
        str= str.replace("3","");
        str= str.replace("2","");
        str= str.replace("1","");
         */

        str.replace("\\d","");
        // replace() regex kabul etmez, char veya charSequence kabul eder

        System.out.println(str); // #Ja45!v0a C1&*an073di23@r

        // Eger regex kullanarak butun sayilari yok etmek istersek
        // replace() degil replaceAll() kullanmaliyiz

        str = str.replaceAll("\\d","");

        System.out.println(str); // #Ja!va C&*andi@r

        // space haric tum ozel karakterleri silin
        // space'i yok etmemek icin space yerine gecici olarak bir deger atayalim
        // sayilari temizledigimiz icin space yerine herhangi bir sayi atayalim
        str= str.replace(" ","3");

        str = str.replaceAll("\\W",""); // Java3Candir

        str= str.replace("3"," ");

        System.out.println(str); // Java Candir

    }
}
