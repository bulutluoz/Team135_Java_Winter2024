package day17_constructors;

public class C04_ConstructorsVsMethods {

     /*
            Constructor'lar syntax olarak method'a benzerler
            bir kod blogunun constructor olabilmesi icin
            2 sarti MUTLAKA saglamasi gerekir

             - ismi class ismi ile bire-bir ayni olmalidir
               (method isimleri kucuk harfle baslar,
                buyuk harfle baslamak isterseniz CTE vermez ama bu onerilmez,
                method'a class ismi ile ayni ismi verirseniz CTE vermez, ama bu onerilmez)
             - return type'lari olmaz

         */

    public C04_ConstructorsVsMethods(){

    }

    public void C04_ConstructorsVsMethods(){
        // Method name 'C04_ConstructorsVsMethods' is the same as its class name
    }

    //public Deneme(){ // Invalid method declaration; return type required
        // Constructor degil ==> class ismi ile ayni degil
        // method da degil ==> return type yok
    //}
}
