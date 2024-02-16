package day24_inheritance;

public class C05_P extends C04_GP{

    C05_P(){
        System.out.println("P parametresiz constructor calisti");
    }

    C05_P(String s){
        this();
        System.out.println("P String parametreli constructor calisti");
    }

    C05_P(int a){
        super("Veli");
        System.out.println("P int parametreli constructor calisti");
    }
}
