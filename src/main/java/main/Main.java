package main;

import dao.AgenciaDAO;
import model.Agencia;
import model.Endereco;

public class Main {

	public static void main(String[] args) {
		
		Endereco e = new Endereco();
		e.setRua("00000");
		e.setNumero("000");
		e.setComplemento("000");
		e.setBairro("0000");
		e.setCidade("000");
		e.setCidade("000");
		e.setUnidadeFederativa("PB");
		e.setCep("000");
		
		Agencia a = new Agencia();
		a.setId(6);
		a.setNomeFantasia("Agência de Widson");
		a.setCnpj("0000");
		a.setInscEstadual("000000");
		a.setTelefone("00000");
		a.setGerenteResponsavel("Joãozinho");
		a.setEndereco(e);
		
		AgenciaDAO dao = new AgenciaDAO();
		System.out.println(dao.read());
		
		
		

	}

}
