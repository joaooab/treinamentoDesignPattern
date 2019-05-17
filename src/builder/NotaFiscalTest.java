package builder;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class NotaFiscalTest {

    @Test
    public void constroiNotaFiscal() {
        NotaFiscal notaFiscal = new NotaFiscalBuilder()
            .paraEmpresa("Razao Social")
                .comCnpj("999.999.999-99")
                .naData(Calendar.getInstance())
                .com(new ItemDaNota("nota1", 50d))
                .com(new ItemDaNota("nota2", 50d))
                .comObservacoes("observação da nota")
                .build();

        assertEquals(notaFiscal.getItens().size(), 2);
    }

}