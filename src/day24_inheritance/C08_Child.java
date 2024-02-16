package day24_inheritance;

public class C08_Child extends C07_Parent{

    String isim = "Child isim";
    String adres = "Child adres";
    int yas = 20;
    int boy = 180;

    public void method1(){
        System.out.println("Child method1");
    }

    public void method3(){
        System.out.println("Child method3");
    }

    public void method4(){

    }

    public static void main(String[] args) {
        C08_Child obj = new C08_Child();
        obj.method4();
    }

}
