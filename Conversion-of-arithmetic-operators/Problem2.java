//1. Declares and initializes the following variables:
//o int x = 40
//o double y = 6.2
//o float z = 14.7f
//o long w = 20000L
//2. Performs and prints the results of the following operations:
//o Multiplication of x and y
//o Division of w by z
//o Addition of y and z
//o Modulo operation between w and x
//3. Demonstrates type conversion:
//o Convert x to double implicitly
//o Explicitly cast y to int
//o Convert w to float using explicit casting


class Problem2 {
    public static void main(String args[]) {
        // mag assign tayo ng variable
        int x = 40;
        double y = 6.2;
        float z = 14.7f;
        long w = 20000L;

        //gawa tayo ng variable para sa Arithmetic operations
        //at i convert naten sa double ganit ang Type Conversions para hindi magkaproblema 
        double XtimesY = x * y;
        double WdivideZ = (double) w / (double) z;
        double YplusZ = y + (double) z;
        double WmoduloX = (double) w % x;

        //i convert naten ang mga variables sa ibang type ng variable para mas mapadale
        //example. int to double
        double xToDouble = (double) x;
        int yToint = (int) y;
        float wToFloat = (float) w;

        System.out.println("Arithmetic Operations: ");
        System.out.println(x +" * "+ y +" = "+ XtimesY);
        System.out.println(w +" / "+ z +" = "+ WdivideZ);
        System.out.println(y +" + "+ z +" = "+ YplusZ);
        System.out.println(w +" % "+ x +" = "+ WmoduloX);

        //I print na naten ang mga Type Conversations:
        System.out.println("\nType Conversions: ");
        System.out.println("int to double: " + x +" -> "+ xToDouble );
        System.out.println("double to int: " + y +" -> "+ yToint);
        System.out.println("long to float: " + w +" -> "+ wToFloat );





    }
}
