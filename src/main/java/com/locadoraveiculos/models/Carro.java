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
	private boolean combGasolina;
	private boolean combEtanol;
	private boolean abs;
	private String dataAquisicao;
	private String localizacao;
	private String porcentNivelComb;
	private boolean combDiesel;
	private boolean combGnv;
	private boolean arCondicionado;
	private boolean vidroEletrico;
	private boolean gps;
	private boolean travas;
	private boolean alarme;

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

	public boolean isCombGasolina() {
		return combGasolina;
	}

	public void setCombGasolina(boolean combGasolina) {
		this.combGasolina = combGasolina;
	}

	public boolean isCombEtanol() {
		return combEtanol;
	}

	public void setCombEtanol(boolean combEtanol) {
		this.combEtanol = combEtanol;
	}

	public boolean isAbs() {
		return abs;
	}

	public void setAbs(boolean abs) {
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

	public boolean isCombDiesel() {
		return combDiesel;
	}

	public void setCombDiesel(boolean combDiesel) {
		this.combDiesel = combDiesel;
	}

	public boolean isCombGnv() {
		return combGnv;
	}

	public void setCombGnv(boolean combGnv) {
		this.combGnv = combGnv;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public boolean isVidroEletrico() {
		return vidroEletrico;
	}

	public void setVidroEletrico(boolean vidroEletrico) {
		this.vidroEletrico = vidroEletrico;
	}

	public boolean isGps() {
		return gps;
	}

	public void setGps(boolean gps) {
		this.gps = gps;
	}

	public boolean isTravas() {
		return travas;
	}

	public void setTravas(boolean travas) {
		this.travas = travas;
	}

	public boolean isAlarme() {
		return alarme;
	}

	public void setAlarme(boolean alarme) {
		this.alarme = alarme;
	}

}