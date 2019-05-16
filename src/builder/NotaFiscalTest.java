package builder;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class NotaFiscalTest {

    @Test
    public void constroiNotaFiscal() {
        ArrayList<ItemDaNota> itemDaNotas = new ArrayList<>();
        itemDaNotas.add(new ItemDaNota("nota1", 50d));
        itemDaNotas.add(new ItemDaNota("nota2", 50d));
        double valorTotal = 0d;
        for (ItemDaNota item : itemDaNotas) {
            valorTotal += item.getValor();
        }
        double imposto = valorTotal * 0.05d;

        NotaFiscal notaFiscal = new NotaFiscal(
                "razaoSocial",
                "999.999.999-99",
                Calendar.getInstance(),
                valorTotal,
                imposto,
                itemDaNotas ,
                "observação da nota"
        );

        assertEquals(notaFiscal.getItens().size(), 2);
    }

}