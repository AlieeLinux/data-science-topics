import java.util.Scanner;

class IfDivisible {

    public static boolean IfDivisibleByFive(int x) {
        if (x % 5 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number\n>>");

        int number = input.nextInt();
        boolean IfDivisible = IfDivisibleByFive(number);

        if (IfDivisible) {
            System.out.println("Number: " + number + " is Divisible by 5.");
        } else {
            System.out.println("Number: " + number + " is not Divisible by 5.");
        }
        input.close();
    }
} 
