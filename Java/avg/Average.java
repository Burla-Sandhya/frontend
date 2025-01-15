import java.util.*;

public class Average {
    public static void main(String[] args) {

        Scanner value = new Scanner(System.in);
        float a, b, c, average;
        System.out.println("\n Enter 3 Numbers:");
        a = value.nextFloat();
        b = value.nextFloat();
        c = value.nextFloat();
        average = (a + b + c) / 3;
        System.out.println(average);
        // average
        /*int value = jain.nextInt();// t stores how many values to give input
        int number, sum = 0;
        float average = 0;
        for (int i = 0; i < value; i++) {
            number = jain.nextInt();
            sum = sum + number;
        }
        average = sum / value;

        System.out.println(average);*/
    }

}
