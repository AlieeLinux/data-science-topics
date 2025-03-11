import java.text.DecimalFormat;


// lim
// x→10
  
// x
//---
// 2
//  =
//
//
class Problem1 {
    public static void main(String args[]) {
        DecimalFormat roundoff = new DecimalFormat("0.00");;;;;;;;;;
        int x = 10;
        double xapproach = 0;

        //create loop that x aproaches to
        for (float i=0; i<x; i+=0.1) {
            xapproach += 0.1;
            
            System.out.println("f(" + roundoff.format(xapproach) + ") x/2 = " + roundoff.format(xapproach/2));
        }

        //easy conversion
/*        double answer = x/2;
        System.out.print("The lim of x->10 \n x");
        System.out.print("\n---");
        System.out.print("\n 2\n\n");
        System.out.println("is\nf("+ x  +") = "+ answer +" \n");
        System.out.println(answer);
*/
    }
}
