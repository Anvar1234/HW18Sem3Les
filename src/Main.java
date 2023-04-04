import homework3.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> newFirstArray = new ArrayList<>();
        newFirstArray = getArrayList.getArray();
        System.out.println("Первый рабочий массив: ");
        System.out.println(newFirstArray);

        Task2.delEvenNumbers(newFirstArray);

        Task3.minMaxAverageValue(newFirstArray);

        ArrayList<Integer> newSecondArray = new ArrayList<>();
        newSecondArray = getArrayList.getArray();
        System.out.println("Второй рабочий массив: ");
        System.out.println(newSecondArray);
        System.out.println("Первый, помним, такой: ");
        System.out.println(newFirstArray);

        Task4.differenceOfArrays(newFirstArray, newSecondArray);

        Task4.symmetricArrayDiff(newFirstArray, newSecondArray);

    }
}