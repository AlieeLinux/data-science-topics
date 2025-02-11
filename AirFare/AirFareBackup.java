//senior 20%, Student 10%, ordinary 0

import java.util.Scanner;

public class AirFare {
    public static void main(String args[]) {
        double Fare, NetFare;
        int CustomerCode;

        Scanner Input = new Scanner(System.in);

        System.out.print("\nEnter fare amount: ");
        Fare = Input.nextDouble();
        System.out.print("Enter customer code [0=Ordinary, 1=Student, 2=Senior]: ");
        CustomerCode = Input.nextInt();
        System.out.println("\n");

        if ( CustomerCode == 1 ) {
            NetFare = Fare * 0.10;
            System.out.println("Netfare for Student: " + NetFare);
        }
        else if ( CustomerCode == 2 ) {
            NetFare = Fare * 0.20;
            System.out.println("Netfare for Senior: " + NetFare);
        } else if ( CustomerCode == 0 ) {
            NetFare = Fare;
            System.out.println("Netfare for Ordinary: " + NetFare);
        }
        else {
            System.out.println("Invalid");
        }
        Input.close();
        System.exit(0);
    }
}
