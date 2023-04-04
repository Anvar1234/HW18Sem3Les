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


        System.out.print("Введите длину массива N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Введите максимальное значение массива: ");
        int max = sc.nextInt();
        sc.close();

        ArrayList<Integer> array = new ArrayList<>(10);
        Random r = new Random();

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