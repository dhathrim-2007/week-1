import java.util.Scanner;

public class AdvancedJavaLab {

    static Scanner sc = new Scanner(System.in);

    static void send() {
        System.out.println("Hi");

        System.out.println("What kind of operation do you want to perform (+, -, *, /)?");
        receive();

        System.out.println("Bye");
        System.out.println("Thank you");
    }

    static void receive() {
        System.out.println("Hello! Hi");

        char op = sc.next().charAt(0);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b != 0)
                    result = a / b;
                else {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                return;
        }

        System.out.println("Result = " + result);
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Advanced Java Lab");
        send();
    }
}