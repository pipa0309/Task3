//forCheck
package HomeTaskThree;

import java.util.Arrays;

public class HomeWorkAppThree {
    public static void main(String[] args) {
        print(arrExchangeValues());
        print(arrRangeValues());
        print(arrValuesForMultiply());
        printArr2D(arrDiagonals());
        print(arrValuesAndLength(6, 0));
        print(arrForSearchMinMaxValues());
        print(createArrAndReturnFlagForCheckBalance());
        print(shiftValuesArr(createArrForShiftElement(), 1));
    }

    //№1
    public static int[] arrExchangeValues() {
        int[] arrOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] == 1) {
                arrOne[i] = 0;
            } else arrOne[i] = 1;
        }
        return arrOne;
    }

    //№2
    public static int[] arrRangeValues() {
        int[] arrTwo = new int[100];
        for (int i = 0; i < arrTwo.length; i++) {
            arrTwo[i] = (i + 1);
        }
        return arrTwo;
    }

    //№3
    public static int[] arrValuesForMultiply() {
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arrThree.length; i++) {
            if (arrThree[i] < 6) {
                arrThree[i] = (arrThree[i] * 6);
            }
        }
        return arrThree;
    }

    //№4
    public static int[][] arrDiagonals() {
        int[][] arrFour = new int[6][6];
        for (int i = 0; i < arrFour.length; i++) {
            for (int j = 0; j < arrFour[i].length; j++) {
                if (((i + j) == (arrFour.length - 1)) || (i == j)) {
                    arrFour[i][j] = 1;
                } else {
                    arrFour[i][j] = 0;
                }
            }
        }
        return arrFour;
    }

    //№5
    public static int[] arrValuesAndLength(int len, int initialValue) {
        int[] arrFive = new int[len];
        for (int i = 0; i < arrFive.length; i++) {
            arrFive[i] = initialValue;
        }
        return arrFive;
    }

    //№6
    public static int[] arrForSearchMinMaxValues() {
        int[] arrSix = {21, 10, 5, 5, 11, 18, 3, -16, 8, 33, -23, 27, 12};
        int min = arrSix[0];
        int max = arrSix[0];
        for (int i = 0; i < arrSix.length; i++) {
            if (min > arrSix[i]) {
                min = arrSix[i];
            } else if (max < arrSix[i]) {
                max = arrSix[i];
            }
        }
        System.out.println("\nMin value = " + min);
        System.out.println("Max value = " + max);
        return arrSix;
    }

    //№7
    public static boolean checkBalance(int[] arr) {
        int sumAll = 0;
        for (int i = 0; i < arr.length; i++) {
            sumAll += arr[i];
        }
        if (sumAll % 2 != 0) return false;
        int halfOfSumAll = (sumAll / 2);
        int right = 0;
        for (int j = (arr.length - 1); j > 0; j--) {
            right += arr[j];
            if (right == halfOfSumAll) return true;
        }
        return false;
    }

    //№8
    public static int[] shiftValuesArr(int[] arr, int shift) {
        int tmp = 0;
        for (int i = 0; i < arr.length - shift; i++) {
            tmp = arr[i];
            arr[i] = arr[i + shift];
            arr[i + shift] = tmp;
        }

        return arr;
    }


    //Метод для печати одномерного массива int[]
    public static void print(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    //Метод лдя печати flag
    public static void print(boolean flag) {
        System.out.println(flag);
    }

    //Метод для печати двумерного массива
    public static void printArr2D(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
        System.out.println("\n");
    }

    //Метод для создания массива и возврата flag
    public static boolean createArrAndReturnFlagForCheckBalance() {
        int[] arr = {16, 2, 3, 15, 2, 4};
        boolean flag = checkBalance(arr);
        return flag;
    }

    //Метод для создания массива
    public static int[] createArrForShiftElement() {
        int[] arr = {1, 2, 3};
        return arr;
    }
}
