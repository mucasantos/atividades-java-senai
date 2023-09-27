package atividade;

public class IngressoVIP extends Ingresso {

	private int valorAdicional = 40;

	public IngressoVIP(String nome, String CPF, int preco, int valorAdicional) {
		super(nome, CPF, preco);
		this.valorAdicional = valorAdicional;
	}

	public IngressoVIP(String nome, String CPF) {
		super(nome, CPF);
		valorAdicional = 40;
	}

	public void setValorAdicional(int valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	@Override
	public void setPreco(int preco) {
		super.preco = preco;
	}

	public int precoVip() {
		int precoVip = preco + valorAdicional;
		return precoVip;
	}

	@Override
	public String toString() {
		return super.toString() + "\nValor VIP acrescentado R$: " + valorAdicional + "\nValor VIP total R$: "
				+ precoVip();
	}

}
