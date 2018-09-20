package model;

/**
 * Classe que representa a abstração de todos os veículos do sistema, tanto moto
 * quanto carro.
 * @author Widson.
 * @version 1.0.
 */
public class Veiculo {
	private int id;
	private String renavam;
	private String modelo;
	private String marca;
	private String potencia;
	private String anoFab;
	private String anoMod;
	private String cor;
	private Boolean combGasolina;
	private Boolean combEtanol;
	private Boolean abs;
	private String dataAquisicao;
	private String localizacao;
	private int porcentNivelComb;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRenavam() {
		return renavam;
	}

	public void setRenavam(String renavam) {
		this.renavam = renavam;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getAnoFab() {
		return anoFab;
	}

	public void setAnoFab(String anoFab) {
		this.anoFab = anoFab;
	}

	public String getAnoMod() {
		return anoMod;
	}

	public void setAnoMod(String anoMod) {
		this.anoMod = anoMod;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Boolean getCombGasolina() {
		return combGasolina;
	}

	public void setCombGasolina(Boolean combGasolina) {
		this.combGasolina = combGasolina;
	}

	public Boolean getCombEtanol() {
		return combEtanol;
	}

	public void setCombEtanol(Boolean combEtanol) {
		this.combEtanol = combEtanol;
	}

	public Boolean getAbs() {
		return abs;
	}

	public void setAbs(Boolean abs) {
		this.abs = abs;
	}

	public String getDataAquisicao() {
		return dataAquisicao;
	}

	public void setDataAquisicao(String dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public int getPorcentNivelComb() {
		return porcentNivelComb;
	}

	public void setPorcentNivelComb(int porcentNivelComb) {
		this.porcentNivelComb = porcentNivelComb;
	}

}
