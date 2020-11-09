import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

/**
 * Credito Tester.
 *
 * @author chicofariasneto
 * @version 1.0
 * @since <pre>Nov 8, 2020</pre>
 */
public class CreditoTest {

    @BeforeAll
    public static void before() throws Exception {
    }

    @AfterAll
    public static void after() throws Exception {
    }

    /**
     * Method: concedeCredito(int parcelas, boolean confiavel, double salario) - true
     */
    @Test
    public void testConcedeCreditoTrue() throws Exception {
        Credito credito = new Credito();
        boolean result = credito.concedeCredito(10, true, 5000);
        assertTrue(result);
    }

    /**
     * Method: concedeCredito(int parcelas, boolean confiavel, double salario) - false
     */
    @Test
    @DisplayName("Method: concedeCredito(int parcelas, boolean confiavel, double salario) - false")
    public void testConcedeCreditoFalse() throws Exception {
        Credito credito = new Credito();

        // testing each possibility
        boolean result = credito.concedeCredito(13, true, 5000);
        assertFalse(result);

        boolean resultTwo = credito.concedeCredito(10, false, 5000);
        assertFalse(resultTwo);

        boolean resultThree = credito.concedeCredito(10, true, 4999);
        assertFalse(resultThree);
    }

    /**
     * Method: definirCredito(int parcelas, boolean confiavel, double salario) - true
     */
    @Test
    @DisplayName("Method: definirCredito(int parcelas, boolean confiavel, double salario) - true")
    public void testDefinirCreditoTrue() throws Exception {
        Credito credito = new Credito();

        double value = credito.definirCredito(12, true, 5000);
        assertEquals(value, 20000);
    }

    /**
     * Method: definirCredito(int parcelas, boolean confiavel, double salario) - false
     */
    @Test
    @DisplayName("Method: definirCredito(int parcelas, boolean confiavel, double salario) - false")
    public void testDefinirCreditoFalse() throws Exception {
        Credito credito = new Credito();

        // testing each possibility
        double value = credito.definirCredito(13, true, 5000);
        assertEquals(value, 0);

        double valueTwo = credito.definirCredito(10, false, 5000);
        assertNotEquals(valueTwo, 20000);

        double valueThree = credito.definirCredito(10, true, 4999);
        assertEquals(valueThree, 0);
    }
}