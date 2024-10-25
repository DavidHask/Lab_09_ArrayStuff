import java.util.Random;

public class Part_1 {
    public static void main(String[] args) {

        Random rand = new Random();
        int [] dataPoints = new int[100];
        int sum = 0;
        int numOfValues = 0;
        double average = 0;

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(1, 101);
        }

        for (int i = 0; i < dataPoints.length; i++) {
            if (i == 0) {
                System.out.print(dataPoints[i]);
            }
            System.out.print(" | " + dataPoints[i]);
        }

        for (int i = 0; i < dataPoints.length; i++) {
            sum = sum + dataPoints[i];
            numOfValues = numOfValues + 1;
        }

        average = (double) sum / numOfValues;

        System.out.println("\nThe sum of all the values is " + sum);
        System.out.println("The average of all the values is " + average);

    }
}