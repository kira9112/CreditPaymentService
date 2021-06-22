public class CreditPaymentService {
    public int calculate(int creditAmount, double annualInterestRate, int creditTime) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int monthlyPayment = (int) (creditAmount * (monthlyInterestRate + monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, creditTime) - 1)));
        return monthlyPayment;
    }
}