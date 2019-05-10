import java.util.Arrays;

public class ArrayLessonExample {

    public static void main(String[] args) {

    }

    static void example1() {
        int[] arr = new int[3];
        System.out.println(arr[0]);
    }

    static void example2() {
        int[] arr = {3, 4, 5};
        System.out.println(arr[0]);
    }

    static void example3() {
        int[] arr = new int[3];
        arr[0] = 3;
        arr[1] = 4;
        arr[2] = 5;
        System.out.println(arr[1]);
    }

    static void example4() {
        int[] arr = {4, 6, 7};
        for (int value : arr) {
            System.out.println(value);
        }
    }

    static void example5() {
        int[] arr = {4, 5, 6};
        System.out.println(Arrays.toString(arr));
    }

    static void example6() {
        int[] arr = {4, 2, 2};
        System.out.println(arr.length);
    }

    static void example7() {
        int[] firstArray = {1, 2, 3, 4, 5};
        int[] secondArray = {5, 4, 3, 2, 1};
        int firstArrayIndex = 1;
        int secondArrayIndex = 2;
        int length = 3;
        System.arraycopy(firstArray, firstArrayIndex, secondArray, secondArrayIndex, length);
        System.out.println(Arrays.toString(secondArray));
    }

    static void example8() {
        int[] arr = new int[10];
        int startIndex = 1;
        int endIndex = 4;
        Arrays.fill(arr, startIndex, endIndex, 2);
        System.out.println(Arrays.toString(arr));
    }

    static void example9() {
        int[] arr = {3, 1, 4, 6, 2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void example10() {
        int[] firstArray = {1, 2, 3};
        int[] secondArray = {1, 2, 3};
        boolean isEqual = Arrays.equals(firstArray, secondArray);
        System.out.println(isEqual);
    }

    static void example11() {
        int[] arr = {5, 4, 6, 4, 7, 8};
        int index = Arrays.binarySearch(arr, 5);
        System.out.println(index);
    }
    /**
     Размер массива (количество ячеек) нужно определять в int

     Изменить длину массива после его создания нельзя.

     Доступ к элементу массива можно получить по его индексу.

     В массивах, как и везде в Java, элементы нумеруются с нуля.

     После процедуры создания массива он наполнен значениями по умолчанию.
     */
}
