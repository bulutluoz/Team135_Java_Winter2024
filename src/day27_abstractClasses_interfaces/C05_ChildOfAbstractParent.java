package day27_abstractClasses_interfaces;

import day26_pollymorphism_abstraction.C05_ChildOfAbstractClass;

public class C05_ChildOfAbstractParent extends C04_AbstractParent{

    // Abstract bir silsileden sonra gelen
    // ILK CONCRETE Class
    // Parent abstract class'larda CONCRETE'lestirilmemis olan
    // tum abstract method'lari OVERRIDE etmek ZORUNDADIR

    @Override
    public void method1() {
        System.out.println("Concrete child class method1");
    }

    @Override
    public void method3() {
        System.out.println("Concrete child class method3");
    }

    @Override
    public void method6() {
        System.out.println("Concrete child class method6");
    }

    public static void main(String[] args) {

        C05_ChildOfAbstractParent obj = new C05_ChildOfAbstractParent();
        obj.method1(); // Concrete child class method1
        obj.method2(); // Abstract parent method2
        obj.method3(); // Concrete child class method3
        obj.method4(); // abstract GP method4
        obj.method6(); // Concrete child class method6
        obj.method7(); // Abstract parent method7


    }






























}
