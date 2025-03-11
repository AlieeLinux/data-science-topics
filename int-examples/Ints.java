//this is a comment(has //)

public class Ints {
    private static int withreturn() {
        System.out.println("hello");
        return 1;
    }
    public static void main(String args[]) {
        //assume a and b is given
        int a=2, b=1;

        int c = (a*2+2*a*b-4*(1+2))/2;
        
        System.out.println(c);

        //-2 should be the output
    }
}
