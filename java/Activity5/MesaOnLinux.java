//activity 5

//contruct  a program that will allow you to input 5 numbers only and determin each inputted number whether odd or even number.
//It will alao count, on how many even and odd numbers are being inputted.

import java.util.InputMismatchException;
import java.util.Scanner;

class Mouse {

    public static int ODD=0, EVEN=0;

    static String IsEven(int x) {
        if (x % 2 == 0) {
            EVEN++;
            return "even!";
        } else {
            ODD++;
            return "odd!";
        }
    }



    public static void main(String[] args) {
        int[] FiveNum = new int[5];

        System.out.println("Enter 5 whole(Int) Numbers \n");
        try {

        Scanner Mysc = new Scanner(System.in);


        for (int i = 0; i < FiveNum.length; i++) {
            System.out.print("Enter the "+ (i + 1) + " Number: ");
            FiveNum[i] = Mysc.nextInt();
        }

        for (int i = 0; i < FiveNum.length; i++) {
           System.out.println((i+1) + ". " + FiveNum[i] + " Is " + IsEven(FiveNum[i]));
        }

        System.out.println("\n\nThere is " + EVEN + " Even and There is " + ODD + " odd!!");
        Mysc.close();

        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid whole number");
        }
    }
}
