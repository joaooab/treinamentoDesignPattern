package template;

import chain.Orcamento;

class ICPP extends TemplateDeImpostoCondicional {
    @Override
    Boolean isUtilizaMaiorTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500;
    }

    @Override
    Double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.07;
    }

    @Override
    Double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
}
