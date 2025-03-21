package Hafta_3.Haftalık_Teknik_İcerik_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ENYAKIN2SAYI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        System.out.println("10 adet birbirinden farklı pozitif sayı giriniz : ");
        for (int i = 0; i < 10; i++){
            System.out.print((i + 1 ) + ".Sayı : ");
            int number = scanner.nextInt();
            if (number > 0 && !list.contains(number)) {
                list.add(number);
            }
            else {
                System.out.println("Hatalı sayı girdiniz ! ");
                --i;
            }
            System.out.println("Liste : " + list);
        }
        Collections.sort(list);
        int minDifference = Integer.MAX_VALUE;
        int number1 = 0;
        int number2 = 0;
        for (int i = 0; i < list.size() - 1 ; i++){
            int difference = list.get(i + 1) - list.get(i);
            if (difference < minDifference){
                minDifference = difference;
            number1 = list.get(i + 1);
            number2 = list.get(i);
            }
        }
        System.out.println("Listedeki en yakın iki sayı : " + number1 + " , "+ number2);
    }
}