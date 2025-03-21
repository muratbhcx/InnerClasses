package Hafta_3.Haftalık_Teknik_İcerik_1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HARFBULMA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(4);
        Random randomCharacter = new Random();
        for (int i = 0; i < 4; i++) {
            char random = (char) (randomCharacter.nextInt(26) + 'A');
            list.add(String.valueOf(random));
        }
        System.out.println(list);
        System.out.println("4 adet harf giriniz : ");
        for (int i = 0; i < 4; i++) {
            System.out.println(i + 1 + ".Harfi giriniz : ");
            char letter = scanner.next().toUpperCase().charAt(0);
            boolean found = false;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).charAt(0) == letter) {
                    list.set(j, "found");
                    found = true;
                }
            }
            if (!found && !list.contains(letter)) {
                list.add(String.valueOf(letter));
            }
        }
        System.out.println(list);
    }
}