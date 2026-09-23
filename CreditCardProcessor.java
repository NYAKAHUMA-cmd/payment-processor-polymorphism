import java.util.Scanner;

public class CreditCardProcessor extends PaymentProcessor {
    private String cardNumber;

    // Constructor to initialize credit card details
    public CreditCardProcessor() {
        this.cardNumber = "";
    }

    // Helper method to validate a 16-digit credit card number
    private boolean isValidCardNumber(String card) {
        return card != null && card.matches("\\d{16}");
    }

    // Helper method to mask the card number (e.g., "**** **** **** 1234")
    private String maskCardNumber(String card) {
        return "**** **** **** " + card.substring(12);
    }

    @Override
    public void processPayment(double amount) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter 16-digit Credit Card Number: ");
        String inputCard = input.nextLine().replaceAll("\\s+", "");

        // Validate card number input
        while (!isValidCardNumber(inputCard)) {
            System.out.print("Invalid Card Number! Must be exactly 16 digits. Re-enter: ");
            inputCard = input.nextLine().replaceAll("\\s+", "");
        }

        this.cardNumber = inputCard;
        String maskedCard = maskCardNumber(this.cardNumber);

        System.out.println("[Credit Card] Payment of $" + String.format("%.2f", amount) 
                           + " processed successfully using Card: " + maskedCard);
    }
}