package day23_encapsulation_inheritance;

import day22_stringBuilder_accessModifier_encapsulation.C03_AccessModifier;

public class C02_AccessModifier {

    public static void main(String[] args) {

        C03_AccessModifier obj = new C03_AccessModifier();
        // System.out.println(obj.sayiPri);
        // obj.methodPri(); // 'methodPri()' has private access in 'C03_AccessModifier'
        // private class uyeleri icinde bulunduklari class disinda hicbir yerden KULLANILAMAZ

        // System.out.println(obj.sayiDef);
        // obj.methodDef();
        // default class uyeleri icinde bulunduklari package disinda hicbir yerden KULLANILAMAZ
    }
}
