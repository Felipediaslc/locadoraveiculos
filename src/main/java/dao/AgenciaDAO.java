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
import model.Agencia;
import model.Endereco;
import start.Start;

/**
 * Classe responsável por fazer a conexão das agencias criadas com o banco de dados.
 * @author Widson.
 * @version 1.0.
 */
public class AgenciaDAO {
	private static final Logger logger = LogManager.getLogger(Start.class);
	
	/**
	 * Método responsável por criar um registro de uma agencia no banco de dados.
	 * @param a (Agencia).
	 * @return true se a criação for bem sucedida ou false se for mal sucedida.
	 */
	public boolean create(Agencia a) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(
					"INSERT INTO agencia (nomeFantasia, cnpj, inscEstadual, telefone, gerenteResponsavel) VALUES (?, ?, ?, ?, ?)");
			stmt.setString(1, a.getNomeFantasia());
			stmt.setString(2, a.getCnpj());
			stmt.setString(3, a.getInscEstadual());
			stmt.setString(4, a.getTelefone());
			stmt.setString(5, a.getGerenteResponsavel());
			stmt.executeUpdate();
			ConnectionFactory.closeConnection(con, stmt);
			create(a.getEndereco());
			logger.info("Agencia salva com sucesso create");
			return true;
		} catch (SQLException ex) {
			logger.error("Erro ao salvar", ex);
			return false;
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	/**
	 * Método responsável por riar um registro de um endereço no banco de dados.
	 * Este método é utilizado apenas internamente na classe AgenciaDAO e é chamado pelo método create(Agencia a)
	 * para fazer o registro do endereço desta agencia.
	 * @param e (Endereco).
	 * @return true se a criação for bem sucedida ou false se for mal sucedida.
	 */
	public boolean create(Endereco e) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement(
					"INSERT INTO endereco (rua, numero, complemento, bairro, cidade, unidadeFederativa, cep) VALUES (?, ?, ?, ?, ?, ?, ?)");
			stmt.setString(1, e.getRua());
			stmt.setString(2, e.getNumero());
			stmt.setString(3, e.getComplemento());
			stmt.setString(4, e.getBairro());
			stmt.setString(5, e.getCidade());
			stmt.setString(6, e.getUnidadeFederativa());
			stmt.setString(7, e.getCep());
			stmt.executeUpdate();
			logger.info("Endereço salvo com sucesso");
			return true;
		} catch (SQLException ex) {
			logger.error("Erro ao salvar", ex);
			return false;
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	/**
	 * Este método é responsável por ler todos os registros de agencias presentes no banco de dados.
	 * @return List<Agencia>
	 */
	public List<Agencia> read() {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Agencia> agencias = new ArrayList();
		try {
			con = ConnectionFactory.getConnection();
			stmt = con.prepareStatement("SELECT * FROM agencia a, endereco e WHERE a.idAgencia = e.idEndereco");
			rs = stmt.executeQuery();
			Endereco endereco = new Endereco();
			Agencia agencia = new Agencia();
			while (rs.next()) {
				agencia.setId(rs.getInt(1));
				agencia.setNomeFantasia(rs.getString(2));
				agencia.setCnpj(rs.getString(3));
				agencia.setInscEstadual(rs.getString(4));
				agencia.setTelefone(rs.getString(5));
				agencia.setGerenteResponsavel(rs.getString(6));
				endereco.setId(rs.getInt(7));
				endereco.setRua(rs.getString(8));
				endereco.setNumero(rs.getString(9));
				endereco.setComplemento(rs.getString(10));
				endereco.setBairro(rs.getString(11));
				endereco.setCidade(rs.getString(12));
				endereco.setUnidadeFederativa(rs.getString(13));
				endereco.setCep(rs.getString(14));
				agencia.setEndereco(endereco);
				agencias.add(agencia);
			}
			logger.info("Leitura realizada");
		} catch (SQLException e) {
			logger.error("Erro ao ler", e);
		} finally {
			ConnectionFactory.closeConnection(con, stmt, rs);
		}
		return agencias;
	}

	/**
	 * Este método é responsável por atualizar (editar) qulquer registro de agencia presente no banco de dados.
	 * Deve ser passado como parâmetro o objeto devidamente corrigido, inclusive com a numeração do id do banco de dados.
	 * O método se encarrega defazer a substituição das informações.
	 * @param a (Agencia).
	 * @return true se a atualização for bem sucedida ou false se for mal sucedida.
	 */
	public boolean update(Agencia a) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			a.getEndereco().setId(a.getId());
			stmt = con.prepareStatement("UPDATE agencia SET nomeFantasia = ?, cnpj = ?, inscEstadual = ?,"
					+ "telefone = ?, gerenteResponsavel = ? WHERE idAgencia = ?");
			stmt.setString(1, a.getNomeFantasia());
			stmt.setString(2, a.getCnpj());
			stmt.setString(3, a.getInscEstadual());
			stmt.setString(4, a.getTelefone());
			stmt.setString(5, a.getGerenteResponsavel());
			stmt.setInt(6, a.getId());
			stmt.executeUpdate();
			update(a.getEndereco());
			logger.info("Agencia atualizada");
			return true;
		} catch (SQLException e) {
			logger.error("Erro ao atualizar", e);
			return false;
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	/**
	 * Este método é responsável por atualizar (editar) qulquer registro do endereço da agencia presente no banco de dados.
	 * Este método é utilizado apenas internamente na classe AgenciaDAO e é chamado pelo método read(Agencia a)
	 * para fazer a leitura também do endereço desta agencia.
	 * @param e (Endereço)
	 * @return true se a atualização for bem sucedida ou false se for mal sucedida.
	 */
	public boolean update(Endereco e) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("UPDATE endereco SET rua = ?, numero = ?, complemento = ?, bairro = ?,"
					+ "cidade = ?, unidadeFederativa = ?, cep = ? WHERE idEndereco = ?");
			stmt.setString(1, e.getRua());
			stmt.setString(2, e.getNumero());
			stmt.setString(3, e.getComplemento());
			stmt.setString(4, e.getBairro());
			stmt.setString(5, e.getCidade());
			stmt.setString(6, e.getUnidadeFederativa());
			stmt.setString(7, e.getCep());
			stmt.setInt(8, e.getId());
			stmt.executeUpdate();
			logger.info("Endereço atualizado");
			return true;
		} catch (SQLException ex) {
			logger.error("Erro ao atualizar", ex);
			return false;
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	/**
	 * Este método é responsável por deletar um dado registro de uma agencia no banco de dados.
	 * @param a (Agencia).
	 * @return true se a exclusão for bem sucedida ou false se for mal sucedida.
	 */
	public boolean delete(Agencia a) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			delete(a.getEndereco());
			stmt = con.prepareStatement("DELETE FROM agencia WHERE idAgencia = ?");
			stmt.setInt(1, a.getId());
			logger.info("Agencia deletada");
			return true;
		} catch (SQLException e) {
			logger.error("Erro ao deletar");
			return false;
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}

	/**
	 * Este método é responsável por deletar um dado registro de um endereço de uma agencia no banco de dados.
	 * Deve ser passado o objeto da agencia em questão como parâmetro para ser deletado.
	 * @param a (Agencia).
	 * @return true se a exclusão for bem sucedida ou false se for mal sucedida.
	 * @param e
	 * @return
	 */
	public boolean delete(Endereco e) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("DELETE FROM endereco WHERE idEndereco = ?");
			stmt.setInt(1, e.getId());
			stmt.executeUpdate();
			logger.info("Endereço deletado");
			return true;
		} catch (SQLException ex) {
			logger.error("Erro ao deletar", ex);
			return false;
		} finally {
			ConnectionFactory.closeConnection(con, stmt);
			
		}
	}
}
