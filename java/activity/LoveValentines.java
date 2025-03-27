import java.util.Scanner;
import java.awt.Desktop;
import java.net.URI;
//import java.io.*;

class Loved {
    static void yes(){
        System.out.println("I love you too");
    }
    static void no() {
        System.out.println("Ouch :(");
    }
}

public class LoveValentines {
    public static void main(String [] args) throws Exception {
        Scanner please = new Scanner(System.in); 
        System.out.print("Do you love me? (yes/no)\n>>");
        String yn = please.nextLine();



        if ( yn.toLowerCase().equals("yes") ) {
            Loved.yes();
        } else if ( yn.toLowerCase().equals("no") ) {
            Loved.no();
        } else {
            System.out.println("Read the instruction Lol Idiot");
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(new URI("https://www.youtube.com/watch?v=xvFZjo5PgG0"));
        }
        please.close();
    }
}








