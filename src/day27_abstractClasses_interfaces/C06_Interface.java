package day27_abstractClasses_interfaces;

public interface C06_Interface {

    // full abstraction saglamak amaciyla olusturuldugu icin
    // tum method'lar public ve abstract
    // tum variable'lar ise public, static ve final'dir


    public static final int SAYI = 10 ;
    int yas = 0;
    // tum variable'lar final'dir
    // ve final variable'lara sonradan deger atanamaz
    // Bundan dolayi interface'deki tum variable'lara deger atanmak zorundadir


    public abstract void method1();
    // Modifier 'public' is redundant for interface members
    // Modifier 'abstract' is redundant for interface methods
    abstract void method2();
    public void method3();

    void method4();

    int method5();




}
