class Problem1 { // gawa tayo ng class at dapas parehas sa pangalan ng file mo kung gumagamit ka ng public class
    public static void main(String args[]) { // Main function ng java. needed ito 

        //Intilialize naten yung mga variable according sa problems
        int num1 = 25; // Mag initialize tayo ng int variable na may value na 25 at may pangalan na num2
        double num2 = 12.5; // mag initialize tayo ng double variable na may value ng 12.5 at may pangalan na num2
        float num3 = 8.75f; // mag initialize tayo ng float variable na may value ng 8.75f at may pangalan na num3
        long num4 = 50000L;// mag initialize tayo ng long variable na may value ng 50000L at may pangalan na num4

        // icoconvert ang mga variable sa ibang types like int to float gamit ang conversion of arithmic operations para ma iwasan ang mga error 
        double Doublenum1 = (double) num1; //dito I convert naten ang num1 sa double na may pangalan na Doublenum1
        int Intnum2 = (int) num2; // i convert naten yung num2 sa int na may pangalan na Intnum2
        long Longnum3 = (long) num3; // dito i convert naten yung num3 sa long na may pangalan na Longnum3 

        //ito ang mga math function para ma solve ang mga variables like x+y
        double Answernum1num2 = num1 + num2; // itong double Answernum1num2 Variable na ito i aad neto yung num1 at num2
        double AnswerNum4MinusNum3 = num4 - num3; // same sa tuktok pero iba yung operator. dito naman i babawas naman neto yng num4 sa num3
        double AnswerNum2xNum3 = num2 * num3; // same sa tuktok pero iba yung operator. dito naman I mumultiply naman neto yng num2 sa num3
        //gawin nating tong int intead as double according sa activity na sinend ni sir
        int AnswerNum4Dividenum1 = (int) num4 / num1; //gawin nating tong int intead as double according sa activity na sinend ni sir
        double AnswerNum1ModuloNum3 = num1 % num3; // same sa pangalawa pero gamit tayo ng modulus dito

        //I print out ang mga resulta ng answer variables so Arithmetic Operations
        System.out.println("Arithmetic Operations:"); // I print out naten yung Arithmetic Operations
        System.out.println(num1 +" + "+ num2 +" = "+ Answernum1num2); // I print out naten yung variable ng num1+num2 
        System.out.println(num4 +" - "+ num3 +" = "+ AnswerNum4MinusNum3); // i print out naman naten yung variable ng num4-num3
        System.out.println(num2 +" * "+ num3 +" = "+ AnswerNum2xNum3); // i print out naman naten yung variable ng num2*num3 
        System.out.println(num4 +" / "+ num1 +" = "+ AnswerNum4Dividenum1); //i print out naman naten yung variable ng num4/num1
        System.out.println(num1 +" % "+ num3 +" = "+ AnswerNum1ModuloNum3); // i print out naman naten yung variable ng num1%num3


        System.out.println("\nType Conversations: "); //i print out naman ang Type conversions
        System.out.println("int to double: "+num1+" -> " + Doublenum1); // i print out naten yung num1 as double 
        System.out.println("double to int (explicit): "+num2+" -> " + Intnum2); //i print out naten yung num2 as int
        System.out.println("float to long (explicit): "+num3+" -> " + Longnum3); //i print out natin yung num3 as long

        //made with <3 gamit ang vim editor
    }
}
