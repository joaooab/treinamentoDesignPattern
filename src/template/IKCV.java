package template;

import chain.Item;
import chain.Orcamento;

class IKCV extends TemplateDeImpostoCondicional {
    @Override
    Boolean isUtilizaMaiorTaxacao(Orcamento orcamento) {
        return orcamento.getValor() > 500 && temItemMaiorQuem100Reais(orcamento);
    }

    @Override
    Double maximaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.10;
    }


    @Override
    Double minimaTaxacao(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

    private boolean temItemMaiorQuem100Reais(Orcamento orcamento) {
        for (Item item : orcamento.getItens()) {
            if(item.getValor() > 100) {
                return true;
            }
        }
        return false;
    }
}
