package day26_pollymorphism_abstraction;



public abstract class C04_KuralciAbstractParent {

    /*
        Java Parent class'larin soz sahibi olmasi icin
        Abstraction'i gelistirmistir

        Buradaki temel amac
        Bir class olusturdugumuzda, bu class'i parent edinmek isteyen
        child class'larin parent tarafindan belirlenen bazi method'lari
        override etme mecburiyeti olmasini saglamaktir.

        Abstract class'lar bir projede olmak zorunda degildir
        Eger obje olusturmayacagimiz
        ama child class'larin ortak ozelliklerini belirleyecek
        class'lara ihtiyacimiz olursa Abstract class olustururuz

        Abstract olmayan class ve method'lari belirtmek istedigimizde
        abstract olmayan demek yerine concrete diyebiliriz


        Bir class'in child class'lari
        belirlenen method'lari override etmeye MECBUR BIRAKMASI icin

        1- Class'imizi abstract keyword kullanarak
           abstract class yapmaliyiz

        2- Child class'lari override etmeye mecbur birakacagimiz
           method(lar)'i da abstract keyword kullanarak
           abstract method yapmaliyiz

        3- abstract(soyut) yapilan method'lar body'siz olurlar
           bu method'lari su ana kadar kullandigimiz method'lar gibi degil
           standartlari belirleyen bir kural cumlesi gibi dusunebiliriz

           abstract method'larin body'si olmadigindan
           abstract class'lardan obje olusturulamaz
           bunun yerine abstract method'lara body kazandiran
           child class'larin constructor'lari kullanilabilir


     */

    // bu class'i parent edinenler, method1'i kendilerine uyarlamak zorunda olsun
    protected abstract void method1();
    // 34.satir diyor ki : bu class'i child edinenler method1() sahibi olmak zorundadir

    protected void method2(){
        System.out.println("parent method2");
    }

    protected void method3(){
        System.out.println("parent method3");
    }
}
