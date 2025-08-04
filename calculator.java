import java.util.Scanner;
public class calculator {
    public static double add(double a, double b) {
        return a + b;
    }


    public static double subtract(double a, double b) {
        return a - b;
    }

  
    public static double multiply(double a, double b) {
        return a * b;
    }

    
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("Choose operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();

            double num2 = scanner.nextDouble();
            if (choice == 5) {
                running = false;
                System.out.println("Exiting Calculator. Goodbye!");
                break;
            }
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            switch(choice){
                case 1:
                System.out.println("addition is"+add(num1, num2));
                case 2:
                System.out.println("substraction is "+subtract(num1, num1));
                case 3:
                                System.out.println("multiplication"+multiply(num1, num1));
                case 4:
                System.out.println("division"+divide(num1, num1));
                default:
                System.out.println("invalid switch ");
            }
        }



    }
}

