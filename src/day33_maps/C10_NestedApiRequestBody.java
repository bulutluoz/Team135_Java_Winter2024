package day33_maps;

import java.util.HashMap;
import java.util.Map;

public class C10_NestedApiRequestBody {

    public static void main(String[] args) {

        // asagidaki api request body'sini map olarak olusturalim

        /*
       {
            "firstname" : "Ahmet",
            "lastname" : "Bulut",
            "totalprice" : 500,
            "depositpaid" : false,
            "bookingdates" : {
                   "checkin" : "2024-07-21",
                   "checkout" : "2024-08-10"
                      },
            "additionalneeds" : "wi-fi"
            }
       */
        // key ==> String  value==> Object

        Map<String,Object> rezervasyonMap = new HashMap<>();
        rezervasyonMap.put("firstname","Ahmet");
        rezervasyonMap.put("lastname","Bulut");
        rezervasyonMap.put("totalprice",500);
        rezervasyonMap.put("depositpaid",false);

        Map<String,String > bookingdatesValueMap = new HashMap<>();
        bookingdatesValueMap.put("checkin","2024-07-21");
        bookingdatesValueMap.put("checkout","2024-08-10");

        rezervasyonMap.put("bookingdates",bookingdatesValueMap);
        rezervasyonMap.put("additionalneeds", "wi-fi");


        System.out.println(rezervasyonMap);

        /*

                {
                firstname=Ahmet,
                additionalneeds=wi-fi,
                bookingdates={
                        checkin=2024-07-21,
                        checkout=2024-08-10
                        },
                totalprice=500,
                depositpaid=false,
                lastname=Bulut
                }

         */

        // rezervasyondaki ismi yazdirin
        System.out.println(rezervasyonMap.get("firstname")); // Ahmet

        // rezervasyondaki totalprice'i yazdirin
        System.out.println(rezervasyonMap.get("totalprice")); // 500

        // rezervasyondaki checkin tarihini yazdirin

        System.out.println(((Map<String, String>) (rezervasyonMap.get("bookingdates"))).get("checkin"));
        // 2024-07-21

    }
}
