import java.util.Scanner;
import MeanMedianMode.Meadian;

class MedianExample {
    public static void main(String args[]) {
        Scanner UserInput = new Scanner(System.in);
        
        try {
        System.out.print("How long would your data will be? \n: ");

        int ArrayLength = UserInput.nextInt();
        int[] x = new int[ArrayLength];       
        int i;
        System.out.print("Type your data in any order: \n");
        for ( i = 0; i < ArrayLength; i++ ) {    
            System.out.print("");
            x[i] = UserInput.nextInt();
            System.out.println();
        }
        System.out.println(Meadian.Median(x));
        UserInput.close();
        } finally {
        }
    }
}
