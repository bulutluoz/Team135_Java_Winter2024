package day17_constructors;

public class C05_ConstructorCall {

    C05_ConstructorCall(){
        // C05_ConstructorCall("Ali"); // Method call expected
        // isim(parametre) yazimi method call icin kullanilir
        // Constructor call yapmak icin
        // this(ilgili parametreler); kullanilir
        this(7); // Call to 'this()' must be first statement in constructor body
        // this("ali"); // Call to 'this()' must be first statement in constructor body

        System.out.println("parametresiz constructor calisti");

    }

    C05_ConstructorCall(String isim){
        System.out.println("parametreli constructor calisti");
    }

    C05_ConstructorCall(int sayi){
        System.out.println("parametreli constructor calisti");
    }

    public static void main(String[] args) {

        System.out.println("main method calisti");
        // method1();

        C05_ConstructorCall obj = new C05_ConstructorCall();


    }

    public static void method1(){
        method2();
        System.out.println("method1 calisti");

    }

    public static void method2(){
        System.out.println("method2 calisti");
    }
}
