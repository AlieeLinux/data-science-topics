import MeanMedianMode.Mode;
import java.util.Scanner;

class ModeExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] array = new int[];
        int ArrayLength;
        System.out.print("how long your data will be? \n: ");
        ArrayLength = input.nextInt();
        int[] UserArray = new int[ArrayLength];
        System.out.println("insert your datas in any order");
        for (int i = 0; i < UserArray.length; i++) {
            System.out.print(": ");
            UserArray[i] = input.nextInt(); 
        }
        int result = Mode.ModeResult(UserArray);
        System.out.println(result);
        input.close();
    }
}
