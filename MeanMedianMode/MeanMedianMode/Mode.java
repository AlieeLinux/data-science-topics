package MeanMedianMode;
import java.util.HashMap;
import java.util.Map;

public class Mode {
    public static int ModeResult(int[] array) {
        Map<Integer, Integer> frequentvalue = new HashMap<>();
        for ( int i = 0; i < array.length; i++ ) {
            frequentvalue.put(array[i], frequentvalue.getOrDefault(array[i], 0) + 1);
        }

        int mode = array[0]; //first entry of array
        int Maxcount = 0;

        for ( Map.Entry<Integer, Integer> entry :frequentvalue.entrySet() ) {
            if ( entry.getValue() > Maxcount ) {
                Maxcount = entry.getValue();
                mode = entry.getKey();
            }
        }

        return mode;
    }
}
