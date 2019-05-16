package strategy;

class ISS implements Imposto {

    @Override
    public Double calcula(Orcamento orcamento) {
        return orcamento.getValor() * 0.06;
    }

}
