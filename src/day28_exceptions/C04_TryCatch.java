package day28_exceptions;

public class C04_TryCatch {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 0;


        try {

            System.out.println("satir1");
            System.out.println("satir2");
            System.out.println(sayi1/sayi2);
            System.out.println("satir3");
            System.out.println("satir4");

        } catch (ArithmeticException e) {

            // e catch cumlesinin yakaladigi exception'i kaydettigi variable ismidir

            // try bolumunde olusan exception'in catch bolumunde yakalanabilmesi icin
            // uygun exception turu yazilmalidir

            // catch bolumu hatayi yakaladiginda
            // hatayi e variable'ina kaydeder ve calismaya devam eder

            // Eger Java'nin yakaladigi hatayi tamamen veya kismen yazdirmak isterseniz
            // e objesi ile hazir method'lar kullanabilirsiniz

            // System.out.println("Ikinci sayi 0 olamaz");
            // e.printStackTrace();
            // java.lang.ArithmeticException: / by zero
            //	at day28_exceptions.C04_TryCatch.main(C04_TryCatch.java:12)

            // System.out.println(e.toString());
            // java.lang.ArithmeticException: / by zero

            // System.out.println(e.getCause()); // null

            System.out.println(e.getMessage()); // / by zero

        }
    }
}
