package builder;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

class NotaFiscalBuilder {
    private String razaoSocial;
    private String cnpj;
    private double valorBruto;
    private double impostos;
    private List<ItemDaNota> todosItens = new ArrayList<>();
    private String observacoes;
    private Calendar data;

    NotaFiscalBuilder() {
        this.data = Calendar.getInstance();
    }

    NotaFiscalBuilder paraEmpresa(String razaoSocial) {
        this.razaoSocial = razaoSocial;

        return this;
    }

    NotaFiscalBuilder comCnpj(String cnpj) {
        this.cnpj = cnpj;

        return this;
    }

    NotaFiscalBuilder com(ItemDaNota item) {
        todosItens.add(item);
        valorBruto += item.getValor();
        impostos += item.getValor() * 0.05;

        return this;
    }

    NotaFiscalBuilder comObservacoes(String observacoes) {
        this.observacoes = observacoes;

        return this;
    }

    NotaFiscalBuilder naData(Calendar novaData) {
        this.data = novaData;

        return this;
    }

    NotaFiscal build() {
        return new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos,
                              todosItens, observacoes
        );
    }
}