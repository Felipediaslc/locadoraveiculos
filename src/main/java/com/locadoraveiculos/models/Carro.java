package com.locadoraveiculos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa a abstra��o de todos os carros do sistema.
 * 
 * @author Widson.
 * @version 1.0.
 */
@Entity
public class Carro {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

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
	private String porcentNivelComb;
	private Boolean combDiesel;
	private Boolean combGnv;
	private Boolean arCondicionado;
	private Boolean vidroEletrico;
	private Boolean gps;
	private Boolean travas;
	private Boolean alarme;

	public long getId() {
		return id;
	}

	public void setId(long id) {
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

	public String getPorcentNivelComb() {
		return porcentNivelComb;
	}

	public void setPorcentNivelComb(String porcentNivelComb) {
		this.porcentNivelComb = porcentNivelComb;
	}

	public Boolean getCombDiesel() {
		return combDiesel;
	}

	public void setCombDiesel(Boolean combDiesel) {
		this.combDiesel = combDiesel;
	}

	public Boolean getCombGnv() {
		return combGnv;
	}

	public void setCombGnv(Boolean combGnv) {
		this.combGnv = combGnv;
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