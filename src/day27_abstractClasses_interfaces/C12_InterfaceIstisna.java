package day27_abstractClasses_interfaces;

public interface C12_InterfaceIstisna {

    /*
        Devam eden projelerde
        Interface'lere sonradan mudahale etmemiz gerektiginde
        o interface'i daha onceden kullanan class'larda
        ciddi problemlere sebep olabilir

        Java8 ile bu konudaki taleplere
        istisnai bir cozum uretilmistir

        sonradan eklenen bir method'un
        child class'lar tarafindan implement edilme ZORUNLULUGU olmamasi icin
        interface icindeki istisnai method'larin
        body'li olusturulabilmesine imkan taniyan
        2 keyword tanimlanmistir.
     */

    void method1();

    void method2();

    int method3();

    public default void method4(){

        // buradaki default access modifier degildir
        // access modifier public, ve 2 access modifier kullanilamaz
        // buradaki kullanim default keyword'un farkli bir kullanimidir
        System.out.println("Interface icindeki default keyword'une sahip istisnai method");
    }

    public static void method5(){
        System.out.println("Interface icindeki static keyword'une sahip istisnai method");
    }


}
