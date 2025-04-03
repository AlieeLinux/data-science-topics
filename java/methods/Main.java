//import java.security.Policy.Parameters;
import java.util.Scanner;
//output:

//1st number : 6
//2nd  num :   3

//The sum is : 9
//the difference  is: 3
//The product is: 18
//The qoutient is: 2

public class Main {
    protected void Sum(int x, int y) {
        int ans = x + y;
        System.out.println("The sum is : " + ans);
    }

    protected void Difference(int x, int y) {
        int ans =  x - y;
        System.out.println("the difference is: " + ans);
    }

    protected void Product(int x, int y) {
        int ans = x * y;
        System.out.println("the product is: " + ans);
    }

    protected void Quotient(int x, int y) {
        int ans = x / y;
        System.out.println("the quotient is: " +  ans);
    }

    protected void IsEven(int x, int y) {
        boolean a = x + y % 2 == 0;
        System.out.println(x + "" + "+" + y + " is it even: "+ a);
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        Main u = new Main();
        System.out.print("Insert the first number: ");
        int x = input.nextInt();
        System.out.print("Insert the second Number: ");
        int y = input.nextInt();
        System.out.println();

        u.Sum(x, y);
        u.Difference(x, y);
        u.Product(x, y);
        u.Quotient(x, y);
        u.IsEven(x, y);
        input.close();
    }
}







