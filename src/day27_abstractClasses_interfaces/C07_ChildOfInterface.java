package day27_abstractClasses_interfaces;

public class C07_ChildOfInterface implements C06_Interface {

    /*
        Bir class'i bir interface'e child yapmak istersek
        extends yerine IMPLEMENTS kullaniriz

     */

    @Override
    public void method1() {

    }
    @Override
    public void method2() {

    }
    @Override
    public void method3() {

    }
    @Override
    public void method4() {

    }
    @Override
    public int method5() {
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(SAYI); // 10

        // sayi = 20; // Cannot assign a value to final variable 'sayi'

        System.out.println(Math.PI); // 3.141592653589793
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Short.MIN_VALUE); // -32768
    }
}
