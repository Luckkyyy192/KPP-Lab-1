package ua.khnu.kpp.lab1;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class OrderTest {
    @Test void controlCase() {
        Order order = new Order(249.9, 3, 10);
        assertEquals(749.7, order.subtotal(), 1e-9);
        assertEquals(74.97, order.discountAmount(), 1e-9);
        assertEquals(674.73, order.amountDue(), 1e-9);
    }
    @Test void alternativeCase() {
        Order order = new Order(100, 2, 25);
        assertEquals(200, order.subtotal(), 1e-9);
        assertEquals(50, order.discountAmount(), 1e-9);
        assertEquals(150, order.amountDue(), 1e-9);
    }
    @Test void invalidInputs() {
        assertThrows(IllegalArgumentException.class, () -> new Order(249.9, 0, 10));
        assertThrows(IllegalArgumentException.class, () -> new Order(Double.NaN, 1, 10));
        assertThrows(IllegalArgumentException.class, () -> new Order(1, 1, Double.POSITIVE_INFINITY));
        assertThrows(IllegalArgumentException.class, () -> new Order(1, 1, -0.1));
        assertThrows(IllegalArgumentException.class, () -> new Order(1, 1, 100.1));
        assertEquals(0, new Order(2,1,100).amountDue(),1e-9);
    }
}
