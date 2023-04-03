import homework3.Task2;
import homework3.Task3;
import homework3.getArrayList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> newArray = new ArrayList<>();
        newArray = getArrayList.getArray();
        System.out.println("Начальный массив: ");
        System.out.println(newArray);

        Task2.delEvenNumbers(newArray);

        Task3.delEvenNumbers(newArray);

    }
}