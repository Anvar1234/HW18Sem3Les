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
    //Разность массивов:
    public static void differenceOfArrays(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        ArrayList<Integer> tempA = new ArrayList<>(arrayList1);
        tempA.removeAll(arrayList2);
        System.out.println("Разность массивов N1 - N2: ");
        System.out.println(tempA);
    }

    //Симметрическая разность массивов:
    public static void symmetricArrayDiff(ArrayList<Integer> arrayLst1, ArrayList<Integer> arrayLst2) {
        ArrayList<Integer> tempArray1 = new ArrayList<>(arrayLst1);//создаем копии исходных массивов
        //tempArray1 = arrayList1;
        tempArray1.removeAll(arrayLst2);
        ArrayList<Integer> tempArray2 = new ArrayList<>(arrayLst2);
        //tempArray2 = arrayList2;
        tempArray2.removeAll(arrayLst1);
        ArrayList<Integer> resultArray = new ArrayList<Integer>();
        resultArray.addAll(tempArray1);
        resultArray.addAll(tempArray2);

        System.out.println("Симметрическая разность массивов N1 и N2: ");
        System.out.println(resultArray);
    }
}
