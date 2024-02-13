package day22_stringBuilder_accessModifier_encapsulation;

public class C03_AccessModifier {
    /*
        Java'daki her class uyesinin MUTLAKA access modifier'i OLMALIDIR
        eger bir class uyesine access modifier yazilmazsa
        Java o class uyesine default access modifier atar
        default access modifier gorunur sekilde YAZILAMAZ

     */

    private int sayiPri =10;
    int sayiDef = 25;
    protected int sayiPro = 30;
    public int sayiPub = 20;


    public static void main(String[] args) {


        C03_AccessModifier obj = new C03_AccessModifier();

        // Private access modifier'a sadece icinde oldugu class'dan ulasilabilir
        System.out.println(obj.sayiPri); // 10
        obj.sayiPri = 100;
        System.out.println(obj.sayiPri); // 100
        obj.methodPri(); // Private method calisti

        // default access modifier'a sahip olan class uyeleri
        // icinde bulunduklari package'dan kullanilabilir
        // package private olarak da isimlendirilir
        System.out.println(obj.sayiDef); // 25
        obj.methodDef(); // Default method calisti

        System.out.println(obj.sayiPro); // 30
        obj.methodPro(); // Protected method calisti

        System.out.println(obj.sayiPub); // 20
        obj.methodPub(); // Public method calisti


    }

    private void methodPri(){
        System.out.println("Private method calisti");
    }
    void methodDef(){
        System.out.println("Default method calisti");
    }
    protected void methodPro(){
        System.out.println("Protected method calisti");
    }
    public void methodPub(){
        System.out.println("Public method calisti");
    }

}
