class Main {

    public static void main(String [] args){
        String[] Cars = {"Porche", "buggati", "tplink", "Ram", "pord", "Gili", "toyota", "nexus"};

        Cars[0] = "bolbo";
        System.out.println(Cars.length);

        for (int i = 0; i < Cars.length; i++) {
           System.out.println(Cars[i]);
        }

    }
}
