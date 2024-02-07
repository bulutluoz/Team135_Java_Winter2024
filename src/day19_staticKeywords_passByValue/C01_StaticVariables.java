package day19_staticKeywords_passByValue;

public class C01_StaticVariables {

    static int sayiS = 20;
    int sayiI = 40;

    public static void main(String[] args) {

        System.out.println(sayiS);
        // System.out.println(sayiI); // Non-static field 'sayiI' cannot be referenced from a static context

        C01_StaticVariables obj1 = new C01_StaticVariables();
        obj1.sayiS++;
        obj1.sayiI++;

        C01_StaticVariables obj2 = new C01_StaticVariables();
        obj2.sayiS++;
        obj2.sayiI++;

        C01_StaticVariables obj3 = new C01_StaticVariables();
        obj3.sayiS++;
        obj3.sayiI++;

        System.out.println("sayiS : " + sayiS + ", obje1 sayiI : " +obj1.sayiI);
        // sayiS : 23, obje1 sayiI : 41


        obj3.sayiI += 5 ;
        obj3.sayiS += 5 ;

        System.out.println(
                "objj1 sayiS : " + obj1.sayiS + ", obj1 sayiI : " + obj1.sayiI +

                "\nobjj2 sayiS : " + obj2.sayiS + ", obj2 sayiI : " + obj2.sayiI +

                "\nobjj3 sayiS : " + obj3.sayiS + ", obj3 sayiI : " + obj3.sayiI
        );

        //objj1 sayiS : 28, obj1 sayiI : 41
        //objj2 sayiS : 28, obj2 sayiI : 41
        //objj3 sayiS : 28, obj3 sayiI : 46



    }



    public static void method1(){
        System.out.println(sayiS);
        //System.out.println(sayiI); // Non-static field 'sayiI' cannot be referenced from a static context

    }

    public void method2(){
        System.out.println(sayiS);
        System.out.println(sayiI);
    }
}
