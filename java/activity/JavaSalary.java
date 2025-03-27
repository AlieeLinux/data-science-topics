import java.util.Scanner;

class JavaSalary {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);

        double MonthlyIncome;

        System.out.print("Enter your monthly income \n>>");
        MonthlyIncome = input.nextDouble();

        double SSS = MonthlyIncome * 0.10;
        double Tax = MonthlyIncome * 0.20;
        double PagIbig=100.00;

        double SalaryDeduction =  MonthlyIncome - SSS - Tax - PagIbig;

        System.out.println("\nSSS deduction: " + SSS + " Pesos");
        System.out.println("Tax Deduction: " + Tax + " Pesos");
        System.out.println("Pag Ibig Monthly Payment: " + PagIbig + " Pesos" + "\n\n");


        if ( SalaryDeduction < 0 ) {
            System.out.println("Total Remaining Salary: " + SalaryDeduction + " Pesos");
            System.out.println("Negative"); 
        } else {
            System.out.println("Total Remaining Salary: " + SalaryDeduction + " Pesos");
            System.out.println("Positive");
        }

        input.close();
    }

}