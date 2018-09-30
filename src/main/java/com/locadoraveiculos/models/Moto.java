package com.locadoraveiculos.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe que representa a abstração de todas as motos do sistema.
 * 
 * @author Widson.
 * @version 1.0.
 */
@Entity
public class Moto {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private boolean cbs;
	private String cilindradas;
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
	private boolean gps;
	private boolean alarme;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public boolean isCbs() {
		return cbs;
	}

	public void setCbs(boolean cbs) {
		this.cbs = cbs;
	}

	public String getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(String cilindradas) {
		this.cilindradas = cilindradas;
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

	public boolean isGps() {
		return gps;
	}

	public void setGps(boolean gps) {
		this.gps = gps;
	}

	public boolean isAlarme() {
		return alarme;
	}

	public void setAlarme(boolean alarme) {
		this.alarme = alarme;
	}

}
