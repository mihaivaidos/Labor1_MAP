package Aufgabe_4;

import java.util.Arrays;

public class ElectronicShop {

    // 1
    public static int cheapestKeyboard(int []keyboards) {
        int cheapest = keyboards[0];
        for(int keyboard : keyboards) {
            if(cheapest > keyboard) {
                cheapest = keyboard;
            }
        }
        return cheapest;
    }

    // 2
    public static int expensiveDevice(int []keyboards, int []usb) {
        int expensiveDevice = keyboards[0];
        for(int keyboard : keyboards) {
            if(keyboard > expensiveDevice) {
                expensiveDevice = keyboard;
            }
        }
        for (int u : usb) {
            if (u > expensiveDevice) {
                expensiveDevice = u;
            }
        }
        return expensiveDevice;
    }

    // 3
    public static int affordExpensiveUSB(int []usb, int budget) {
        Arrays.sort(usb);
        for(int i = usb.length - 1; i >= 0; i--) {
            if(usb[i] <= budget) {
                return usb[i];
            }
        }
        return -1; // Can't afford any USB
    }

    // 4
    public static int spendMaxBoth(int []keyboards, int []usb, int budget) {
        Arrays.sort(keyboards);
        Arrays.sort(usb);
        for(int i = keyboards.length - 1; i >= 0; i--) {
            for(int j = usb.length - 1; j >= 0; j--) {
                int sum = keyboards[i] + usb[j];
                if(sum <= budget) {
                    return sum;
                }
            }
        }
        return -1; // Can't buy both with that budget
    }

}
