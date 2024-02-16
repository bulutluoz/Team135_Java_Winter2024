package day24_inheritance;

import day23_encapsulation_inheritance.C06_Child;

public class C06_C extends C05_P{

    C06_C(){
        super("Ali");
        System.out.println("C parametresiz constructor calisti");
    }

    C06_C(String s){
        super(5);
        System.out.println("C String parametreli constructor calisti");
    }

    C06_C(int a){
        System.out.println("C int parametreli constructor calisti");
    }

    public static void main(String[] args) {

        C06_C child3 = new C06_C("Ali");
        // GP int parametreli constructor calisti
        //GP String parametreli constructor calisti
        //P int parametreli constructor calisti
        //C String parametreli constructor calisti


        // C06_C child2 = new C06_C();
        //GP parametresiz constructor calisti
        //P parametresiz constructor calisti
        //P String parametreli constructor calisti
        //C parametresiz constructor calisti

        // C06_C child1 = new C06_C(5);
        // GP parametresiz constructor calisti
        //P parametresiz constructor calisti
        //C int parametreli constructor calisti



        /*
            1- extends keyword kullanan bir class'daki
               her constructor'in ilk satirinda
               MUTLAKA constructor call OLMALIDIR
            2- Eger gorunur bir constructor call yoksa
               Java default olarak PARAMETRESIZ
               super() koyar
            3- Eger kodu yazan kisi
               this(ilgiliParametre) veya super(ilgiliParametre) kullanmissa
               bir constructor'da sadece 1 constructor call olacagi icin
               java otomatik olarak koydugu super()'u koymaz

         */
    }
}
