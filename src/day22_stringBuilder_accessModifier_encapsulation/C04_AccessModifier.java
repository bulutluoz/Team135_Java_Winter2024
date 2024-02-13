package day22_stringBuilder_accessModifier_encapsulation;

public class C04_AccessModifier {

    public static void main(String[] args) {

        C03_AccessModifier obj = new C03_AccessModifier();
        // System.out.println(obj.sayiPri);
        // obj.methodPri(); // 'methodPri()' has private access in 'C03_AccessModifier'
        // private class uyeleri icinde bulunduklari class disinda hicbir yerden KULLANILAMAZ

        System.out.println(obj.sayiDef); // 25
        obj.sayiDef = 40;
        System.out.println(obj.sayiDef); // 40
        obj.methodDef(); // Default method calisti
    }
}
