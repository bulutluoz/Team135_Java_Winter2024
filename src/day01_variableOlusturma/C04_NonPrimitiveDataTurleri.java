package day01_variableOlusturma;

public class C04_NonPrimitiveDataTurleri {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDIR

        System.out.println(str.toLowerCase()); // java candir

        System.out.println(str); // Java Candir


        // tum harfler buyuk harf olacak sekilde
        // kalici olarak kaydetmek isterseniz

        str = str.toUpperCase();

        System.out.println(str); // JAVA CANDIR
    }
}
