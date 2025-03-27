import java.util.InputMismatchException;
import java.util.Scanner;
import liblary.Input;

public class Inputt {
    public static void main(String [] args) {
        try{
        Scanner input = new Scanner(System.in);

        System.out.print("enter your ge \n>>");

        int age = input.nextInt();

        System.out.println("\n "+ age);
        input.close();

        } catch (InputMismatchException e) {
            System.out.println(Input.mystr());
        }
    }
        public static boolean bulbul(int x, int y) {
            if (x > y) {
                return true;
            } else {
                return false;
            }
        }
}

