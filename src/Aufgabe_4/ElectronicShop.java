package Aufgabe_4;

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
    public static int expensiveDevice(int []keyboards, int [] usbs) {
        int expensiveDevice = keyboards[0];
        for(int keyboard : keyboards) {
            if(keyboard > expensiveDevice) {
                expensiveDevice = keyboard;
            }
        }
        for (int usb : usbs) {
            if (usb > expensiveDevice) {
                expensiveDevice = usb;
            }
        }
        return expensiveDevice;
    }

}
