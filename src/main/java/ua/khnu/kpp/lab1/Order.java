package ua.khnu.kpp.lab1;
/** An immutable purchase order with a percentage discount. */
public final class Order {
    private final double unitPrice;
    private final int quantity;
    private final double discountPercent;

    public Order(double unitPrice, int quantity, double discountPercent) {
        if (!Double.isFinite(unitPrice) || unitPrice <= 0.0) {
            throw new IllegalArgumentException("unitPrice must be finite and positive");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("quantity must be positive");
        }
        if (!Double.isFinite(discountPercent) || discountPercent < 0.0 || discountPercent > 100.0) {
            throw new IllegalArgumentException("discountPercent must be in [0, 100]");
        }
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.discountPercent = discountPercent;
    }

    public double subtotal() { return unitPrice * quantity; }
    public double discountAmount() { return subtotal() * discountPercent / 100.0; }
    public double amountDue() { return subtotal() - discountAmount(); }
}
