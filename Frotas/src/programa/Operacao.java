package programa;

public class Operacao {
	protected int tempoCarga;
	protected int tempoDescarga;
	protected int distanciaIda;
	protected int distanciaVolta;
	protected int jornadaUtil;
	protected int turnos;
	protected int diasUteis;
	protected int paradaManutencao;
	protected Carga carga;
	
	public Operacao(int tempoCarga, int tempoDescarga, int distanciaIda, int distanciaVolta, int jornadaUtil,
			int turnos, int diasUteis, int paradaManutencao, Carga carga) {
		super();
		this.tempoCarga = tempoCarga;
		this.tempoDescarga = tempoDescarga;
		this.distanciaIda = distanciaIda;
		this.distanciaVolta = distanciaVolta;
		this.jornadaUtil = jornadaUtil;
		this.turnos = turnos;
		this.diasUteis = diasUteis;
		this.paradaManutencao = paradaManutencao;
		this.carga = carga;
	}
	
	//Métodos para cálculo
	
}
