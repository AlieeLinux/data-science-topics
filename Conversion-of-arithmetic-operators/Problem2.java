class Problem2 { // gawa tayo ng class magkatugma sa filename kung gagamit ka ng public class
    public static void main(String args[]) { // main function ng java. kinakailangan ito
        // mag assign tayo ng variable galing sa activity
        int x = 40; // mag initialize tayo ng int variable na may pangalan na x at mag declare tau ng value: 40
        double y = 6.2; // mag initialize tayo ng int variable na may pangalan na x at mag declare tau ng value: 6.2
        float z = 14.7f; // mag initialize tayo ng int variable na may pangalan na x at mag declare tau ng value: 14.7f. f for float
        long w = 20000L; // mag initialize tayo ng int variable na may pangalan na x at mag declare tau ng value: 20000L/ L for long

        //gawa tayo ng variable para sa Arithmetic operations
        double XtimesY = x * y; // DITO gagawa tayo ng double variable na naglalagay ng sagot para sa x * y para hindi tayo mahirapan
        double WdivideZ = w / z; // dito gagawa tayo ng double variable na naglalagay ng sagot para sa w / z para hindi tayo mahirapan
        double YplusZ = y + z; // DITO gagawa tayo ng double variable na naglalagay ng sagot para sa y + z para hindi tayo mahirapan
        int WmoduloX = (int) w % x; //ito ay magiging int according sa activity na sinend ni sir

        //i convert naten ang mga variables sa ibang type ng variable para mas mapadale
        //example. int to double
        double xToDouble = (double) x; // I convet naten yung int x sa doublex as XtoDouble
        int yToint = (int) y; // dito naman i coconvert naten yong double y sa int as yToIn
        float wToFloat = (float) w; // same lang. I convert naten yung long w sa float as wToFloat

        System.out.println("Arithmetic Operations: "); // simpleng printout lang ng "Arithmetic Operations:" 
        System.out.println(x +" * "+ y +" = "+ XtimesY); //I print out naten si x,y at x*y variable
        System.out.println(w +" / "+ z +" = "+ WdivideZ); // I print out naten si w, z at w/z variable
        System.out.println(y +" + "+ z +" = "+ YplusZ); // I print out naten si y, z at y+z variable
        System.out.println(w +" % "+ x +" = "+ WmoduloX);// I print out naten si w, x at w%x variable

        //I print na naten ang mga Type Conversations:
        System.out.println("\nType Conversions: "); //simpleng print out ng "\nType Conversations lang"
        System.out.println("int to double (explicit): " + x +" -> "+ xToDouble ); // I rint out naten yung variable na nagconvert sa x to double
        System.out.println("double to int (explicit): " + y +" -> "+ yToint); // I print out naten yung variable na nag convert sa y to int
        System.out.println("long to float (explicit): " + w +" -> "+ wToFloat ); // I print out naten ying variable na nagconver sa w to float

        //made with <3 gamit ang vim editor
    }
}
