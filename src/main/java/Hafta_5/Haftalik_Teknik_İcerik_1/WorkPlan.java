package Hafta_5.Haftalik_Teknik_İcerik_1;

import java.util.Scanner;

public class WorkPlan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir gün giriniz : ");
        String input = scanner.nextLine().toUpperCase();

        Day selectedDay = null;

        for (Day day : Day.values()){
            if (day.name().equals(input)){
               selectedDay = day;
               break;
            }
        }

        if (selectedDay != null){
            System.out.println(selectedDay + " günü çalışma saatleri : " + selectedDay.getWorkingHours());
        }else {
            System.out.println("Geçersiz bir gün girdiniz !!!");
        }
    }
}