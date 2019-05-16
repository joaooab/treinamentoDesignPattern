package strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadorDeImpostoTest {

    @Test
    public void calculaIcms() {
        final Orcamento orcamento = new Orcamento(20d);
        Double resultado = new CalculadorDeImposto().realizaCalculo(orcamento, "ICMS");
        Double resultadoEsperado = 2d;
        assertEquals(resultado, resultadoEsperado);
    }

    @Test
    public void calculaIss() {
        final Orcamento orcamento = new Orcamento(50d);
        Double resultado = new CalculadorDeImposto().realizaCalculo(orcamento, "ISS");
        Double resultadoEsperado = 3d;
        assertEquals(resultado, resultadoEsperado);
    }

}
