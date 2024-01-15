package day05_nestedIfElse_ternary;

import java.util.Scanner;

public class C11_SwitchStatements {

    public static void main(String[] args) {
        // Kullanicidan gun numarasini alin
        // girilen numaraya gore hafta ici veya hafta sonu yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen gun numarasini giriniz...");
        int gunNo = scanner.nextInt();

        switch (gunNo){

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Hafta ici");
                break;
            case 6:
            case 7:
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Gun numarasi 1-7 arasinda olmalidir");
        }
    }
}
