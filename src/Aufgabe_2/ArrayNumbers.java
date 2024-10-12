package Aufgabe_2;

public class ArrayNumbers {

    // 1
    public static int maxNumber(int []numbers) {
        int max = numbers[0];
        for (int num : numbers) {
            if (max < num) {
                max = num;
            }
        }
        return max;
    }

    // 2
    public static int minNumber(int []numbers) {
        int min = numbers[0];
        for (int num : numbers) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    // 3
    public static int maxSum(int []numbers) {
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        return sum - minNumber(numbers);
    }

    // 4
    public static int minSum(int []numbers) {
        int sum = 0;
        for(int num : numbers) {
            sum += num;
        }
        return sum - maxNumber(numbers);
    }
}
