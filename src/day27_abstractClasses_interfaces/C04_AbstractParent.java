package day27_abstractClasses_interfaces;

public abstract class C04_AbstractParent extends C01_AbstractGP{

    // Abstract class'larin abstract child class'lari
    // abstract method'lari override etmek ZORUNDA DEGILDIR
    // isterse override edebilir, istemezse dokunmaz
    // concrete bir class'in concrete child'i gibi davranir

    public abstract void method1();

    public void method2(){

        System.out.println("Abstract parent method2");
    }

    public abstract void method3();

    public abstract void method6();

    public void method7(){

        System.out.println("Abstract parent method7");
    }



}
