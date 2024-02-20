package day26_pollymorphism_abstraction;

public abstract class C04_KuralciAbstractParent {

    /*
        Java Parent class'larin soz sahibi olmasi icin
        Abstraction'i gelistirmistir

        Buradaki temel amac
        Bir class olusturdugumuzda, bu class'i parent edinmek isteyen
        child class'larin parent tarafindan belirlenen bazi method'lari
        override etme mecburiyeti olmasini saglamaktir.

        Bunu saglamak icin

        1- Class'imizi abstract keyword kullanarak
           abstract class yapmaliyiz

        2-


     */

    // bu class'i parent edinenler, method1'i kendilerine uyarlamak zorunda olsun
    protected void method1(){
        System.out.println("parent method1");
    }

    protected void method2(){
        System.out.println("parent method2");
    }

    protected void method3(){
        System.out.println("parent method3");
    }
}
