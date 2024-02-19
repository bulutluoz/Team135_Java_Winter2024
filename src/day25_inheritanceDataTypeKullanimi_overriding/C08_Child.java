package day25_inheritanceDataTypeKullanimi_overriding;

public class C08_Child extends C07_Parent{

    public void method1(int a){ // method1 int
        /*
        biz ayni class'da
        ayni signature'a sahip 2 method olusturamayiz

        Override edebilmek icin
        method'larin child class'da olmasi
        ve parent class'daki method ile ayni signature'a sahip olmasi gerekir

        override etme yani child'in method'u kendine uyarlamasi
        method body'sini degistirerek olur
     */
    }

   public void method2(){
        // overriding yaparken esas olan signature'in ayni olmasidir
       // ancak signature'a dahil olmayan
       // returnType ve access modifier icin de kurallar vardir

    }

    @Override
    public void method3() {
        // @Override notasyonunu kullanmak mecburi degildir
        // Ancak kullanmak faydalidir
        // @Override parent class'daki override edilen method'u takip eder
        // ve method silinir veya siganature'i degistirilirse
        // CTE verir
        // Bu notasyon kullanilmadiysa,
        // overriding method, overridden method'u takip etmez
        // silinir veya signature'i degistirilirse
        // override etmeden yoluna devam eder
    }

    @Override
    public void method4() {
        super.method4();
        // Normal sartlarda
        // overriding method ve overridden method'dan sadece biri calisir
        // Ama yazdigimiz kod geregi ikisinin de calismasini istersek
        // child class'da super.method4(); yazabilirsiniz

    }

    public static void method5(){
        // static method'lar override edilemez
        // biz manuel olarak aynisini yazsak da
        // Java bunlari override olarak kabul etmez
        // birbiriyle ilgisi olmayan iki farkli method kabul eder
    }


    public void method66(){
        // overridden method is final
        // final method, override edilemeyen method demektir
        // signature'i ayni olan bir metod yazsak da
        // java CTE verir ve final method override edilemez diye bizi uyarir
    }


    private void method7(){
        // Parent class da olsa
        // private class uyelerine baska class'dan ulasmak mumkun olmadigi icin
        // biz ayni method'u child class'da olustursak da
        // bunlari bagimsiz method'lar kabul eder
        // override olarak ilisiklendirmez
    }


      void method8(){
        // child class'daki overriding method'un access modifier'i
        // parent class'daki overridden method'un access modifier'indan
        // daha kisitlayici olamaz
        // overridden method default access modifier oldugundan
        // bu method default access mod, protected veya public olabilir
    }


    public int method9(){
        // overridden method'un return type'i
        // primitive veya void ise
        // overriding method da ayni olmalidir
        return 0;
    }

    public void method10(){


    }


    public String method11(){
        // Return type non-primitive ise
        // child class'daki method'un return type'i
        // ya parent class'daki method'un return type'i ile ayni olmalidir
        // ya da onun child'i olmalidir
        // buna Covariant data turu denir
        return "";
    }




}
