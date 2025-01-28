//import the java util to collect user input
import java.util.Scanner;

final class StringUse {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("hello. who are you?\n>>");

        String Username = input.nextLine();

        //hehehe
        if (Username == "") {
            System.out.println("what an idiot. Insert a name. You nameless? hmm?");
            input.close();
            System.exit(69);
        }

        System.out.println("hello there "+ Username + ", how is your day? :D");

        //close the scanner to avoid mem leak\
        input.close();
    }
}
