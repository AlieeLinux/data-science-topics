import java.util.InputMismatchException;

class errorhunt{
    public static void main(String [] args) {
        InputMismatchException SyntaxError = new InputMismatchException("Syntax Error on line 3");

        System.out.println("Hello world");
        throw SyntaxError;
    }
}
