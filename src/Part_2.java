import java.util.Scanner;
import java.util.Random;

public class Part_2 {
    public static void main(String[] args ) {

        Scanner in = new Scanner(System.in);
        Random rand = new Random();

        int value = SafeInputs.getRangedInt(in, "What value are you looking for?", 1, 100);
        int valueFoundTimes = 0;
        int [] dataPoints = new int[100];

        for (int i = 0; i < dataPoints.length; i ++) {
            dataPoints[i] = rand.nextInt(1, 101);
        }

        for (int i = 0; i < dataPoints.length; i ++) {
            if (dataPoints[i] == value) {
                System.out.println(value + " is at Index " + i);
                valueFoundTimes = valueFoundTimes + 1;
            }
        }

        if (valueFoundTimes == 0) {
            System.out.println("Sorry, " + value + " was not found in the array");
        } else {
            System.out.println("You found " + value + " " + valueFoundTimes + " times in the array");
        }

        int value2 = SafeInputs.getRangedInt(in, "What value are you looking for?", 1, 100);
        int index = -1;


        for (int i = 0; i < dataPoints.length; i ++) {
            index = index + 1;
            if (dataPoints[i] == value2) {
                System.out.println(value2 + " is at Index " + i);
                break;
            }
        }

        if (index == -1) {
            System.out.println("Sorry, " + value2 + " was not found in the array");
        } else {
            System.out.println(value2 + " was found at Index " + index + " in this array");
        }

        int min = dataPoints[0];
        int max = dataPoints[0];
        int indexMin = 0;
        int indexMax = 0;

        for (int i = 0; i < dataPoints.length; i ++) {
            if (dataPoints[i] < min) {
                min = dataPoints[i];
                indexMin = i;
            }
            if (dataPoints[i] > max) {
                max = dataPoints[i];
                indexMax = i;
            }
        }

        System.out.println("The minimum value of this array is " + min + " at Index " + indexMin);
        System.out.println("The maximum value of this array is " + max + " at Index " + indexMax);

    }
}
