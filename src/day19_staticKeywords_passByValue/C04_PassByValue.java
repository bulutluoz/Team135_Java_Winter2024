package day19_staticKeywords_passByValue;

public class C04_PassByValue {


    public static void main(String[] args) {

        // verilen sayiya, karesini atayip
        // sayiyi bize donduren bir method olusturun

        int sayi = 20;

        System.out.println(karesiniAl(sayi)); // 400

        System.out.println("Method call'dan sonra main method'da sayi : "+ sayi); // 20

        // Eger method'da yapilan degisimin main method'da kalici olmasini istersek
        // atama yapabiliriz

        sayi = karesiniAl(sayi);

        System.out.println("Atama yaptiktan sonra sayi : "+sayi); // 400

    }

    public static int karesiniAl(int sayi){


        sayi = sayi * sayi;

        System.out.println("method'da sayi degeri : " + sayi);
        // method'da sayi degeri : 400
        return sayi;
    }
}
