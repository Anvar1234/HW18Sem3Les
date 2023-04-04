package homework3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
 */
public class Task3 {
    public static void minMaxAverageValue(ArrayList<Integer> arrayList) {
        System.out.print("Максимальное значение массива: ");
        System.out.println(Collections.max(arrayList));
        System.out.print("Минимальное значение массива: ");
        System.out.println(Collections.min(arrayList));
        System.out.print("Среднее значение массива: ");
        double sum = 0;
        double average = 0;
        for (int i : arrayList) {
            sum += i;
        }
        average = sum / arrayList.size();
        System.out.println(average);
    }
}