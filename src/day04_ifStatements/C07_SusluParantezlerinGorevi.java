package day04_ifStatements;

public class C07_SusluParantezlerinGorevi {

    public static void main(String[] args) {
        /*
            eger if ve else'den sonra {} kullanmazsak
            Java ilk ;'e kadar olan kismi body olarak kabul eder
         */


        int sayi = 44;

        // sayi cift ise ayri ayri "sayi cift" ve "Cift sayilar 2 ile bolunur" yazdirin
        // sayi tek sayi ise ayri ayri "tek sayi" ve "Tek sayilar 2 ile bolunmez" yazdirin

        if (sayi%2==0)
            System.out.println("sayi cift"); // if body'si olur ve sadece 1 satir olabilir
            //System.out.println("Cift sayilar 2 ile bolunur");
        else
            System.out.println("tek sayi"); // else body'si olur ve sadece 1 satir olabilir
            System.out.println("Tek sayilar 2 ile bolunmez"); // bu satir if-else'in disinda kalir
                                                              // ve HER DURUMDA calisir




    }
}
