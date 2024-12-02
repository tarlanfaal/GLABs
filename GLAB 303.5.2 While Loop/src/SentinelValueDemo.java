import java.util.Scanner;

public class SentinelValueDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an int value (the program exits if the input is 0): ");
        int data = input.nextInt();
        // Keep reading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;
            // Read the next data
            System.out.print("Enter an int value (the program exits if the input is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is " + sum);
    }
}
