import java.util.Scanner;
import java.util.InputMismatchException;
import lib.Median;

public class Rep {
    static void Oneto100() {
        int myint=1;
        while (myint<=100) {
            System.out.println("counting to 100 this is: " + myint);
            myint+=1;
        }
    }

    static void Accept5Num() {
        Scanner input = new Scanner(System.in);
        float[] Numbers = new float[5];
        for (int i = 0; i < Numbers.length; i++) {
            System.out.print("Enter your "+ (i + 1) +"  number\n>>");
            Numbers[i] = input.nextInt();
        }
        float Mean = Numbers[0] + Numbers[1] + Numbers[2] + Numbers[3] + Numbers[4] / Numbers.length;
        System.out.println("The mean of your numbers is: " + Mean);
        System.out.println("The median of your numbers is: " + Median.Medians(Numbers));
        input.close();
    }

    public static void main(String [] args) {
        try {
            Oneto100();
            System.out.println("\n\n\n\n\n 1. Accept 5 number: \n");
            Accept5Num();

        } catch (InputMismatchException e) {
            System.out.println("Error U typed non int things");;
        }
    }
}
