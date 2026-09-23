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
}