package homework3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Задача №2.
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа.
 */
public class Task2 {
    public static void delEvenNumbers(ArrayList<Integer> arrayList) {
        ArrayList<Integer> tempArray = new ArrayList<>();

        for (int el : arrayList) {
            if (el % 2 != 0) tempArray.add(el);
        }
        if(tempArray.isEmpty()){
            System.out.println("Нечетных значений в массиве нет! \n");
        }else {
            System.out.println("Массив нечетных чисел из него:");
            System.out.println(tempArray+"\n");
        }
    }
}
