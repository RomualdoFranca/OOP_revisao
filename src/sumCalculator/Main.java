package sumCalculator;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Subtraction = " + calculator.getSubtractionResult());
        System.out.println("Multiplication = " + calculator.getMultiplicationResult());
        System.out.println("Division = " + calculator.getDivisionResult());
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Subtraction = " + calculator.getSubtractionResult());
        System.out.println("Multiplication = " + calculator.getMultiplicationResult());
        System.out.println("Division = " + calculator.getDivisionResult());
    }
}