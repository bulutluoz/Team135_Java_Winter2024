package day27_abstractClasses_interfaces;

public class C02_ChildOfAbstractGP extends C01_AbstractGP{


    @Override
    public void method1() {
        System.out.println("Concrete Parent method1");
    }

    @Override
    public void method2() {
        System.out.println("Concrete Parent method2");
    }

    public void method3(){
        System.out.println("Concrete Parent method3");
    }

    public void method5(){
        System.out.println("Concrete Parent method5");
    }
}
