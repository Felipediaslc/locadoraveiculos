package model;

/**
 * Classe que representa a abstração de todos as motos do sistema.
 * @author Widson.
 * @version 1.0.
 */
public class Moto extends Veiculo{

	private Boolean cbs;
	private String cilindradas;

	public Boolean getCbs() {
		return cbs;
	}

	public void setCbs(Boolean cbs) {
		this.cbs = cbs;
	}

	public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
	}

}
