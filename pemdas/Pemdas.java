class Pemdas {
    public static void main(String args[]) {
        int w, x, y, z, p;
        w=9;
        x=8;
        p=23;
        y=1;
        z=1;

        System.out.print("if: w=9 x=8 p=23 y=1 z=1 \n\nw+(z-x)+y/p-z is: ");

        double FullPemdas = w*(z-x)+y/p-z;

        System.out.print(FullPemdas);
    }
}
