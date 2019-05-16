package strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadorDeImpostoTest {

    @Test
    public void calculoImposto() {
        final Orcamento orcamento = new Orcamento(20d);
        Double resultado = new CalculadorDeImposto().realizaCalculo(orcamento, "ICMS");
        Double resultadoEsperado = 2d;
        assertEquals(resultado, resultadoEsperado);
    }

}
