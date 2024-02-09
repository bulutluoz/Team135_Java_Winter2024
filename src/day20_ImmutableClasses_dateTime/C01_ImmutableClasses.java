package day20_ImmutableClasses_dateTime;

public class C01_ImmutableClasses {

    public static void main(String[] args) {

        /*
            Java metin iceren 3 farkli non-primitive data turune sahiptir

            String ==> immutable

            StringBuilder ==> mutable
            StringBuffer ==> mutable
         */

        String str = "Java";

        str = str.replace('J','T');

        System.out.println(str); // Tava

        str = str.replace('T','H');

        System.out.println(str); // Hava


        // 27. satir ile 40.satir arasinda Java kac abc objesi olusturur?

        String abc = "";

        for (int i = 1; i <=100 ; i++) {

            abc = abc + i;
        }

        System.out.println(abc);



    }
}
