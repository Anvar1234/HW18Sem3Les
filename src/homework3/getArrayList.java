package homework3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class getArrayList {
    public static ArrayList<Integer> getArray() {
        System.out.print("Введите длину массива N: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Введите максимальное значение массива: ");
        int max = sc.nextInt();
        sc.close();

        ArrayList<Integer> array = new ArrayList<>(10);
        Random r = new Random();

        for (int i = 0; i < n; i++) {
            array.add(i, r.nextInt(max + 1));
        }
        return (array);
    }
}
