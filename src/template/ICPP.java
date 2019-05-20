package template;

import chain.Orcamento;

class ICPP implements Imposto {
    @Override
    public Double calcula(Orcamento orcamento) {
        if(orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        } else {
            return orcamento.getValor() * 0.05;
        }
    }
}
