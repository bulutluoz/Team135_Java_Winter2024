package day17_constructors;

public class C01_Car {

    /*
        Biz bir class olusturdugumuzda
        Java her class'dan obje olusturulabilmesi icin
        bizim olusturdugumuz class'a
        default constructor yerlestirir
        Default constructor
            - parametresizdir
            - public'dir
            - body'sinde kod yoktur
            - gorunmez

         Eger siz objenin bazi ozelliklerini bastan belirlemek isterseniz
         bu ozellikleri constructor'a parametre olarak yollayip
         constructor icinde atama yapabilirsiniz

         YANLIZ  dikkat etmemiz gereken bir konu var
         EGER biz gorunur bir constructor olusturursak
         Java default constructor'i siler

         Bundan dolayi
         class'da gorunur bir constructor olusturdugumuzda
         default constructor kullanarak olusturulan objelerde
         problem olmamasi icin
         default constructor'in gorevini yapacak
         PARAMETRESIZ bir constructor da olustururuz

         Eger bazi degerleri obje olusturulurken atamak istersek
         parametreli constructor'lari kullanabiliriz
         parametreli constructor kullandigimizda
         - Eger parametre ismi ile instance variable ismi ayni degilse
           direk atama yapabiliriz
           marka = mrk;  model = mdl;   gibi

         - parametre ismi ile instance variable ismi ayni olursa
           scope'dan dolayi Java class level'daki variable'lara bakmaz
           bu durumda objeye ait instance variable'lara deger atamasi yapilmaz
           esitligin solundaki variable'larin
           class level'daki instance variable'lar oldugunu belirtmek icin
           basina this. kullaniriz

           this.marka = marka; gibi

         this. kullanildiginda Java icinde bulundugu scope'a degil
         direk olarak class level'a bakacaktir



     */

    String marka = "Marka atanmadi";
    String model;
    String renk;
    int yil;
    int fiyat;

    public C01_Car(){
        // default constructor aynen bu yazdigimiz constructor gibidir
        // public, parametresiz ve body'sinde kod yoktur
        // ancak bu cons. gorunur oldugu icin
        // default cons degildir, parametresiz cons. olarak adlandirilir
        // default cons.'in body'si bostur ama biz
        // parametresiz cons'in body'sine kod yazabiliriz

    }

    C01_Car(String mrk , String mdl){
        marka = mrk;
        model = mdl;
    }

    C01_Car(String mdl, int yl, int fyt){

        model = mdl;
        yil = yl;
        fiyat = fyt;
    }

    C01_Car(String marka, String model, String renk, int yil, int fiyat){

        this.marka = marka;
        this.model = model;
        this.renk = renk;
        this.yil = yil;
        this.fiyat = fiyat;
    }



    // menu'den code/generate/toString()
    // objenin yazdirmak istedigimiz ozellikliklerini isaretliyoruz


    @Override
    public String toString() {
        return "Car Ozellikler : " +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", yil=" + yil +
                ", fiyat=" + fiyat ;
    }
}
