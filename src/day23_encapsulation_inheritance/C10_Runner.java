package day23_encapsulation_inheritance;

public class C10_Runner {

    public static void main(String[] args) {

        C09_Corolla corolla1 = new C09_Corolla();

        System.out.println(corolla1.kasa); // A Kasa secilmedi

        System.out.println(corolla1.marka); // T Toyota
        System.out.println(corolla1.motor); // T Toyota cevreci motor kullanir
        System.out.println(corolla1.guvenlik); // T Toyota guvenlik standardi uygulanir
        System.out.println(corolla1.cekis); // T Toyota araclar onden cekislidir

        System.out.println(corolla1.model); // C Corolla
        System.out.println(corolla1.sanzuman); // C Multidrive
        System.out.println(corolla1.lastik); // C Turkiyede uretilen pirelli lastik
        System.out.println(corolla1.uretimYeri); // C Turkiye
        System.out.println(corolla1.fren); // C Abs
        System.out.println(corolla1.aku); // C Inci
    }
}
