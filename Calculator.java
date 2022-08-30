//package GitPractice;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        printMenu();

        while(true) {
            int input = sc.nextInt();
            if(input == 1) {
                System.out.println("Enter the two numbers you would like to add");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();
                System.out.println(num1 + "+" + num2 + " = " + addTwoNumbers(num1,num2));
                printMenu();
            }
            else if (input == 2) {
                System.out.println("Enter the two numbers you would like to add");
                double num1 = sc.nextDouble();
                double num2 = sc.nextDouble();
                System.out.println(num1 + "+" + num2 + " = " + addTwoNumbers(num1,num2));
                printMenu();
            }
            else if(input == 3) {
                System.out.println("Program closed.");
                sc.close();
                break;
            }
            else {
                System.out.println("Invalid entry");
                printMenu();
            }
        }
    }
    public static int addTwoNumbers(int a, int b) {
        return a + b;
    }

    public static double addTwoNumbers(double a, double b) {
        return a + b;
    }

    public static void printMenu() {
        System.out.println("What would you like to do? \n1. Press 1 to add two Integers\n2. Press 2 to add decimal numbers\n3. Press 3 to exit");
    }
}
