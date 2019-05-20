package template;

import org.junit.Test;

import chain.Orcamento;

import static org.junit.Assert.assertEquals;

public class IKCVTest {

    @Test
    public void calcula() {
        Orcamento orcamento = new Orcamento(500d);
        Double valor = new IKCV().calcula(orcamento);
        Double valorEsperado = 30d;
        assertEquals(valor, valorEsperado);
    }

}