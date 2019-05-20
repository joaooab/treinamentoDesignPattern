package template;

import org.junit.Test;

import chain.Orcamento;

import static org.junit.Assert.assertEquals;

public class ICPPTest {

    @Test
    public void calcula() {
        Orcamento orcamento = new Orcamento(500d);
        Double valor = new ICPP().calcula(orcamento);
        Double valorEsperado = 25d;
        assertEquals(valor, valorEsperado);
    }
}
