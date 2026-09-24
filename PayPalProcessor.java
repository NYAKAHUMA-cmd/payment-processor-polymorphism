// Subclass - overrides processPayment
public class PayPalProcessor extends PaymentProcessor {
    
    @Override
    public void processPayment(double amount) {
        System.out.println("PayPal: Sending $" + amount + " via PayPal account.");
    }
    
    @Override
    public void processPayment(double amount, String couponCode) {
        double discount = amount * 0.15; // 15% off
        double finalAmount = amount - discount;
        System.out.println("PayPal: Sending $" + finalAmount 
            + " via PayPal (Coupon '" + couponCode + "' applied, saved $" + discount + ").");
    }
}