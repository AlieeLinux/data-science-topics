import java.util.Scanner;
import java.util.InputMismatchException;

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;  ;;;   ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;         ;;;;      ;;;;;;        ;;;;  ;;;   ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;  ;;;;;;;;  ;;; ;;;;;; ;;;;;; ;;;;;     ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;  ;;;;;;;;      ;;;;;; ;;;;;; ;;;;;;;  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;  ;;;;;;;;  ;;;; ;;;;; ;;;;;; ;;;;;;;  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;  ;;;;;;;;  ;;;; ;;;;;        ;;;;;;;  ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;


class SimpleLim {
    public static void main(String args[]) {
        System.out.print("x=5. lim 9x/2 is? \n>>");

        double x = limx(5);
        double solution = (9*x)/2;

        Scanner user = new Scanner(System.in);

        double UserAnswer = user.nextDouble();
        boolean terminator = IfCorrect(UserAnswer, solution);
        while (terminator) {
            try {
                System.out.print("whoops try again\n>>");
                UserAnswer = user.nextDouble();
                terminator = IfCorrect(UserAnswer, solution);
            } catch (InputMismatchException e) {
                System.out.print("What an idiot\n");
                user.close();
                System.exit(1);
            }
        }
        System.out.println("Ayy congrats!!");
        user.close();
    }

    private static double limx(int x) {
        return x;
    }

    private static boolean IfCorrect(double UserAnswer, double Answer) {
        if ( UserAnswer == Answer ) {
            return false;
        } else {
            return true;
        }
    }
}
