import java.util.Scanner;

public class BazarProgramYear {
    public static void main(String args[]) {
        Scanner userinput = new Scanner(System.in);
        System.out.print("please enter your year level\n >>");
        
        int year = userinput.nextInt();
        
        userinput.close();
        
        if (year==1) 
            System.out.println("First Year");
        else if (year==2)
            System.out.print("Second Year");
        else if (year==3) 
            System.out.println("third Year");
        else if (year==3) 
            System.out.println("Fourth year");
        else 
            System.out.print("Invalid year"); 
        
        System.exit(0);
    }
}
