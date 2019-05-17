package chain;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadorDeDescontosTest {

    @Test
    public void calculaDesconto() {
        Orcamento orcamento = new Orcamento(50);
        CalculadorDeDescontos calculadorDeDescontos = new CalculadorDeDescontos();
        Double resultado = calculadorDeDescontos.calcular(orcamento);
        Double resultadoEsperado = 0d;
        assertEquals(resultado, resultadoEsperado);
    }

}