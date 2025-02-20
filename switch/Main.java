//activity #3 

//contruct a program that will perform the following: 

//it will compute for the sum, difference, product and qoutient of 2 whole numbers.  using if else and switch statement  to do so. 

//output:

//1st num: 1
//2nd num 3

//1 sum
//2 difference
//3 product
//4 qoutient

//choice: 1

//the sume of 2 whole number is: 4

//one solution using if else statement
//one solution using switch statement



import java.util.Scanner;



class operations {
    public static int sum(int x, int y) {
        return x + y;
    } 
    public static int difference(int x, int y) {
        return x - y;
    } 
    public static int product(int x, int y) {
        return x + y;
    }
    public static int quotient(int x, int y) {
        return x / y;
    }
}


class Main {
    public static void test() {
        Scanner sc = new Scanner(System.in);
        int num1, num2, choice, method;

        System.out.print("1st num: ");
        num1 = sc.nextInt();
        System.out.print("2nd num: ");
        num2 = sc.nextInt();

        System.out.println("\n1 sum \n2 difference \n3 product \n4 quotient");
        System.out.print("choice:");

        choice = sc.nextInt();

        System.out.println();

        System.out.print("\nSelect the method you want\n1. If statement \n2. Switch Statement\n:");
        method = sc.nextInt();
        System.out.println();

        if (method == 1 ) {
            if (choice == 1) {
                int answer = operations.sum(num1, num2);
                System.out.println("The Sum of 2 whole number is: " + answer);
            } else if (choice == 2) {
                int answer = operations.difference(num1, num2);
                System.out.println("The difference of 2 whole numbers is: " + answer);
            } else if (choice == 3) {
                int answer = operations.product(num1, num2);
                System.out.println("The product of 2 whole number is: " + answer);
            } else if (choice == 4) {
                int answer = operations.quotient(num1, num2);
                System.out.println("The quotient of 2 whole number is: " + answer);
            } else {
                System.out.println("Invalid choice");
            }
        } else if ( method == 2 ) {
            int answer;
            switch (choice) {
                case 1:
                    answer = operations.sum(num1, num2);
                    System.out.println("The Sum of 2 whole number is: " + answer);
                    break;
                case 2:
                    answer = operations.difference(num1, num2);
                    System.out.println("The Difference of 2 whole number is: " + answer);
                    break;
                case 3:
                    answer = operations.product(num1, num2);
                    System.out.println("The product of 2 whole number is: " + answer);
                    break;
                case 4:
                    answer = operations.quotient(num1, num2);
                    System.out.println("The quotient of 2 whole number is: " + answer);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } else{
            System.out.println("Invalid choices");
        }
        sc.close();
    }

    public static void main (String [] args){
        test();
    } 
}









