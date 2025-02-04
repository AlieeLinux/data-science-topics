//ignore this sir :)
//o Addition of num1 and num2
//o Subtraction of num4 and num3
//o Multiplication of num2 and num3
//o Integer division of num4 by num1
//o Modulo operation between num1 and num3

//o Convert int num1 to double
//o Explicitly cast double num2 to int
//o Convert float num3 to long using explicit castin


class Problem1 {
    public static void main(String args[]) {

        //Intilialize naten yung mga variable according sa problems
        int num1 = 25;
        double num2 = 12.5;
        float num3 = 8.75f;
        long num4 = 50000L;

        //Ito ay icoconvert ang mga variable sa ibang types like int to float gamit ang conversion of arithmic operations
        double Doublenum1 = (double) num1;
        int Intnum2 = (int) num2;
        long Longnum3 = (long) num3;

        //ito ang mga math function para ma solve ang mga variables like x+y
        double Answernum1num = num1 + num2;
        double AnswerNum4MinusNum3 = num4 - num3;
        double AnswerNum2xNum3 = num2 * num3;
        int AnswerNum4Dividenum1 = (int) num4 / num1;
        double AnswerNum1ModuloNum3 = num1 % num3;

        //I print out ang mga resulta ng answer variables so Arithmetic Operations
        System.out.println("Arithmetic Operations:");
        System.out.println(num1 +" + "+ num2 +" = "+ Answernum1num);
        System.out.println(num4 +" - "+ num3 +" = "+ AnswerNum4MinusNum3);
        System.out.println(num1 +" * "+ num2 +" = "+ AnswerNum2xNum3);
        System.out.println(num1 +" / "+ num2 +" = "+ AnswerNum4Dividenum1);
        System.out.println(num1 +" % "+ num2 +" = "+ AnswerNum1ModuloNum3);

        //i print out naman ang mga Type conversions
        System.out.println("\nType Conversations");
        System.out.println("int to double: 25 -> " + Doublenum1);
        System.out.println("double to int (explicit): 12.5 -> " + Intnum2);
        System.out.println("float to long (explicit): 8.75 -> " + Longnum3);

        //made with <3 gamit ang vim editor
    }
}
