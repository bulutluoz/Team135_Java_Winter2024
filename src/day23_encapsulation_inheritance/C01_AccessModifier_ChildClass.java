package day23_encapsulation_inheritance;

import day22_stringBuilder_accessModifier_encapsulation.C03_AccessModifier;

public class C01_AccessModifier_ChildClass extends C03_AccessModifier {

    // farkli package'daki child class'dan
    // private ==> ulasamayiz
    // default ==> ulasamayiz
    // protected ==> ulasabilir
    // public ==> ulasabilir

    public static void main(String[] args) {

        C01_AccessModifier_ChildClass obj = new C01_AccessModifier_ChildClass();
        // System.out.println(obj.sayiPri);
        // obj.methodPri(); // 'methodPri()' has private access in 'C03_AccessModifier'
        // private class uyeleri icinde bulunduklari class disinda hicbir yerden KULLANILAMAZ

        // System.out.println(obj.sayiDef);
        // obj.methodDef();
        // default class uyeleri icinde bulunduklari package disinda hicbir yerden KULLANILAMAZ

        System.out.println(obj.sayiPro); // 30
        obj.methodPro(); // Protected method calisti

        System.out.println(obj.sayiPub); // 20
        obj.methodPub(); // Public method calisti
    }
}
