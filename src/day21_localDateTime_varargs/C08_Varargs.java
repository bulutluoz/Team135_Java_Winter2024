package day21_localDateTime_varargs;

public class C08_Varargs {

    public static void main(String[] args) {

        islem(3,"Ali","Veli"); // 3 * 2 ==> 6
        islem(5,"A","V","K"); // 5 * 3 ==> 15
        islem(4); // 4 * 0 ==> 0
        // islem("a","b","c"); vararg bos kalabilir, ama diger parametreler bos kalmaz

    }


    public static void islem(int a, String... b){

        System.out.println( a * b.length);
    }
}
