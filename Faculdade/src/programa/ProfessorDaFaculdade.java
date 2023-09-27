package programa;

//extends - herança

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {
	private int horasDeAula;

	public double getGastos() {
		return this.getSalario() + this.horasDeAula * 10;
	}

	public String getInfo() {
		String infoBasic = super.getInfo();
		String informacao = infoBasic + " horas de aula: " + this.horasDeAula;

		return informacao;
	}
}
