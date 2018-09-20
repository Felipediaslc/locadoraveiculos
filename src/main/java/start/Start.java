package start;

import dao.CarroDAO;
import dao.MotoDAO;
import model.Carro;
import model.Moto;

public class Start {

	public static void main(String[] args) {
		//final Logger logger = LogManager.getLogger(Start.class);
		//logger.info("main");
		Moto moto = new Moto();
		moto.setRenavam("00000000");
		moto.setModelo("00000");
		moto.setMarca("0000000");
		moto.setPotencia("22");
		moto.setAnoFab("0000");
		moto.setAnoMod("0000");
		moto.setCor("000000");
		moto.setCombGasolina(true);
		moto.setCombEtanol(true);
		moto.setAbs(true);
		moto.setDataAquisicao("00000000");
		moto.setLocalizacao("0000000");
		moto.setPorcentNivelComb(100);
		moto.setCbs(false);
		moto.setCilindradas("00000");
		
		
		
		
		Carro carro = new Carro();		
		carro.setRenavam("00000000");
		carro.setModelo("00000");
		carro.setMarca("0000000");
		carro.setPotencia("102");
		carro.setAnoFab("0000");
		carro.setAnoMod("0000");
		carro.setCor("000000");
		carro.setCombGasolina(true);
		carro.setCombEtanol(true);
		carro.setAbs(true);
		carro.setDataAquisicao("00000000");
		carro.setLocalizacao("0000000");
		carro.setPorcentNivelComb(100);
		carro.setCombDiesel(true);
		carro.setCombGas(false);
		carro.setArCondicionado(true);
		carro.setVidroEletrico(true);
		carro.setGps(true);
		carro.setTravas(true);
		carro.setAlarme(true);
		
		//Inserindo moto no BD
		MotoDAO motodao = new MotoDAO();
		motodao.create(moto);
		
		//Inserindo carro no BD
		CarroDAO carrodao = new CarroDAO();
		carrodao.create(carro);
		
		//Removendo moto
		motodao.delete(moto);
		
		//Removendo carro
		carrodao.delete(carro);
		
		//Editando moto
		moto.setAbs(false); //Antes era true
		motodao.update(moto);	

	}

}
