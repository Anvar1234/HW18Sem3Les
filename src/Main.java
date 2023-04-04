import homework3.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Первый массив псевдослуч чисел:
        System.out.print("Введите длину массива N1: ");
        int n1 = sc.nextInt();
        System.out.print("Введите максимальное значение массива N1: ");
        int max1 = sc.nextInt();

        ArrayList<Integer> newFirstArray = new ArrayList<>();
        Random r1 = new Random();
        for (int i = 0; i < n1; i++) {
            newFirstArray.add(i, r1.nextInt(max1 + 1));
        }
        System.out.println("Первый рабочий массив: ");
        System.out.println(newFirstArray);

        //Задания №2 и №3:

        Task2.delEvenNumbers(newFirstArray);

        Task3.minMaxAverageValue(newFirstArray);


        // Задание №4:
        //Второй массив псевдослуч чисел:
        System.out.print("Введите длину массива N2: ");
        int n2 = sc.nextInt();
        System.out.print("Введите максимальное значение массива N2: ");
        int max2 = sc.nextInt();

        ArrayList<Integer> newSecondArray = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < n2; i++) {
            newSecondArray.add(i, r.nextInt(max2 + 1));
        }
        System.out.println("Второй рабочий массив: ");
        System.out.println(newSecondArray);
        System.out.println("Первый рабочий массив был: ");
        System.out.println(newFirstArray);

        Task4.differenceOfArrays(newFirstArray, newSecondArray);

        Task4.symmetricArrayDiff(newFirstArray, newSecondArray);

        sc.close();
    }
}