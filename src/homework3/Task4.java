package homework3;

import java.util.ArrayList;

/**
 * Реализовать разность массивов и симметрическую разность массивов.
 * Upd.
 * 1.Разность двух массивов A и B — это массив с элементами A, не совпадающими с элементами B, без дублей.
 * 2.Симметрическая разность двух массивов A и B — это такой массив, куда входят все те элементы первого
 * массива, которые не входят во второй массив, а также те элементы второго массива,
 * которые не входят в первый массив.
 */
public class Task4 {
    public static void differenceOfArrays(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        arrayList1.removeAll(arrayList2);
        System.out.println("Разность массивов: ");
        System.out.println(arrayList1);
    }

    public static void symmetricArrayDiff(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        ArrayList<Integer> tempArray1 = new ArrayList<>(arrayList1);
        //tempArray1 = arrayList1;
        tempArray1.removeAll(arrayList2);
        ArrayList<Integer> tempArray2 = new ArrayList<>(arrayList2);
        //tempArray2 = arrayList2;
        tempArray2.removeAll(arrayList1);
        ArrayList<Integer> resultArray = new ArrayList<Integer>(tempArray1.size() + tempArray2.size());
        resultArray.addAll(tempArray1);
        resultArray.addAll(tempArray2);

        System.out.println("Симметрическая разность массивов: ");
        System.out.println(resultArray);

    }
}
