package day04_ifStatements;

public class C02_BagimsizIfCumleleri {
    public static void main(String[] args) {

        int a = 210;
        int b = 130;

        // a b'den buyuk ise "a daha buyuk" yazdirin

        if (a>b){
            System.out.println("a daha buyuk");
        }

        // a cift ise "a cift sayi" yazdirin

        if (a % 2 ==0){
            System.out.println("a cift sayi");
        }

        // b 100'den kucukse "b kucuk sayi" yazdirin

        if ( b < 100 ){
            System.out.println("b kucuk sayi");
        }






    }
}
