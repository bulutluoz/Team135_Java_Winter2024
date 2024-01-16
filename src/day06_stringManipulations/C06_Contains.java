package day06_stringManipulations;

public class C06_Contains {

    public static void main(String[] args) {

        String str = "String guzelmis";

        // sadece var olup olmadigi ile ilgilenir
        // kac tane oldugu ile ilgilenmez

        System.out.println(str.contains("a")); // false

        System.out.println(str.contains("g g")); // true

        System.out.println(str.contains("String guzelmis")); // true

        System.out.println(str.contains("")); // true

        System.out.println(str.contains("G")); // false

        // eger buyuk kucuk harf onemli olmadan G icerip icermedigini kontrol etmek isterseniz

        System.out.println(str.toLowerCase().contains("g")); // true
        System.out.println(str.toUpperCase().contains("G")); // true

    }
}
