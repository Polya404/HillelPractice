package lesson09;

import java.util.Arrays;
import java.util.Random;

public class Arr {
    public static void main(String[] args) {
        System.out.println(maxArr(arr()));
        System.out.println(minArr(arr()));
        for (int i : arr()) {
            System.out.print(i + " ");
        }
    }

    private static int[] arr() {
        Random r = new Random();
        int[] array = new int[10];
        for (int a = 0; a < array.length; a++) {
            array[a] = r.nextInt(-10, 11);
        }
        return array;
    }

    private static int maxArr(int[] array) {
        int count = 0;
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
                count = 0;
            }
            if (i == max) {
                count += 1;
            }
        }
        System.out.println(Arrays.toString(array));
        return count;
    }

    private static int minArr(int[] array) {
        int count = 0;
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
                count = 0;
            }
            if (i == min) {
                count += 1;
            }
        }
        System.out.println(Arrays.toString(array));
        return count;
    }
}
