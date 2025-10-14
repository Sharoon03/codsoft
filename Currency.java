import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double amount, result;

        // Conversion rates (you can update with live rates)
        double usdToInr = 83.12;
        double eurToInr = 90.15;
        double gbpToInr = 104.50;
        double jpyToInr = 0.56;

        do {
            System.out.println("\n===== Currency Converter =====");
            System.out.println("1. USD to INR");
            System.out.println("2. EUR to INR");
            System.out.println("3. GBP to INR");
            System.out.println("4. JPY to INR");
            System.out.println("5. INR to USD");
            System.out.println("6. INR to EUR");
            System.out.println("7. INR to GBP");
            System.out.println("8. INR to JPY");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount in USD: ");
                    amount = sc.nextDouble();
                    result = amount * usdToInr;
                    System.out.println("Converted Amount: ₹" + result);
                    break;

                case 2:
                    System.out.print("Enter amount in EUR: ");
                    amount = sc.nextDouble();
                    result = amount * eurToInr;
                    System.out.println("Converted Amount: ₹" + result);
                    break;

                case 3:
                    System.out.print("Enter amount in GBP: ");
                    amount = sc.nextDouble();
                    result = amount * gbpToInr;
                    System.out.println("Converted Amount: ₹" + result);
                    break;

                case 4:
                    System.out.print("Enter amount in JPY: ");
                    amount = sc.nextDouble();
                    result = amount * jpyToInr;
                    System.out.println("Converted Amount: ₹" + result);
                    break;

                case 5:
                    System.out.print("Enter amount in INR: ");
                    amount = sc.nextDouble();
                    result = amount / usdToInr;
                    System.out.println("Converted Amount: $" + result);
                    break;

                case 6:
                    System.out.print("Enter amount in INR: ");
                    amount = sc.nextDouble();
                    result = amount / eurToInr;
                    System.out.println("Converted Amount: €" + result);
                    break;

                case 7:
                    System.out.print("Enter amount in INR: ");
                    amount = sc.nextDouble();
                    result = amount / gbpToInr;
                    System.out.println("Converted Amount: £" + result);
                    break;

                case 8:
                    System.out.print("Enter amount in INR: ");
                    amount = sc.nextDouble();
                    result = amount / jpyToInr;
                    System.out.println("Converted Amount: ¥" + result);
                    break;

                case 9:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 9);

        sc.close();
    }
}