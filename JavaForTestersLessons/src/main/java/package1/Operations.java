package package1;

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
        //..
        return 0;
    }
}
