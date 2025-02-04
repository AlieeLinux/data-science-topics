class Arithmicllllllaaaaaa {
    public static void main(String args[]){
        int x = 9; //simple division that leads to a double variable

        System.out.println(x);
        System.out.println("int x=9. x divided by 13 is: " + (double) x/13); //this will return as double instead of int
        //or much better

        double y = (double) x;
        
        System.out.println("Convert: " + x + " to double: " + y );
    }
}
