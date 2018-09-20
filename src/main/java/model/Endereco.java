package model;

/**
 * Classe que representa os endereços das agencias do sistema.
 * @author Widson.
 * @version 1.0.
 */
public class Endereco {
	private int id;
	private String rua;
	private String numero;
	private String complemento;
	private String bairro;
	private String cidade;
	private String unidadeFederativa;
	private String cep;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUnidadeFederativa() {
		return unidadeFederativa;
	}

	public void setUnidadeFederativa(String unidadeFederativa) {
		this.unidadeFederativa = unidadeFederativa;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

}
