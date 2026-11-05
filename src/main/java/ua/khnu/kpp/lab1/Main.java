package ua.khnu.kpp.lab1;
import java.util.Locale;
import java.util.Scanner;
/** Console entry point using the exact RESULT_N/ERROR protocol. */
public final class Main {
    private Main() { }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.ROOT);
        if (!input.hasNextDouble()) { System.out.println("ERROR"); return; }
        double unitPrice = input.nextDouble();
        if (!input.hasNextInt()) { System.out.println("ERROR"); return; }
        int quantity = input.nextInt();
        if (!input.hasNextDouble()) { System.out.println("ERROR"); return; }
        double discountPercent = input.nextDouble();
        if (input.hasNext()) { System.out.println("ERROR"); return; }
        try {
            Order order = new Order(unitPrice, quantity, discountPercent);
            System.out.printf(Locale.ROOT, "RESULT_1=%.2f%n", order.subtotal());
            System.out.printf(Locale.ROOT, "RESULT_2=%.2f%n", order.discountAmount());
            System.out.printf(Locale.ROOT, "RESULT_3=%.2f%n", order.amountDue());
        } catch (IllegalArgumentException exception) {
            System.out.println("ERROR");
        }
    }
}
