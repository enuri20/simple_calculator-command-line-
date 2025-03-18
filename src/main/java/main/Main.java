package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to My Calculator!");
        Scanner scanner = new Scanner(System.in);
        double res = 0;
        boolean isFirst = true;

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Exiting the calculator. Goodbye!");
                break;
            }
            double n1;
            if (isFirst) {
                System.out.print("Enter the first number: ");
                n1 = scanner.nextDouble();
                isFirst = false;
            } else {
                n1 = res;
                System.out.println("Using previous result: " + res);
            }

            System.out.print("Enter the second number: ");
            double n2 = scanner.nextDouble();


            switch (choice) {
                case 1: res = n1 + n2;
                    System.out.println("Result: " + res);
                    break;
                case 2: res = n1 - n2;
                    System.out.println("Result: " + res);
                    break;
                case 3: res = n1 * n2;
                    System.out.println("Result: " + res);
                    break;

                case 4: res = n1 / n2;
                if (n2 == 0) {
                    System.out.println("Error! Division by 0");

                }
                    else System.out.println("Result: " + res);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;


            }




        }
        scanner.close();

    }
}