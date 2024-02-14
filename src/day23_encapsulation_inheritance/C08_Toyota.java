package day23_encapsulation_inheritance;

public class C08_Toyota extends C07_Araba{

    // parent class'da olup, guncellelemek istediklerimiz
    String marka = "Toyota";
    String motor = "Toyota cevreci motor kullanir";

    // parent class'da olmayip
    // tum toyota araclarda oldugu icin buraya ekleyecegimiz ozellikler

    String lastik = "Toyota pirelli lastik kullanir";
    String guvenlik = "Toyota guvenlik standardi uygulanir";
    String cekis = "Toyota araclar onden cekislidir";


}
