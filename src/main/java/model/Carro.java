package model;

/**
 * Classe que representa a abstração de todos os carros do sistema.
 * @author Widson.
 * @version 1.0.
 */
public class Carro extends Veiculo {
	private Boolean combDiesel;
	private Boolean combGas;
	private Boolean arCondicionado;
	private Boolean vidroEletrico;
	private Boolean gps;
	private Boolean travas;
	private Boolean alarme;

	public Boolean getCombDiesel() {
		return combDiesel;
	}

	public void setCombDiesel(Boolean combDiesel) {
		this.combDiesel = combDiesel;
	}

	public Boolean getCombGas() {
		return combGas;
	}

	public void setCombGas(Boolean combGas) {
		this.combGas = combGas;
	}

	public Boolean getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(Boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public Boolean getVidroEletrico() {
		return vidroEletrico;
	}

	public void setVidroEletrico(Boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}

	public Boolean getGps() {
		return gps;
	}

	public void setGps(Boolean gps) {
		this.gps = gps;
	}

	public Boolean getTravas() {
		return travas;
	}

	public void setTravas(Boolean travas) {
		this.travas = travas;
	}

	public Boolean getAlarme() {
		return alarme;
	}

	public void setAlarme(Boolean alarme) {
		this.alarme = alarme;
	}

}
