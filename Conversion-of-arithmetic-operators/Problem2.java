class Problem2 {
    public static void main(String args[]) {
        // mag assign tayo ng variable
        int x = 40;
        double y = 6.2;
        float z = 14.7f;
        long w = 20000L;

        //gawa tayo ng variable para sa Arithmetic operations
        //at i convert naten ang mga hindi supported na variable kagaya ng float gawin nateng
        //double gamit ang Type Conversions para hindi magkaproblema.
        double XtimesY = x * y;
        double WdivideZ = (double) w / (double) z;
        double YplusZ = y + (double) z;
        //ito ay magiging int according sa activity na sinend ni sir
        int WmoduloX = (int) w % x;

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
        System.out.println("int to double (explicit): " + x +" -> "+ xToDouble );
        System.out.println("double to int (explicit): " + y +" -> "+ yToint);
        System.out.println("long to float (explicit): " + w +" -> "+ wToFloat );

        //made with <3 gamit ang vim editor
    }
}
