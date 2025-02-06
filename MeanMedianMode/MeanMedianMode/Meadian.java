package MeanMedianMode;
import java.util.Arrays;

public class Meadian {
    public static double Median(int[] array) {
        Arrays.sort(array);
        int arrlength = array.length / 2;
        if ( arrlength % 2 == 0 ) {
            int x = arrlength - 1;
            int y = arrlength + 1;
            double z = (array[x] + array[y]) / 2;
        return z;
        } else {
            return arrlength;
        }
    }
}
