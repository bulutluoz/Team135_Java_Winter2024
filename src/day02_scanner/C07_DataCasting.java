package day02_scanner;

public class C07_DataCasting {

    public static void main(String[] args) {

        boolean bl = true;
        char chr = 'a';
        byte byt = 23;
        short shrt = 258;
        int int1 = 577;
        long lng = 1899;
        float fl = 23.6f;
        double dbl = 44.6;
        String str = "Java Candir";

        // bl = (boolean) chr;
        // bl = byt;
        // bl = str;

        // str = bl;
        // str = (String) chr;
        // str = fl;

        dbl = fl;
        dbl = lng;
        dbl = int1;
        dbl = shrt;
        dbl = byt;

        lng = (long)dbl;
        lng = (long)fl;
        lng = int1;
        lng = shrt;
        lng = byt;


        int1 = (int)dbl;
        int1 = (int)fl;
        int1 = (int)lng;
        int1 = shrt;
        int1 = byt;
    }
}
