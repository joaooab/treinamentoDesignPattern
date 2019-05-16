package builder;

public class ItemDaNota {
	private String nome;
	private Double valor;

	ItemDaNota(String nome, Double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	Double getValor() {
		return valor;
	}

}
