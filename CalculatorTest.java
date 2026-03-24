public class CalculatorTest {

    public static void main(String[] args) {

        String expression = "4+5";
        String expectedResult = "9";

        String actualResult = Calculator.Run(expression);

        if (expectedResult.equals(actualResult)) {
            System.out.println("Test succeeded.");
        } else {
            System.out.println("Test failed.");
        }
    }
}
