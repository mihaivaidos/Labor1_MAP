package Aufgabe_3;

import java.util.Arrays;

public class BigNumberOperations {

    // 1
    public static int[] add(int []num1, int []num2) {
        int n = num1.length;
        int []result = new int[n + 1];
        int carry = 0;

        for(int i = n - 1; i >= 0; i--) {
            int sum = num1[i] + num2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }
        result[0] = carry;
        if(carry == 0) {
            return Arrays.copyOfRange(result, 1, result.length);
        }
        return result;
    }

    // 2
    public static int[] subtract(int []num1, int []num2) {
        int n = num1.length;
        int []result = new int[n];
        int borrow = 0;

        for(int i = n - 1; i >= 0; i--) {
            int diff = num1[i] - num2[i] - borrow;
            if(diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }
        return result;
    }

}
