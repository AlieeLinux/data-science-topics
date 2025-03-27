import java.util.Scanner;

public class BazarProgramAge {
    public static void main(String args[]) {
        Scanner userinput = new Scanner(System.in);
        int age;
        System.out.print("please enter your age \n >>");
        age = userinput.nextInt();
        userinput.close();

        if ( age >= 18 )
            System.out.println("Congrats! you are a qualified voters");
        else 
            System.out.println("not a qualified voters");

        System.out.println("please enter a valud number");
        System.exit(1);
    }
}
