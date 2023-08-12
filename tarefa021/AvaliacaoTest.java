import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import alfa.br.com.gilmario.modelo.Avaliacao;
import alfa.br.com.gilmario.modelo.ValoresInvalidosException;

public class AvaliacaoTest {

    @Test
    public void testAvaliaValoresInvalidos() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(-2.00, 8.00, 128, 12);
        assertEquals("Valores Inválidos.", resultado);
    }

    @Test
    public void testAvaliaReprovadoPorFalta() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(7.00, 6.00, 32, 8);
        assertEquals("Reprovado por Falta.", resultado);
    }

    @Test
    public void testAvaliaReprovadoPorMedia() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(2.00, 1.00, 32, 8);
        assertEquals("Reprovado por Média.", resultado);
    }

    @Test
    public void testAvaliaRecuperacao() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(4.00, 5.00, 32, 8);
        assertEquals("Recuperação.", resultado);
    }

    @Test
    public void testAvaliaAprovado() throws ValoresInvalidosException {
        Avaliacao avaliacao = new Avaliacao();
        String resultado = avaliacao.avalia(6.00, 8.00, 32, 8);
        assertEquals("Aprovado.", resultado);
    }
}
