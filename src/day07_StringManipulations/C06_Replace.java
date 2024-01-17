package day07_StringManipulations;

public class C06_Replace {
    public static void main(String[] args) {

        // CharSequence : char serisi, yani char'larin yan yana gelip birlesmesi demektir
        // char'lari birlestirince String olur

        String str = "Java Candir";

        System.out.println(str.replace('a', 'A')); // JAvA CAndir

        System.out.println(str.replace("a", "A"));// JAvA CAndir

        System.out.println(str.replace("Candir", "Kolaydir")); // Java Kolaydir

        System.out.println(str.replace("a", "AAA")); // JAAAvAAA CAAAndir

        System.out.println(str.replace("Java", "")); //  Candir

        System.out.println(str.replace("a", ""));// Jv Cndir

        // Sadece ilk a'yi A yapalim
        System.out.println(str.replaceFirst("a", "A"));// JAva Candir


        str = ".,%          Ali bakkaldan 3 ekmek al, 4 gel";

        // verilen str'daki ilk harf veya rakami a yapin

        System.out.println(str.replaceFirst("\\w", "a"));

        // verilen yazidaki ilk rakami 5 yapin

        System.out.println(str.replaceFirst("\\d", "5"));
        // .,%          Ali bakkaldan 5 ekmek al, 4 gel
    }
}
