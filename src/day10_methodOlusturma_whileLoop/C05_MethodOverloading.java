package day10_methodOlusturma_whileLoop;

public class C05_MethodOverloading {

    public static void main(String[] args) {
        /*
            Bir class'da ayni isimde birden fazla method olabilir mi ?

            Eger bir class'da ayni isimde birden fazla method olusturmak isterseniz.
            Method signature'inda degisiklik yapmalisiniz

            Method signature = method adi + parametrelerin data turleri

            Ayni isimde method olusturmak istedigimizde,
            signature degistirmek icin 2 ihtimal kalir
            - parametre sayisini degistirmek
            - parametrelerin data turunu
              veya farkli data turlerindeki parametrelerin siralamasini degistirmek

            Method signature'ini degistirmek icin
            Parametre isimlerini degistirmek veya method body'sini degistirmek fayda etmez

         */




    }

    public static void toplama(int sayi1, int sayi2){ // toplama int int
        System.out.println("Iki int'in toplami : " + (sayi1+sayi2));
    }

    public static void toplama(double a, int b){ // toplama double int
        double sonuc = a+b;
        System.out.println("double ve int'in toplami"+ sonuc);
    }

    public static void toplama(int a, double b){ // toplama int double
        double sonuc = a+b;
        System.out.println("int ve double'in toplami"+ sonuc);
    }

    public static void toplama(int sayi1, int sayi2,int sayi3){ // toplama int int int
        System.out.println("Uc int'in toplami : " + (sayi1+sayi2+sayi3));
    }


}
