package day23_encapsulation_inheritance;

public class C06_Child extends C05_Parent{

    String isim  = "Child isim";
    String adres = "Child adres";
    int yas ;
    String tel;

    public static void main(String[] args) {

        // Bir class, baska bir class'i parent edindiginde
        // 1- Parent class'daki tum ozelliklere sahip olur

        C06_Child child1 = new C06_Child();

        System.out.println(child1.ulke); // Parent ulke


        // 2- istediginiz ozellikleri child class'a gore
        //    guncelleyebilirsiniz

        System.out.println(child1.isim); // Child isim
        System.out.println(child1.adres); // Child adres

        // 3- Isterse de parent class'da olmayan
        //    sadece child class'da olan yeni ozellikler ekleyebilir

        child1.yas = 40;
        child1.tel = "3122343434";

    }
}
