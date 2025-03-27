import java.util.InputMismatchException;
import java.util.Scanner;

class AverageGrade {
    private static double TotalAverageGrade(double y) {
        double x = y / 8;
        return x;
    }
    private static boolean IfPassed(double Grade) {
        if (Grade <= 3.5 ) {
            return true;
        } else {
            return false;
        }
    } 

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
 
        try {
           double[] grade = new double[8];
            
            System.out.print("\nInsert your first Grade\n>>");
            grade[0] = input.nextDouble();

            System.out.print("\nInsert your second Number\n>>");
            grade[1] = input.nextDouble();

            System.out.print("\nInsert your third Grade\n>>");
            grade[2] = input.nextDouble();

            System.out.print("\nInsert your fourth Grade\n>>");
            grade[3] = input.nextDouble();


            System.out.print("\nInsert your fifth Grade\n>>");
            grade[4] = input.nextDouble();


            System.out.print("\nInsert your sixth Grade\n>>");
            grade[5] = input.nextDouble();


            System.out.print("\nInsert your seventh Grade\n>>");
            grade[6] = input.nextDouble();


            System.out.print("\nInsert your eight Grade\n>>");
            grade[7] = input.nextDouble();

            double Total = 0 + grade[0] + grade[1] + grade[2] + grade[3] + grade[4] + grade[5] + grade[6] + grade[7];

            
            double AverageGrade = TotalAverageGrade(Total);
            System.out.println("\n\nYour average grade is: "+AverageGrade +"\n");

            boolean[] a = new boolean[8];

            a[0] = IfPassed(grade[0]);

            a[1] = IfPassed(grade[1]);

            a[2] = IfPassed(grade[2]);

            a[3] = IfPassed(grade[3]);

            a[4] = IfPassed(grade[4]);

            a[5] = IfPassed(grade[5]);

            a[6] = IfPassed(grade[6]);

            a[7] = IfPassed(grade[7]);

            boolean IfValid = true;

            for (int i = 0; i < a.length; i++) {
                if (grade[i] <= 6 && grade[i] <=-1 )  {
                    System.out.println("Invalid grade.");
                    IfValid = false;
                } else if (a[i] == true) {
                    System.out.println("Grade: "+ grade[i] +" is passed!! congrats");
                }  else {
                    System.out.println("Grade: "+ grade[i] + " is failed!! bubu");
                }
            }

            if (IfValid) {
                if (AverageGrade <= 5 ) {
                    System.out.println(" \nYour average grade is: "+ AverageGrade + " which is passed!");
                } else {
                    System.out.println("\nYour average grade is: "+ AverageGrade +" Failed. better luck next time");
                }
            } else {
                System.out.println("your grade is not valid sowwi :)))");
            }

            input.close();
        } catch (InputMismatchException e) {
            System.out.println("Type ka ng number bhubhu");
            input.close();
        }
    }
}
