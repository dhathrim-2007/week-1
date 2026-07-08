import java.util.*;

public class Shapes {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        String ch;
        float l, breadth, side;

        System.out.println("Enter the choice (rectangle/square):");
        ch = sc.next();

        System.out.println("Enter length:");
        l = sc.nextFloat();

        System.out.println("Enter breadth:");
        breadth = sc.nextFloat();

        System.out.println("Enter side:");
        side = sc.nextFloat();

        switch (ch) {

            case "rectangle":
                System.out.println("Area of Rectangle = " + (l * breadth));
                break;

            case "square":
                System.out.println("Area of Square = " + (side * side));
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}