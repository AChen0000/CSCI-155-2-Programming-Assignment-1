
import java.util.Scanner;

public class InvestmentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter investment amount (or 'end' to quit): ");
            String amountInput = input.next();
            //addd loop
            if (amountInput.equalsIgnoreCase("end")) {
                break;
            }
            
            double money = Double.parseDouble(amountInput);
            //interest
            System.out.print("Enter annual interest rate: ");
            double rate = input.nextDouble();
            // time(calculated in years
            System.out.print("Enter the number of years: ");
            int years = input.nextInt();
            
            double monthlyRate = rate / 100 / 12;
            int months = years * 12;
            double futureMoney = money * Math.pow(1 + monthlyRate, months);
            
            System.out.printf("Accumulated value is: $%.2f\n", futureMoney);
        }
        //finish
        System.out.println("Bye!~");
        input.close();
    }
}
