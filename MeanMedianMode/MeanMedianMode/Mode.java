package MeanMedianMode;

public class Mode {
    public static int ModeResult(int[] array) {
        int mode = array[0];
        int x, y, z;
        x=1;
        y=array[0];
        z=1;

        for (int i = 1; i < array.length; i++) {
           if (array[i] == y) {
               z++;
           } else if (x > z) {
               mode = z;
           }
           y = array[i];
           z = 1;
        }

        if (x > z) {
            mode = y;
        }

        return mode;
    }
}
