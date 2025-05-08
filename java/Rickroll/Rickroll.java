package Rickroll;
import java.awt.Desktop;
import java.net.URI;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Rickroll {
    static void Error() {
        try {
            URI uri = new URI("https://youtu.be/dQw4w9WgXcQ?si=SJBb96NQ4-hTwPWC");
            Desktop desktop = Desktop.getDesktop();

            desktop.browse(uri);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        try{
        System.out.print("Enter your age\n>>");

        int age = input.nextInt();

        if (age >= 18) {
            System.out.println("You can vote now! yipee!!!");
        } else {
            System.out.println("Too young");
        }
        input.close();
    } catch (InputMismatchException e) {
        System.out.println(e);
        Error();
        }
    }
}
