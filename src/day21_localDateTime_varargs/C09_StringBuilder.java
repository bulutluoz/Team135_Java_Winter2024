package day21_localDateTime_varargs;

public class C09_StringBuilder {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Ali Can");

        System.out.println(sb1); // Ali Can

        System.out.println(sb1.length()); // 7
        System.out.println(sb1.capacity()); // 16 + length ==> 23


        StringBuilder sb2 = new StringBuilder(7);
        sb2.append("Ali Can");

        System.out.println(sb2.length()); // 7
        System.out.println(sb2.capacity()); // 7


        sb2.append(" Yilmaz");
        System.out.println(sb2); // Ali Can Yilmaz

        System.out.println(sb2.length()); // 14
        System.out.println(sb2.capacity()); // eski capacity * 2 + 2 ==> 16

        sb2.append(" Son");
        System.out.println(sb2); // Ali Can Yilmaz Son

        System.out.println(sb2.length()); // 18
        System.out.println(sb2.capacity()); // 2*16+2 = 34 karakterlik yer actim


        // capacity'yi length'e indirgemek istersek

        sb2.trimToSize();

        System.out.println(sb2); // Ali Can Yilmaz Son
        System.out.println(sb2.length()); // 18
        System.out.println(sb2.capacity()); // 18

        System.out.println(sb2.reverse()); // noS zamliY naC ilA

        System.out.println(sb2);  // noS zamliY naC ilA

        System.out.println(sb2.reverse()); // Ali Can Yilmaz Son

        System.out.println(sb2);  // Ali Can Yilmaz Son

        String str = "Java Candir";

        sb2.append(str,4,8);

        System.out.println(sb2); // Ali Can Yilmaz Son Can

        sb2.delete(19,22);

        System.out.println(sb2); // Ali Can Yilmaz Son

        sb2.deleteCharAt(18);

        System.out.println(sb2); // Ali Can Yilmaz Son

        sb2.delete(8,15);

        System.out.println(sb2); // Ali Can Son

        sb2.insert(3," Kemal");

        System.out.println(sb2); // Ali Kemal Can Son

        sb2.insert(0,str,0,5);

        System.out.println(sb2); // Java Ali Kemal Can Son

        sb2.replace(0,5,"");

        System.out.println(sb2); // Ali Kemal Can Son

        sb2.replace(14,17,"Koreli");

        System.out.println(sb2); // Ali Kemal Can Koreli




    }
}
