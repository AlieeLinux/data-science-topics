import java.util.Scanner;

//senior 20% student 10% ordinary 0

class AirFareCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fare amount: ");

        int myint = input.nextInt();

        switch (myint) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
        }
        input.close();
        System.out.println();
    }
}
