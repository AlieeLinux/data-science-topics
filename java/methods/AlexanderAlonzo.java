import java.util.Arrays;
import java.util.Scanner;

public class AlexanderAlonzo {

    // Method to calculate sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // Method to calculate difference
    public static int difference(int a, int b) {
        return a - b;
    }

    // Method to calculate product
    public static int product(int a, int b) {
        return a * b;
    }

    // Method to calculate quotient
    public static double quotient(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }
    }

    // Method to calculate mean
    public static double mean(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    // Method to calculate median
    public static double median(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        if (length % 2 == 0) {
            return (numbers[length / 2 - 1] + numbers[length / 2]) / 2.0;
        } else {
            return numbers[length / 2];
        }
    }

    // Method to calculate mode
    public static int mode(int[] numbers) {
        int maxValue = 0, maxCount = 0;
        for (int i = 0; i < numbers.length; i++) {
            int count = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = numbers[i];
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        // Store in an array for statistical calculations
        int[] numbers = {num1, num2};

        // Display results
        System.out.println("\nResults:");
        System.out.println("Sum: " + sum(num1, num2));
        System.out.println("Difference: " + difference(num1, num2));
        System.out.println("Product: " + product(num1, num2));
        System.out.println("Quotient: " + quotient(num1, num2));

        System.out.println("Mean: " + mean(numbers));
        System.out.println("Median: " + median(numbers));
        System.out.println("Mode: " + mode(numbers));

        // Displaying custom message
        System.out.println("\nThank you, Ma'am Bench, this is my work.");

        scanner.close();
    }
}
