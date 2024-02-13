package day22_stringBuilder_accessModifier_encapsulation;

public class C01_StringBuilder {

    public static void main(String[] args) {

        /*
            StringBuilder java'da metin iceren class'lardan birisidir
            String'den farki mutable olmasidir
            Yani method ile yapilan degisiklikler kalici olur

            ANCAK burada dikkat etmemiz gereken sey
            kullandigimiz method'un bize ne döndürdüğüdür
            Eger bize StringBuilder getiriyorsa degisiklik kalici olur
            ama String veya farkli bir data turunden sonuc donduruyorsa
            degisiklik kalici olmaz
         */

        StringBuilder sb = new StringBuilder("Java Candir");

        sb.append("."); // Java Candir.
        sb.insert(4," Gercekten"); // Java Gercekten Candir.
        sb.replace(15,21,"Guzeldir"); // Java Gercekten Guzeldir.
        sb.delete(5,15);// Java Guzeldir.
        sb.deleteCharAt(13); // Java Guzeldir

        System.out.println(sb.substring(5)); // Guzeldir
        System.out.println(sb.subSequence(0, 4)); // Java
        System.out.println(sb); // Java Guzeldir






    }
}
