package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import connection.ConnectionFactory;
import model.Carro;
import start.Start;;

/**
 * Classe responsável por fazer a conexão dos carros criados com o banco de dados.
 * @author Widson.
 * @version 1.0.
 */
public class CarroDAO {
	private static final Logger logger = LogManager.getLogger(Start.class);
	/**
	 * Método responsável por criar um registro de um carro no banco de dados.
	 * @param c (Carro).
	 * @return true se a criação for bem sucedida ou false se for mal sucedida.
	 */
	public boolean create(Carro c) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("INSERT INTO carro (renavam, modelo, marca, potencia, anoFab,"
					+ "anoMod, cor, combGasolina, combEtanol, abs, dataAquisicao, localizacao,"
					+ "porcentNivelComb, combDiesel, combGas, arCondicionado, vidroEletrico, gps,"
					+ "travas, alarme) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, c.getRenavam());
			stmt.setString(2, c.getModelo());
			stmt.setString(3, c.getMarca());
			stmt.setString(4, c.getPotencia());
			stmt.setString(5, c.getAnoFab());
			stmt.setString(6, c.getAnoMod());
			stmt.setString(7, c.getCor());
			stmt.setBoolean(8, c.getCombGasolina());
			stmt.setBoolean(9, c.getCombEtanol());
			stmt.setBoolean(10, c.getAbs());
			stmt.setString(11, c.getDataAquisicao());
			stmt.setString(12, c.getLocalizacao());
			stmt.setInt(13, c.getPorcentNivelComb());
			stmt.setBoolean(14, c.getCombDiesel());
			stmt.setBoolean(15, c.getCombGas());
			stmt.setBoolean(16, c.getArCondicionado());
			stmt.setBoolean(17, c.getVidroEletrico());
			stmt.setBoolean(18, c.getGps());
			stmt.setBoolean(19, c.getTravas());
			stmt.setBoolean(20, c.getAlarme());
			stmt.executeUpdate();
			logger.info("Carro criado");
			return true;
		} catch (SQLException e) {
			logger.error("Erro ao criar", e);
			return false;
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	/**
	 * Este método é responsável por ler todos os registros de carros presentes no banco de dados.
	 * @return List<Carro>
	 */
	public List<Carro> read() {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Carro> carros = new ArrayList();
		try {
			stmt = con.prepareStatement("SELECT * FROM moto");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Carro carro = new Carro();
				carro.setId(rs.getInt(1));
				carro.setRenavam(rs.getString(2));
				carro.setModelo(rs.getString(3));
				carro.setMarca(rs.getString(4));
				carro.setPotencia(rs.getString(5));
				carro.setAnoFab(rs.getString(6));
				carro.setAnoMod(rs.getString(7));
				carro.setCor(rs.getString(8));
				carro.setCombGasolina(rs.getBoolean(9));
				carro.setCombEtanol(rs.getBoolean(10));
				carro.setAbs(rs.getBoolean(11));
				carro.setDataAquisicao(rs.getString(12));
				carro.setLocalizacao(rs.getString(13));
				carro.setPorcentNivelComb(rs.getInt(14));
				carro.setCombDiesel(rs.getBoolean(15));
				carro.setCombGas(rs.getBoolean(16));
				carro.setArCondicionado(rs.getBoolean(17));
				carro.setVidroEletrico(rs.getBoolean(18));
				carro.setGps(rs.getBoolean(19));
				carro.setTravas(rs.getBoolean(20));
				carro.setAlarme(rs.getBoolean(21));
				carros.add(carro);
				logger.info("Leitura realizada");
			}
		} catch (SQLException e) {
			logger.error("Erro ao ler os carros", e);
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return carros;
	}

	/**
	 * Este método é responsável por atualizar (editar) qulquer registro de carro presente no banco de dados.
	 * Deve ser passado como parâmetro o objeto devidamente corrigido, inclusive com a numeração do id do banco de dados.
	 * O método se encarrega defazer a substituição das informações.
	 * @param c (Carro).
	 * @return true se a atualização for bem sucedida ou false se for mal sucedida.
	 */
	public boolean update(Carro c) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("UPDATE moto SET renavam = ?, modelo = ?, marca = ?,"
					+ "potencia = ?, anoFab = ?, anoMod = ?, cor = ?, combGasolina = ?, combEtanol = ?,"
					+ "abs = ?, dataAquisicao = ?, localizacao = ?, porcentNivelComb = ?, combDiesel = ?,"
					+ "combGas = ?, arCondicionado = ?, vidroEletrico = ?, gps = ?, travas = ?, alarme = ? WHERE id = ?");
			stmt.setString(1, c.getRenavam());
			stmt.setString(2, c.getModelo());
			stmt.setString(3, c.getMarca());
			stmt.setString(4, c.getPotencia());
			stmt.setString(5, c.getAnoFab());
			stmt.setString(6, c.getAnoMod());
			stmt.setString(7, c.getCor());
			stmt.setBoolean(8, c.getCombGasolina());
			stmt.setBoolean(9, c.getCombEtanol());
			stmt.setBoolean(10, c.getAbs());
			stmt.setString(11, c.getDataAquisicao());
			stmt.setString(12, c.getLocalizacao());
			stmt.setInt(13, c.getPorcentNivelComb());
			stmt.setBoolean(14, c.getCombDiesel());
			stmt.setBoolean(15, c.getCombGas());
			stmt.setBoolean(16, c.getArCondicionado());
			stmt.setBoolean(17, c.getVidroEletrico());
			stmt.setBoolean(18, c.getGps());
			stmt.setBoolean(19, c.getTravas());
			stmt.setBoolean(20, c.getAlarme());
			stmt.setInt(21, c.getId());
			stmt.executeUpdate();
			logger.info("Carro atualizado");
			return true;
		} catch (SQLException e) {
			logger.info("Erro ao atualizar carro", e);
			return false;
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	/**
	 * Este método é responsável por deletar um dado registro de um carro no banco de dados.
	 * @param c (Carro).
	 * @return true se a exclusão for bem sucedida ou false se for mal sucedida.
	 */
	public boolean delete(Carro c) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("DELETE FROM carro WHERE id = ?");
			stmt.setInt(1, c.getId());
			stmt.executeUpdate();
			logger.info("Carro deletado");
			return true;
		} catch (SQLException e) {
			logger.error("Erro ao deletar");
			return false;
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
}