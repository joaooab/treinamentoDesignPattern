package chain;

class CalculadorDeDescontos {
    Double calcular(Orcamento orcamento) {
        if (orcamento.getItens().size() > 5) {
            return orcamento.getValor() * 0.1;
        } else if (orcamento.getValor() > 500) {
            return orcamento.getValor() * 0.07;
        }

        return 0d;
    }
}
