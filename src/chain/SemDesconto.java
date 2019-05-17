package chain;

public class SemDesconto implements Desconto {

    @Override
	public Double desconta(Orcamento orcamento) {
		return 0d;
	}

    @Override
	public void setProximo(Desconto desconto) { }
}