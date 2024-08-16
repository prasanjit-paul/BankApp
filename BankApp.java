import java.util.Scanner;


public class BankApp {

    private static double balance = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Simple Banking Application!");
        boolean exit = false;

        while (!exit) {
            System.out.println("\nPlease choose an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Thank you for using the Simple Banking Application!");
    }

    private static void deposit() {
        System.out.println("Enter the amount to deposit:");
        double amount = scanner.nextDouble();

        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposit successful! New balance: $%.2f\n", balance);
        } else {
            System.out.println("Invalid deposit amount. Please try again.");
        }
    }

    private static void withdraw() {
        System.out.println("Enter the amount to withdraw:");
        double amount = scanner.nextDouble();

        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.printf("Withdrawal successful! New balance: $%.2f\n", balance);
        } else {
            System.out.println("Invalid withdrawal amount. Please try again.");
        }
    }
    private static void checkBalance() {
        System.out.printf("Current balance: $%.2f\n", balance);
    }
}
