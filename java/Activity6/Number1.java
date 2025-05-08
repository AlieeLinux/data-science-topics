import java.util.Scanner;
import java.util.InputMismatchException;

public class Number1 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        boolean terminator = false;
        String yn;
        while (!terminator) {
            try {
                int x, y;
                System.out.print("1st Number: ");
                x = input.nextInt();
                System.out.print("2nd Number: ");
                y = input.nextInt();
                int sum = x+y, difference=x-y, product=x*y;
                float quotient=x/y;

                System.out.println("\nthe sum is : " + sum);
                System.out.println("the difference  is: " + difference); 
                System.out.println("The product is: " + product); 
                System.out.println("The quotient is: " + quotient + "\n\n");

                System.out.print("Try again(y/n)?: ");

                yn = input.next();

                if (yn.toLowerCase().equals("y")) {
                    terminator = false;
                } else {
                    terminator = true;
                    System.out.println("");
//                throw new InputMismatchException();

                }
            }
            catch (InputMismatchException e) {
                System.out.println("User error!!");
                terminator = true;
                input.close();
            }
        }
    }
}

class Number2 {
    public static void main(String [] args) {
        int[] to100 = new int[100];
        int x =0;

        for (int i = 0; i < to100.length; i++) {
            x+=1;
            to100[i] = x;
            System.out.println("Number " + to100[i]);
        }
    }
}
