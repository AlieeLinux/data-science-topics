import java.util.Arrays;
import java.lang.System;

class mode {
    public static void main(String args[]) {
        int[] myint = new int[3];

        myint[0] = 9;
        myint[1] = 9;
        myint[2] = 9;
        int numberofreps = 1;
        Arrays.sort(myint);
        int count = 0;

        for (int i = 1; i < myint.length; i++) {
            if ( myint[i-1] == myint [i] || i+1 > myint.length ) {
                RepetitiveInt[count] = myint[i-1];               
                count++;
                numberofreps++;
            } 
        }
         System.out.println(numberofreps);
         for (int q = 0; q < RepetitiveInt.length; q++) {
             System.out.println(RepetitiveInt[q]);
         }
    }
}
