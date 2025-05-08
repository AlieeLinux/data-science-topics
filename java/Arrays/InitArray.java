public class InitArray {

    public static void main(String [] args) {
        int[] X = new int[200];

        int even = 0;

        for (int i = 0; i < X.length; i++) {


            X[i] = 0 + even;
            even+=1;

            if (X[i] % 2 == 0) {
                System.out.println(X[i] + " is even");
            } else {
                System.out.println(X[i] + " Is odd");
            }

        }
    }
}
