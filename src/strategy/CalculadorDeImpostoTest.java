package strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculadorDeImpostoTest {

    @Test
    public void calculaIcms() {
        ICMS icms = new ICMS();
        final Orcamento orcamento = new Orcamento(20d);
        Double resultado = new CalculadorDeImposto().realizaCalculo(orcamento, icms);
        Double resultadoEsperado = 2d;
        assertEquals(resultado, resultadoEsperado);
    }

    @Test
    public void calculaISS() {
        ISS iss = new ISS();
        final Orcamento orcamento = new Orcamento(50d);
        Double resultado = new CalculadorDeImposto().realizaCalculo(orcamento, iss);
        Double resultadoEsperado = 3d;
        assertEquals(resultado, resultadoEsperado);
    }

}
