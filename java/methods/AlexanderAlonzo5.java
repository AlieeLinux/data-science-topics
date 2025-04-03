import java.util.Scanner;

public class AlexanderAlonzo5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        
        System.out.println("Enter 5 numbers:");
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int num = scanner.nextInt();
            
            if (num % 2 == 0) {
                System.out.println(num + " is even");
                evenCount++;
            } else {
                System.out.println(num + " is odd");
                oddCount++;
            }
        }
        
        System.out.println("\nResults:");
        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
        
        scanner.close();
    }
}
