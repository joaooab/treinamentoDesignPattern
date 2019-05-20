package template;

import chain.Orcamento;

abstract class TemplateDeImpostoCondicional implements Imposto {

    @Override
    public Double calcula(Orcamento orcamento) {
        if(isUtilizaMaiorTaxacao(orcamento)) {
            return maximaTaxacao(orcamento);
        } else {
            return minimaTaxacao(orcamento);
        }
    }

    abstract Boolean isUtilizaMaiorTaxacao(Orcamento orcamento);

    abstract Double maximaTaxacao(Orcamento orcamento);

    abstract Double minimaTaxacao(Orcamento orcamento);

}
