package lesson;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


    }


    static int secondMax(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    static int foundMissedElement(int[] arr) {
        int missed = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] > 1) {
                missed = (arr[i] + arr[i + 1]) / 2;
            }
        }
        return missed;
    }

    static void percentInText(String text, String word) {
        String[] arr = text.split(" ");
        int wordCount = 0;
        for (String s : arr) {
            if (s.equals(word)) {
                wordCount++;
            }
        }
        double result = (double) wordCount / arr.length * 100;
        System.out.println(result);
    }

    static int maxSum(int[] arr) {
        int min = arr[0];
        int sum = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int value : arr) {
            sum += value;
        }
        return sum - min;
    }
}
