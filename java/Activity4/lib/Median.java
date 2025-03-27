package lib;
import java.util.Arrays;

public class Median {
    public static double Medians(float x[]) {
        Arrays.sort(x);
        int ifeven = x.length / 2;
        if (!(ifeven % 2 == 0)) {
            double median = (x[ifeven] + x[ifeven - 1])/2;
            return median;
        } else {
            return x[ifeven];
        }
    }
}
