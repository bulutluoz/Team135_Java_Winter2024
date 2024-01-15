package day05_nestedIfElse_ternary;

import java.util.Scanner;

public class C12_SwitchStatements {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan ISTQB kisaltmasindaki harflerden anlamini ogrenmek istedigini alin
        //        ve girilen harfin karsiligini yazdirin.
        //	        I : International
        //	        S : Software
        //	        T : Testing
        //	        Q : Qualifications
        //	        B: Board

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen anlamini gormek istediginiz harfi giriniz...");
        char girilenHarf = scanner.next().charAt(0);

        switch (girilenHarf){

            case 'i' :
            case 'I' :
                System.out.println("International");
                break;
            case 's' :
            case 'S' :
                System.out.println("Software");
                break;
            case 't' :
            case 'T' :
                System.out.println("Testing");
                break;
            case 'q' :
            case 'Q' :
                System.out.println("Qualifications");
                break;
            case 'b' :
            case 'B' :
                System.out.println("Board");
                break;
            default:
                System.out.println("Lutfen ISTQB kisaltmasindaki harflerden birini giriniz");
        }
    }
}
