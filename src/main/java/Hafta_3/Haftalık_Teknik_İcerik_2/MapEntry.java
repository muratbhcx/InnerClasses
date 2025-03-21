package Hafta_3.Haftalık_Teknik_İcerik_2;

import java.util.Map;
import java.util.TreeMap;

public class MapEntry {

    public static void main(String[] args) {

        TreeMap<String, Integer>gallery = new TreeMap<>();
        gallery.put("BMW", 2022);
        gallery.put("AUDI", 2024);
        gallery.put("TOYOTA", 2021);
        gallery.put("FORD", 2023);
        gallery.put("MERCEDES", 2025);

        System.out.println("ARAÇLAR");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Map.Entry<String, Integer> car : gallery.entrySet()){
            System.out.println("Marka : " + car.getKey() + " =>" +" üretim Yılı : " + car.getValue());
        }
    }
}
