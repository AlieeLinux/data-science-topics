package lib;

import java.util.Scanner;

public class AllActivity {
    public static void SwitchFunction() {
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

    public static void VissionMissionOfIsuuppercase() {
        String VisionMission = "Vision \n\tA leading Research University in the ASEAN Region. \n\n\nMission \n\t The Isabela State University is committed to develop globally competitive human, technological resources and services through quality instruction, innovative research, responsive community engagement and viable resource management programs for inclusive growth and sustainable development.";

        System.out.println(VisionMission + "\n\n\n\n\n" + VisionMission.toUpperCase() + "\n\n\n\n\n" + VisionMission.toLowerCase());
    } 

    public static void VissionMissionOfIsu() {
        String VisionMission = "Vision \n\tA leading Research University in the ASEAN Region. \n\n\nMission \n\t The Isabela State University is committed to develop globally competitive human, technological resources and services through quality instruction, innovative research, responsive community engagement and viable resource management programs for inclusive growth and sustainable development.";

        System.out.println(VisionMission);
    } 


    public static void declareString() {
        String isabela = "ISABELA ", state="STATE ", university = "UNIVERSITY";

        System.out.println(isabela + state + university);
    }
}

