/**
 * Classe que representa a abstração de todas as agencias do sistema.
 * @author Widson.
 * @version 1.0.**/

package model;


public class Agencia {
	private int id;
	private String nomeFantasia;
	private String cnpj;
	private String inscEstadual;
	private Endereco endereco;
	private String telefone;
	private String gerenteResponsavel;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getGerenteResponsavel() {
		return gerenteResponsavel;
	}

	public void setGerenteResponsavel(String gerenteResponsavel) {
		this.gerenteResponsavel = gerenteResponsavel;
	}

}
