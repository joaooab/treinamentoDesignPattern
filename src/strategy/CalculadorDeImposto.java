package strategy;

class CalculadorDeImposto {

    Double realizaCalculo(Orcamento orcamento, Imposto imposto) {
        return imposto.calcula(orcamento);
    }

}
