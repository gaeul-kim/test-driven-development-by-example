import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author sangsik.kim
 */
public class MoneyTest {

    @Test
    public void dollarMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void equality() {
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(5).equals(Money.dollar(6)));
        assertFalse(Money.dollar(5).equals(Money.franc(5)));
    }

    @Test
    public void currency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}
