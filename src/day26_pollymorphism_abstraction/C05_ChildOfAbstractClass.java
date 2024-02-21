package day26_pollymorphism_abstraction;

import java.util.ArrayList;
import java.util.List;

public class C05_ChildOfAbstractClass extends C04_KuralciAbstractParent{
    // Class 'C05_ChildOfAbstractClass' must either be declared abstract
    // or implement abstract method 'method1()' in 'C04_KuralciAbstractParent'


    @Override
    protected void method1() {

    }

    // public abstract void  method2(); // Abstract method in non-abstract class

    public static void main(String[] args) {

        // C04_KuralciAbstractParent abj = new C04_KuralciAbstractParent();
        // 'C04_KuralciAbstractParent' is abstract; cannot be instantiated


        // Abstract class'larin constructor'lari vardir
        // amma obje OLUSTURULAMAZ
        // obje olusturmamiz gerektiginde
        // constructor olarak child class constructor'lari kullanilabilir

        C04_KuralciAbstractParent abj = new C05_ChildOfAbstractClass();
        List<String> isimler = new ArrayList<>();


    }


}
