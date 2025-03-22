package Hafta_3.Haftalık_Teknik_İcerik_4;

import java.util.Map;

public class GenericMetot {

    public static void main(String[] args) {

        String array[] = {"Özlem", "Elif", "Nisa", "Eda", "Lara"};
        Integer array2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        Double array3[] = {1.9, 2.8, 3.7, 4.6, 5.5};
        printArray(array);
        System.out.println("-------------------");
        printArray(array2);
        System.out.println("-------------------");
        printArray(array3);
    }

    public static <T> void printArray (T[] array){
        for (T element : array){
            System.out.println(element);
        }
    }
}