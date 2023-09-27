package programa;

public abstract class EmpregadoDaFaculdade {
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	private double salario;

	public double getGastos() {
		return this.salario;
	}

	public String getInfo() {
		return "nome:" + this.nome + " com salário " + this.salario;
	}

	public double getSalario() {
		return salario;
	}

	public double getBonificacao() {
		return this.salario * 1.2;
	}

}
