package template;

import chain.Item;
import chain.Orcamento;

class IKCV implements Imposto {
    @Override
    public Double calcula(Orcamento orcamento) {
        if(orcamento.getValor() > 500 && temItemMaiorQuem100Reais(orcamento)) {
            return orcamento.getValor() * 0.10;
        } else {
            return orcamento.getValor() * 0.06;
        }
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
