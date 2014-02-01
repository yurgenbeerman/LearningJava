package package1;

import static java.util.Arrays.copyOf;
import static java.util.Arrays.copyOfRange;

/**
 * Created by Lena on 25.01.14.
 */
public class Operations {
    public static boolean ifSwappedSmaller (int[] arr, int index1, int index2) {
        if(arr[index1]<arr[index2]){
            int number = arr[index1];//swap
            arr[index2] = arr[index1];
            arr[index1] = number;
            return true;
        } else return false;
    }

    public static void swapSmaller (int[] arr, int index1, int index2) {
        int number = arr[index1];//swap
        arr[index2] = arr[index1];
        arr[index1] = number;
    }

// https://www.youtube.com/watch?v=86Whd3UFSCE&list=SPD964614607573AFD&index=2
// Функции (методы) - Занятие 2 - Java практика
//задание Binary Search = Поиск методом Золотого сечения:
//есть отсортированный массив
//надо выдать индекс элемента массива, равного искомому значению
//already implemented: Java Arrays.binarySearch
//протестируй, если кол-во элементов четное и нечетное
//вконце всех делений надо правильно обработать 1 или 2 последне ячейки
//ТАКЖЕ стоит написать тестирующую ф-цию:
    public static int findSymbolInCharArray(char[] arr, char c) {
        if (arr == null) {
            System.out.println("ERROR: arr == null");
            return -1;
        }

        int arrLength = arr.length;

        if (0 == arrLength) {
            System.out.println("ERROR: arrLength == 0");
            return -1;
        }

//        for (int elem : arr) System.out.print((char)elem + ", ");
        System.out.print("findSymbolInCharArray(");
        for (int i = 0; i < arrLength; i++) {System.out.print(arr[i] + ", ");}
        System.out.print(";'" + c + "')\n"); 

        if (1 == arrLength) {
            if (c == arr[0]) return 0; else return -1;
        }   else if (2 == arrLength) {
                if (c == arr[0]) {
                    return 0;
                } else {
                    if (c == arr[1]) return 1; else return -1;
            }
        } else if (3 == arrLength) {
            if (c == arr[0]) {
                return 0;
            } else {
                char[] arr1 = copyOfRange(arr,1,2);
                int res = findSymbolInCharArray(arr1, c);
                if (res >=0) return 1 + res; else return -1;
            }
        } else {
            int center = arrLength / 2;
            char leftChar = arr[center-1];
            char rightChar = arr[center];
            System.out.println("leftChar = " + leftChar + " rightChar = " + rightChar);
            if (c == leftChar) return center-1;
            if (c == rightChar) return center;
            char[] arr1;
            if (c < leftChar) {
                arr1 = copyOf(arr, center-1);
                return findSymbolInCharArray(arr1, c);
            } else {
                //System.out.println("center + 1 = " + (center + 1) +", arrLength-1 = " + (arrLength-1));
                arr1 = copyOfRange(arr, center + 1, arrLength); //arrLength may be equal to arr.length = END OF ARRAY
                //if (arr1 == null) return -1;

                int res = findSymbolInCharArray(arr1, c);
                if (res >=0) return center + 1 + res; else return -1;
            }
            //for (int elem : arr1) System.out.print((char)elem + ", "); System.out.print("\n");
        }
    }
}
