package MeanMedianMode;

public class Mean {
    public static double TheMeanOf(int [] x) {
        double Formula = 0;
        for (int i = 0; i < x.length; i++) {
            Formula += x[i];
        }
        double total = Formula / x.length;

        return total;
    }
}
