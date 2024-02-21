package day27_abstractClasses_interfaces;

public class C03_ChildOfC2 extends C02_ChildOfAbstractGP{


    public static void main(String[] args) {

        C03_ChildOfC2 obj = new C03_ChildOfC2();

        obj.method1(); // Concrete Parent method1
        obj.method2(); // Concrete Parent method2
        obj.method3(); // Concrete Parent method3
        obj.method4(); // abstract GP method4
        obj.method5(); // Concrete Parent method5
    }
}
