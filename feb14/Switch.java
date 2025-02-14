import java.util.Scanner;


class Switch {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Insert a day on a week \n>>");

        int day = input.nextInt();



        switch (day) {
        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("there's only 7 days in a week :(");

            input.close();
        }
    }
}
