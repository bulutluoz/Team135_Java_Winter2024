package day06_stringManipulations;

public class C07_startsWith_endsWith {

    public static void main(String[] args) {

        String str = "Java gun gectikce guzellesiyor";

        // size sorsak, str ne ile basliyor ? J, Ja, Java, Java gun

        System.out.println(str.startsWith("Java")); // true  str Java ile mi basliyor?

        System.out.println(str.startsWith("J")); // true

        System.out.println(str.startsWith("Java gun")); // true

        System.out.println(str.startsWith("")); // true

        System.out.println(str.startsWith("Java gun gectikce guzellesiyor")); // true


        System.out.println(str.startsWith("a", 3));  // true
        // 3.index ve sonrasina bakar : a gun gectikce guzellesiyor
        // elde edilen metnin verilen prefix ile baslayip baslamadigini kontrol eder

        System.out.println(str.startsWith("e",9));  // false
        // gectikce guzellesiyor ==> e ile mi basliyor?


        str = "Java gun gectikce guzellesiyor";

        System.out.println(str.endsWith("yor")); // true

        System.out.println(str.endsWith("r")); //true

        System.out.println(str.endsWith("")); // true

        System.out.println(str.endsWith("Java gun gectikce guzellesiyor")); // true
    }
}
