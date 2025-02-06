import java.util.Arrays;

public class ModeFinder {
    public static int findMode(int[] arr) {
        Arrays.sort(arr); // Sorting helps in counting consecutive numbers easily
        
        int mode = arr[0];
        int maxCount = 1;
        int currentNum = arr[0];
        int currentCount = 1;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentNum) {
                currentCount++;  // Increase count for current number
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mode = currentNum;  // Update mode
                }
                currentNum = arr[i];  // Reset for the new number
                currentCount = 1;
            }
        }
        
        // Final check for the last number in array
        if (currentCount > maxCount) {
            mode = currentNum;
        }
        
        return mode;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 1, 2, 2, 3, 4, 1, 1, 1, 1, 1, 4, 5, 4, 3, 3, 3, 3};
        System.out.println("Mode: " + findMode(numbers)); // Output: 3 or 4 depending on the most frequent
    }
}
