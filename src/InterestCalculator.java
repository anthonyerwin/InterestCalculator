import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final double INTEREST_RATE = 0.05; // 5% interest rate per annum 
        final double TAX_RATE = 0.2;       // 20% withholding tax rate
        final double DAYS_IN_YEAR = 365;   // used to calculate daily and monthly interest

        double balance = 0;
        double interest = 0;

        do {
            try {
                System.out.print("Enter Balance: ");
                balance = Double.valueOf(scanner.nextLine());

            } catch (Exception e) {
                balance = 0;
            }

        } while (balance <= 0);

        System.out.println("Interest Rate: " + (INTEREST_RATE * 100) + "%");
        System.out.println("Tax Rate: " + (TAX_RATE * 100) + "%");
        System.out.println("Days in a Year used: " + DAYS_IN_YEAR);
        System.out.println();

        // daily
        interest = ((balance * INTEREST_RATE) / DAYS_IN_YEAR);
        System.out.printf("%s%,.02f%s", "PHP", interest, " Daily interest.");
        System.out.println();

        // daily after Tax
        interest = interest - (interest * TAX_RATE);
        System.out.printf("%s%,.02f%s", "PHP", interest, " Daily interest after Tax.");
        System.out.println();

        // Balance next day
        System.out.printf("%s%,.02f%s", "PHP", (balance + interest), " Balance next day.");
        System.out.println();
        System.out.println();

        // monthly
        interest = ((balance * INTEREST_RATE) / (DAYS_IN_YEAR / 30));
        System.out.printf("%s%,.02f%s", "PHP", interest, " Monthly interest.");
        System.out.println();

        // monthly after Tax
        interest = interest - (interest * TAX_RATE);
        System.out.printf("%s%,.02f%s", "PHP", interest, " Monthly interest after Tax.");
        System.out.println();

        // Balance next month
        System.out.printf("%s%,.02f%s", "PHP", (balance + interest), " Balance next month.");        
        System.out.println();
        System.out.println();

        // yearly
        interest = balance * INTEREST_RATE;
        System.out.printf("%s%,.02f%s", "PHP", interest, " Yearly interest.");
        System.out.println();

        // yearly after Tax
        interest = interest - (interest * TAX_RATE);
        System.out.printf("%s%,.02f%s", "PHP", interest, " Yearly interest after Tax.");
        System.out.println();

        // Balance next year
        System.out.printf("%s%,.02f%s", "PHP", (balance + interest), " Balance next year.");
        System.out.println();
        System.out.println();

        scanner.close();
    }
}
