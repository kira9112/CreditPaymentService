public class CreditPaymentService {
    public int calculate(double creditAmount, double annualInterestRate, int creditTime) {
        double monthlyInterestRate = annualInterestRate / 100 / 12;
        double monthlyPayment = creditAmount * (monthlyInterestRate + monthlyInterestRate / (Math.pow(1 + monthlyInterestRate, creditTime) - 1));
        return (int) monthlyPayment;
    }
}