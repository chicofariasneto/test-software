import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.time.Duration;

/**
 * FuncoesMatematicas Tester.
 *
 * @author chicofariasneto
 * @version 1.0
 * @since <pre>Nov 8, 2020</pre>
 */
public class FuncoesMatematicasTest {

    @BeforeAll
    public static void before() throws Exception {
        System.out.println("Starting the class tests");
    }

    @AfterAll
    public static void after() throws Exception {
        System.out.println("Finishing the class tests");
    }

    /**
     * Method: calcularPotencia(int base, int expoente)
     */
    @DisplayName("Method: calcularPotencia(int base, int expoente)")
    @Test
    public void testCalcularPotencia() throws Exception {

        long potencia = FuncoesMatematicas.calcularPotencia(2, 4);
        assertEquals(potencia, Math.pow(2, 4));

        long potenciaTwo = FuncoesMatematicas.calcularPotencia(2, -4);
        assertEquals(potenciaTwo, (long) Math.pow(2, -4));

        long potenciaThree = FuncoesMatematicas.calcularPotencia(2, 0);
        assertEquals(potenciaThree, (long) Math.pow(2, 0));
    }

    /**
     * Method: calcularFatorial(int numero)
     */
    @DisplayName("Method: calcularFatorial(int numero)")
    @Test
    public void testCalcularFatorial() throws Exception {

        long fatorial = FuncoesMatematicas.calcularFatorial(2);
        assertTimeout(Duration.ofSeconds(10), () -> {
            System.out.println(fatorial);
        });

        long fatorialTwo = FuncoesMatematicas.calcularFatorial(3);
        assertTimeout(Duration.ofSeconds(10), () -> {
            System.out.println(fatorialTwo);
        });

        long fatorialThree = FuncoesMatematicas.calcularFatorial(4);
        assertTimeout(Duration.ofSeconds(10), () -> {
            System.out.println(fatorialThree);
        });
    }

}