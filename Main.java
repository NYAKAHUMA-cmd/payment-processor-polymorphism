public class Main {
    public static void main(String[] args) {
        // Identify the checkout demo before processing payments.
        System.out.println("==================================================");
        System.out.println("   E-COMMERCE CHECKOUT SYSTEM.");
        System.out.println("==================================================\n");

        // Runtime Polymorphism: Storing subclass instances in base class array
        PaymentProcessor[] checkoutQueue = new PaymentProcessor[] {
            new CreditCardProcessor(),
            new PayPalProcessor(),
            new MobileMoneyProcessor()
        };

        System.out.println("--- 1. Processing Standard Payments (Runtime Polymorphism) ---");
        double orderAmount = 150000.0;
        
        for (PaymentProcessor processor : checkoutQueue) {
            processor.processPayment(orderAmount);
            System.out.println("--------------------------------------------------");
        }

        // The two-argument overload is selected at compile time and dispatched dynamically.
        System.out.println("\n--- 2. Processing Promotional Payments (Overload + Runtime Dispatch) ---");
        String promoCode = "SAVE10";

        for (PaymentProcessor processor : checkoutQueue) {
            processor.processPayment(orderAmount, promoCode);
            System.out.println("--------------------------------------------------");
        }
    }
}