public class Calculator {
    public static void main (String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[2]);
        String operator = args[1];
        float result;
        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = (float) a / b;
                } else {
                    System.out.println("Division by 0 is not allowed");
                    return;
                }
                break;
            default:
                System.out.println("Unknown operator!");
                return;
        }
        System.out.println("Result " + String.format("%.2g%n", result));
    }
}
