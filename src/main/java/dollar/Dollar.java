package dollar;

public class Dollar extends Money {
    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Money(amount* multiplier, currency);
    }

    public String currency() {
        return "USD";
    }
}
