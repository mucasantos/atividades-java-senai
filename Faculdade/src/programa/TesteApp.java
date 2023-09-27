package programa;

public class TesteApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ProfessorDaFaculdade prof = new ProfessorDaFaculdade();
		
		
		prof.setNome("Joaquim Santos");
		prof.setSalario(17.000);
		
		GeradorDeRelatorio relato = new GeradorDeRelatorio();
		
		relato.adiciona(prof);
	
		
	}

}
