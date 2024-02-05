package day17_constructors;

public class C02_CarRunner {

    public static void main(String[] args) {

        C01_Car car1 = new C01_Car();

        System.out.println(car1.marka); // Marka atanmadi
        System.out.println(car1.model); // null
        System.out.println(car1.yil); // 0

        car1.marka= "Toyota";
        car1.model = "Corolla";
        car1.renk = "Lacivert";
        car1.yil = 2010;
        car1.fiyat = 8000;

        System.out.println(car1);
        // C01_Car{marka='Toyota', model='Corolla', renk='Lacivert', yil=2010, fiyat=8000}
        // Car Ozellikler : marka='Toyota', model='Corolla', renk='Lacivert', yil=2010, fiyat=8000

        C01_Car car2 = new C01_Car();

        System.out.println(car2);
        // Car Ozellikler : marka='Marka atanmadi', model='null', renk='null', yil=0, fiyat=0

        car2.marka = "Opel";
        car2.model = "Corsa";
        car2.renk = "Beyaz";
        car2.yil = 2012;
        car2.fiyat = 5000;

        System.out.println(car2);
        // Car Ozellikler : marka='Opel', model='Corsa', renk='Beyaz', yil=2012, fiyat=5000


        C01_Car car3 = new C01_Car("Nissan","Micra");
        System.out.println(car3);
        // Car Ozellikler : marka='Nissan', model='Micra', renk='null', yil=0, fiyat=0


        C01_Car car4 = new C01_Car();
        System.out.println(car4);
        // Car Ozellikler : marka='Marka atanmadi', model='null', renk='null', yil=0, fiyat=0


        // arabanin model, yil ve fiyatini parametre olarak
        // girebilecegimiz bir constructor olusturalim

      C01_Car car5 = new C01_Car("S40",2005,9000);

      System.out.println(car5);
      // Car Ozellikler : marka='Marka atanmadi', model='S40', renk='null', yil=2005, fiyat=9000


      // arabanin tum ozelliklerini parametre olarak
      // yollayabilecegimiz, bir constructor olusturun

      C01_Car car6 = new C01_Car("Tofas","Sahin","Kirmizi",2000,10000);

      System.out.println(car6);
        // Car Ozellikler : marka='Tofas', model='Sahin', renk='Kirmizi', yil=2000, fiyat=10000

    }
}
