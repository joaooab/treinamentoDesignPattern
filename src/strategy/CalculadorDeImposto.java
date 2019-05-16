package strategy;

class CalculadorDeImposto {

    Double realizaCalculo(Orcamento orcamento, String imposto) {
        if (imposto.equals("ICMS")) {
            final Double icms = orcamento.getValor() * 0.1;
            System.out.println(icms);
            return icms;
        } else if (imposto.equals("ISS")) {
            final Double iss = orcamento.getValor() * 0.06;
            System.out.println(iss);
            return iss;
        } else {
            return null;
        }
    }
}
