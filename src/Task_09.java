import java.util.Random;

public class Task_09 {
    public static void main(String[] args) {

        Random rand = new Random();
        int [] numbers = new int[100];


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1, 101);
        }

        double average = getAverage(numbers);
        System.out.println("The average of numbers is " + average);

    }

    public static double getAverage(int values[]) {

        int sum = 0;
        int NUM_VALUES = values.length;
        double average = 0.0;

        for (int i = 0; i < NUM_VALUES; i++) {
            sum = sum + values[i];
        }

        average = (double) sum / NUM_VALUES;

        return average;

    }
}
