package strategy;

class ICMS implements Imposto {

    @Override
    public Double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.1;
    }

}
