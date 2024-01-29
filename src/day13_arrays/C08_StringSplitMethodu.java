package day13_arrays;

import java.util.Arrays;

public class C08_StringSplitMethodu {

    public static void main(String[] args) {

        String str = "Ali topu at, at Ali at";

        System.out.println(Arrays.toString(str.split(",")));
        // [Ali topu at,  at Ali at]

        System.out.println(Arrays.toString(str.split("at")));
        // [Ali topu , , ,  Ali ]

        System.out.println(Arrays.toString(str.split("a")));
        // [Ali topu , t, , t Ali , t]

        // verilen cumleyi kelimelere ayirin

        String[] kelimeler = str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
        // [Ali, topu, at,, at, Ali, at]

        // verilen cumledeki karakterleri bir array olarak kaydedin
        String[] karakterler = str.split("");
        System.out.println(Arrays.toString(karakterler));
        // [A, l, i,  , t, o, p, u,  , a, t, ,,  , a, t,  , A, l, i,  , a, t]

    }
}
