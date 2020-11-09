import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

import java.time.Duration;
import java.util.Arrays;

/**
 * Aluno Tester.
 *
 * @author chicofariasneto
 * @version 1.0
 * @since <pre>Nov 8, 2020</pre>
 */
public class AlunoTest {

    @BeforeAll
    public static void before() throws Exception {
        System.out.println("Starting the class tests");
    }

    @AfterAll
    public static void after() throws Exception {
        System.out.println("Finishing the class tests");
    }

    /**
     * Method: adicionaNota(double nota)
     */
    @DisplayName("Method: adicionaNota(double nota)")
    @Test
    public void testAdicionaNota() throws Exception {
        Aluno aluno = new Aluno();

        double[] pontuacao = {4.5, 6.9, 8.0};
        Arrays.stream(pontuacao).forEach(aluno::adicionaNota);

        assertNotNull(aluno.getNotas());
    }

    /**
     * Method: calcularMedia()
     */
    @DisplayName("Method: calcularMedia()")
    @Test
    public void testCalcularMedia() throws Exception {
        Aluno aluno = new Aluno();

        double[] pontuacao = {4.5, 6.9, 8.0};
        Arrays.stream(pontuacao).forEach(aluno::adicionaNota);

        double media = Arrays.stream(pontuacao).sum() / pontuacao.length;

        assertEquals(media, aluno.calcularMedia());
    }

    /**
     * Method: aprovado() - true
     */
    @DisplayName("Method: aprovado() - true")
    @Test
    public void testAprovadoTrue() throws Exception {
        Aluno aluno = new Aluno();

        double[] pontuacao = {4.5, 6.9, 8.0};
        Arrays.stream(pontuacao).forEach(aluno::adicionaNota);

        aluno.setFrequencia(75);

        assertTrue(aluno.aprovado());
    }

    /**
     * Method: aprovado() - false
     */
    @DisplayName("Method: aprovado() - false")
    @Test
    public void testAprovadoFalse() throws Exception {
        Aluno aluno = new Aluno();

        double[] pontuacao = {4.5, 6.9, 8.0};
        Arrays.stream(pontuacao).forEach(aluno::adicionaNota);

        aluno.setFrequencia(74.9);

        assertFalse(aluno.aprovado());

        Aluno alunoTwo = new Aluno();

        double[] pontuacaoTwo = {4.5, 6.9, 2.0};
        Arrays.stream(pontuacaoTwo).forEach(alunoTwo::adicionaNota);

        alunoTwo.setFrequencia(75);

        assertFalse(alunoTwo.aprovado());
    }

    /**
     * Method: getNome()
     */
    @DisplayName("Method: getNome()")
    @Test
    public void testGetNome() throws Exception {
        Aluno aluno = new Aluno();

        aluno.setNome("João");

        assertNotNull(aluno.getNome());
        assertEquals(aluno.getNome(), "João");
    }

    /**
     * Method: setNome(String nome)
     */
    @DisplayName("Method: setNome(String nome)")
    @Test
    public void testSetNomeTrue() throws Exception {
        Aluno aluno = new Aluno();

        aluno.setNome("João");
        assertTimeout(Duration.ofSeconds(10), () -> {
            System.out.println(aluno.getNome());
        });

        assertEquals(aluno.getNome(), "João");
    }


    /**
     * Method: getFrequencia()
     */
    @DisplayName("Method: getFrequencia()")
    @Test
    public void testGetFrequencia() throws Exception {
        Aluno aluno = new Aluno();

        aluno.setFrequencia(75.6);

        assertNotNull(aluno.getFrequencia());
        assertEquals(aluno.getFrequencia(), 75.6);
    }

    /**
     * Method: setFrequencia(double frequencia)
     */
    @DisplayName("Method: setFrequencia(double frequencia)")
    @Test
    public void testSetFrequencia() throws Exception {
        Aluno aluno = new Aluno();

        aluno.setFrequencia(74.9);

        assertTimeout(Duration.ofSeconds(10), () -> {
            System.out.println(aluno.getFrequencia());
        });

        assertEquals(aluno.getFrequencia(), 74.9);
    }

}