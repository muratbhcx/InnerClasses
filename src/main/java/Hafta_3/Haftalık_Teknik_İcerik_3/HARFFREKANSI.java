package Hafta_3.Haftalık_Teknik_İcerik_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HARFFREKANSI {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir Kelime Giriniz : ");
        String word = scanner.nextLine();

        letterCounts(word);
    }

    public static void letterCounts (String word){
        Map<Character, Integer> counter = new HashMap<>();

        for (char letter : word.toUpperCase().toCharArray()){
            if (Character.isLetter(letter)) {
                counter.put(letter, counter.getOrDefault(letter, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : counter.entrySet()){
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}