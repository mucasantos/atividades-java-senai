package programa;

public class ControleDeBonificacoes {
	private double totalDeBonificacoes = 0;

	public void registra(EmpregadoDaFaculdade f) {
		System.out.println("Adicionando	bonificação	do	"
				+ "funcionario:	" + f);
		this.totalDeBonificacoes += f.getBonificacao();
	}

	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;
	}

}
