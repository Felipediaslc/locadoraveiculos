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
import model.Moto;
import start.Start;

/**
 * Classe responsável por fazer a conexão das motos criadas com o banco de dados.
 * @author Widson.
 * @version 1.0.
 */
public class MotoDAO {
	private static final Logger logger = LogManager.getLogger(Start.class);
	/**
	 * Método responsável por criar um registro de uma moto no banco de dados.
	 * @param m (Moto).
	 * @return true se a criação for bem sucedida ou false se for mal sucedida.
	 */
	public boolean create(Moto m) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("INSERT INTO moto (renavam, modelo, marca, potencia, anoFab,"
					+ "anoMod, cor, combGasolina, combEtanol, abs,"
					+ "dataAquisicao, localizacao, porcentNivelComb, cbs, cilindradas)"
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, m.getRenavam());
			stmt.setString(2, m.getModelo());
			stmt.setString(3, m.getMarca());
			stmt.setString(4, m.getPotencia());
			stmt.setString(5, m.getAnoFab());
			stmt.setString(6, m.getAnoMod());
			stmt.setString(7, m.getCor());
			stmt.setBoolean(8, m.getCombGasolina());
			stmt.setBoolean(9, m.getCombEtanol());
			stmt.setBoolean(10, m.getAbs());
			stmt.setString(11, m.getDataAquisicao());
			stmt.setString(12, m.getLocalizacao());
			stmt.setInt(13, m.getPorcentNivelComb());
			stmt.setBoolean(14, m.getCbs());
			stmt.setString(15, m.getCilindradas());
			stmt.executeUpdate();
			logger.info("Moto salva");
			return true;
		} catch (SQLException e) {
			logger.error("Erro ao salvar moto", e);
			return false;
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	/**
	 * Este método é responsável por ler todos os registros de motos presentes no banco de dados.
	 * @return List<Moto>
	 */
	public List<Moto> read() {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Moto> motos = new ArrayList();
		try {
			stmt = con.prepareStatement("SELECT * FROM moto");
			rs = stmt.executeQuery();
			while (rs.next()) {
				Moto moto = new Moto();
				moto.setId(rs.getInt(1));
				moto.setRenavam(rs.getString(2));
				moto.setModelo(rs.getString(3));
				moto.setMarca(rs.getString(4));
				moto.setPotencia(rs.getString(5));
				moto.setAnoFab(rs.getString(6));
				moto.setAnoMod(rs.getString(7));
				moto.setCor(rs.getString(8));
				moto.setCombGasolina(rs.getBoolean(9));
				moto.setCombEtanol(rs.getBoolean(10));
				moto.setAbs(rs.getBoolean(11));
				moto.setDataAquisicao(rs.getString(12));
				moto.setLocalizacao(rs.getString(13));
				moto.setPorcentNivelComb(rs.getInt(14));
				moto.setCbs(rs.getBoolean(15));
				moto.setCilindradas(rs.getString(16));
				motos.add(moto);
				logger.info("Moto lida");
			}
		} catch (SQLException e) {
			logger.info("Erro ao ler motos", e);
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return motos;
	}

	/**
	 * Este método é responsável por atualizar (editar) qulquer registro de moto presente no banco de dados.
	 * Deve ser passado como parâmetro o objeto devidamente corrigido, inclusive com a numeração do id do banco de dados.
	 * O método se encarrega defazer a substituição das informações.
	 * @param m (Moto).
	 * @return true se a atualização for bem sucedida ou false se for mal sucedida.
	 */
	public boolean update(Moto m) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("UPDATE moto SET renavam = ?, modelo = ?, marca = ?, potencia = ?, anoFab = ?,"
					+ "anoMod = ?, cor = ?, combGasolina = ?, combEtanol = ?, abs = ?,"
					+ "dataAquisicao = ?, localizacao = ?, porcentNivelComb = ?, cbs = ?,"
					+ "cilindradas = ? WHERE id = ?");
			stmt.setString(1, m.getRenavam());
			stmt.setString(2, m.getModelo());
			stmt.setString(3, m.getMarca());
			stmt.setString(4, m.getPotencia());
			stmt.setString(5, m.getAnoFab());
			stmt.setString(6, m.getAnoMod());
			stmt.setString(7, m.getCor());
			stmt.setBoolean(8, m.getCombGasolina());
			stmt.setBoolean(9, m.getCombEtanol());
			stmt.setBoolean(10, m.getAbs());
			stmt.setString(11, m.getDataAquisicao());
			stmt.setString(12, m.getLocalizacao());
			stmt.setInt(13, m.getPorcentNivelComb());
			stmt.setBoolean(14, m.getCbs());
			stmt.setString(15, m.getCilindradas());
			stmt.setInt(16, m.getId());
			stmt.executeUpdate();
			logger.info("Moto atualizada");
			return true;
		} catch (SQLException e) {
			logger.error("Erro ao atualizar");
			return false;
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	/**
	 * Este método é responsável por deletar um dado registro de uma moto no banco de dados.
	 * @param m (Moto).
	 * @return true se a exclusão for bem sucedida ou false se for mal sucedida.
	 */
	public boolean delete(Moto m) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("DELETE FROM moto WHERE id = ?");
			stmt.setInt(1, m.getId());
			stmt.executeUpdate();
			logger.info("Moto deletada");
			return true;
		} catch (SQLException e) {
			logger.error("Erro ao deletar", e);
			return false;
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
}