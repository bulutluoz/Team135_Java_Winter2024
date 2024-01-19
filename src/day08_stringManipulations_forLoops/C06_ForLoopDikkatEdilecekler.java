package day08_stringManipulations_forLoops;

public class C06_ForLoopDikkatEdilecekler {

    public static void main(String[] args) {

        // Eger baslangic degeri devam kosulunu SAGLAMIYORSA
        // Loop CALISIR ama loop body'si HIC DEVREYE GIREMEZ
        // dogal olarak hic bir islem yapamaz

        for (int i = 10; i <0 ; i++) {
            System.out.println(i);
        }


        // Eger i'nin butun degerleri icin DEVAM KOSULU true oluyorsa
        // SONSUZ LOOP olusur
        // bilgisayar hafizasi doluncaya,
        // veya int'in sinirina ulasip, negatife gecinceye kadar devam eder

        for (int i = 10; i >=0 ; i++) {
            System.out.print(i + " ");
        }
    }
}
