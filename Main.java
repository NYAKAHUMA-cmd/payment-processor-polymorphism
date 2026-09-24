public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("   E-COMMERCE CHECKOUT SYSTEM (POLYMORPHISM DEMO) ");
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

        System.out.println("\n--- 2. Processing Promotional Payments (Compile-Time Polymorphism) ---");
        String promoCode = "SAVE10";

        for (PaymentProcessor processor : checkoutQueue) {
            processor.processPayment(orderAmount, promoCode);
            System.out.println("--------------------------------------------------");
        }
    }
}