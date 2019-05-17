package chain;

interface Desconto {
    Double desconta(Orcamento orcamento);
    void setProximo(Desconto desconto);
}
