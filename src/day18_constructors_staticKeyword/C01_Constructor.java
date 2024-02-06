package day18_constructors_staticKeyword;

public class C01_Constructor {

    String isim = "Ali";

    public static void main(String[] args) {

        C01_Constructor obj1 = new C01_Constructor();

        System.out.println(obj1.isim); // Ali
        obj1.isim = "Veli";
        System.out.println(obj1.isim); // Veli
        obj1.method2();// static olmayan method calisti
        obj1.method1(); // Static member '' accessed via instance reference
                        // static method calisti
        method1(); // static method calisti

        System.out.println("========Esitligin sadece sagini kullanirsak=========");

        System.out.println(new C01_Constructor().isim); // Ali

        new C01_Constructor().method2(); // static olmayan method calisti

        // sadece o satir icin bir obje olusturulur
        // o yeni obje ile bir objenin yapabilecegi islemler yapilir
        // kod alt satira gectiginde o obje yok olur

        System.out.println("========Constructor kullanmaz, null olarak isaretlersek=========");

        C01_Constructor obj2 = null;

        //System.out.println(obj2.isim); // NullPointerException

        // obj2.method2(); // NullPointerException

        obj2.method1(); // static method calisti

        // Constructor kullanmaz, null olarak isaretlersek
        // normal bir obje uzerinden yapabilecegimiz islemleri YAPAMAYIZ
        // NullPointerException verir
        // ANCAK bu obje ile static bir method cagirdigimizda
        // satatic method'un bu objeye ihtiyaci olmadigindan
        // method calisir

    }


    public static void method1(){
        System.out.println("static method calisti");
    }

    public void method2(){
        System.out.println("static olmayan method calisti");
    }

}
