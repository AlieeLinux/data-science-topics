package SimpleSort;

import java.util.Arrays;

public class Sort {
    public static void Median(int array[]) {
        Arrays.sort(array);
        int arrlength = array.length / 2;
        if ( arrlength % 2 == 0 ) {
        int x = arrlength - 1;
        int y = arrlength + 1;
        int z = (array[x] + array[y]) / 2;;;;;;;;;;;;;;;
        System.out.println("the median is: "+ z);
        } else {
            System.out.println("the median is: " + array[array.length / 2]);
        }
    }
}
