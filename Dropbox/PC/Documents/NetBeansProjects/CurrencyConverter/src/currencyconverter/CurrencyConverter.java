package currencyconverter;

import java.util.Scanner;

/**
 *
 * @author NITRO
 */
public class CurrencyConverter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Currency Converter");
        Scanner sc = new Scanner(System.in);

        double aznToUsd = 0.59;   // 1 AZN = 0.59 USD
        double usdToAzn = 1.69;   // 1 USD = 1.69 AZN
        double tryToAzn = 0.12;   // 1 TRY = 0.12 AZN
        double rubToAzn = 0.0085; // 1 RUB = 0.0085 AZN

        while (true) {
            System.out.println("Please select the currency you want to convert:");
            System.out.println("1: AZN\n2: USD\n3: TRY\n4: RUB\n0: Exit");

            int operation = sc.nextInt();

            if (operation == 0) {
                System.out.println("Exiting the system");
                break;
            }

            System.out.println("Enter the amount you want to convert:");
            double amount = sc.nextDouble();
            double result = 0;

            if (operation == 1) {
                System.out.println("Which currency do you want to convert AZN to?");
                System.out.println("1: USD\n2: TRY\n3: RUB");
                int convertFromAzn = sc.nextInt();
                if (convertFromAzn == 1) {
                    result = amount * aznToUsd;
                    System.out.println(amount + " AZN = " + result + " USD");
                } else if (convertFromAzn == 2) {
                    result = amount / aznToUsd; 
                    System.out.println(amount + " AZN = " + result + " TRY");
                } else if (convertFromAzn == 3) {
                    result = amount / rubToAzn;  
                    System.out.println(amount + " AZN = " + result + " RUB");
                } else {
                    System.out.println("Invalid choice.");
                }
            } else if (operation == 2) {
                System.out.println("Which currency do you want to convert USD to?");
                System.out.println("1: AZN\n2: TRY\n3: RUB");
                int convertFromUsd = sc.nextInt();
                if (convertFromUsd == 1) {
                    result = amount * usdToAzn;
                    System.out.println(amount + " USD = " + result + " AZN");
                } else if (convertFromUsd == 2) {
                    result = amount * 9.0;  
                    System.out.println(amount + " USD = " + result + " TRY");
                } else if (convertFromUsd == 3) {
                    result = amount * 70.0;  
                    System.out.println(amount + " USD = " + result + " RUB");
                } else {
                    System.out.println("Invalid choice.");
                }
            } else if (operation == 3) {
                System.out.println("Which currency do you want to convert TRY to?");
                System.out.println("1: AZN\n2: USD\n3: RUB");
                int convertFromTry = sc.nextInt();
                if (convertFromTry == 1) {
                    result = amount * tryToAzn;
                    System.out.println(amount + " TRY = " + result + " AZN");
                } else if (convertFromTry == 2) {
                    result = amount / 9.0;  
                    System.out.println(amount + " TRY = " + result + " USD");
                } else if (convertFromTry == 3) {
                    result = amount * 7.8;  
                    System.out.println(amount + " TRY = " + result + " RUB");
                } else {
                    System.out.println("Invalid choice.");
                }
            } else if (operation == 4) {
                System.out.println("Which currency do you want to convert RUB to?");
                System.out.println("1: AZN\n2: USD\n3: TRY");
                int convertFromRub = sc.nextInt();
                if (convertFromRub == 1) {
                    result = amount * rubToAzn;
                    System.out.println(amount + " RUB = " + result + " AZN");
                } else if (convertFromRub == 2) {
                    result = amount / 70.0;  
                    System.out.println(amount + " RUB = " + result + " USD");
                } else if (convertFromRub == 3) {
                    result = amount / 7.8;  
                    System.out.println(amount + " RUB = " + result + " TRY");
                } else {
                    System.out.println("Invalid choice.");
                }
            } else {
                System.out.println("Invalid operation. Please try again.");
            }
        }
        sc.close();
    }
}
