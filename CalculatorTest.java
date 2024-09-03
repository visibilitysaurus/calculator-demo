public class CalculatorTest {
    public static void main(String[] args) {
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testInvalidOperator();
        testDivisionByZero();
    }

    public static void testAddition() {
        String[] args = {"2", "+", "3"};
        // Add output explaining the test case
        java.lang.System.out.println("Testing 2 + 3");
        java.lang.System.out.println("Expected output: Result: 5.0");
        Calculator.main(args); // Expected output: Result: 5.0
    }

    public static void testSubtraction() {
        String[] args = {"5", "-", "2"};
        // Add output explaining the test case
        java.lang.System.out.println("Testing 5 - 2");
        java.lang.System.out.println("Expected output: Result: 3.0");
        Calculator.main(args); // Expected output: Result: 3.0
    }

    public static void testMultiplication() {
        String[] args = {"4", "*", "2"};
        // Add output explaining the test case
        java.lang.System.out.println("Testing 4 * 2");
        java.lang.System.out.println("Expected output: Result: 8.0");
        Calculator.main(args); // Expected output: Result: 8.0
    }

    public static void testDivision() {
        String[] args = {"10", "/", "2"};
        // Add output explaining the test case
        java.lang.System.out.println("Testing 10 / 2");
        java.lang.System.out.println("Expected output: Result: 5.0");
        Calculator.main(args); // Expected output: Result: 5.0
    }

    public static void testInvalidOperator() {
        String[] args = {"2", "%", "3"};
        Calculator.main(args); // Expected output: Error: Invalid operator
    }

    public static void testDivisionByZero() {
        String[] args = {"5", "/", "0"};
        Calculator.main(args); // Expected output: Error: Division by zero is not allowed
    }

    // Add more test cases for edge cases
    public static void testEdgeCases() {
        // Test with negative numbers
        String[] args1 = {"-5", "+", "3"};
        // Add output explaining the test case
        java.lang.System.out.println("Testing -5 + 3");
        java.lang.System.out.println("Expected output: Result: -2.0");
        Calculator.main(args1); // Expected output: Result: -2.0

        // Test with decimal numbers

        String[] args2 = {"2.5", "*", "2"};
        // Add output explaining the test case
        java.lang.System.out.println("Testing 2.5 * 2");
        java.lang.System.out.println("Expected output: Result: 5.0");
        Calculator.main(args2); // Expected output: Result: 5.0

        // Test with large numbers
        String [] args3 = {"1000000000", "/", "2"};
        // Add output explaining the test case
        java.lang.System.out.println("Testing 1000000000 / 2");
        java.lang.System.out.println("Expected output: Result: 500000000.0");
        Calculator.main(args3); // Expected output: Result: 500000000.0
    }
}