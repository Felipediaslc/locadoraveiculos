/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.log4j.LogManager;

/**
 * Classe responsável pela comunicação da JVM com o banco de dados.
 * @author Widson
 *
 */
public class ConnectionFactory {
	private static final String URL = "jdbc:mysql://localhost:3306/locadora_noca_bd?useSSL=false";
	private static final String USER = "root";
	private static final String PASS = "vertrigo";

	/**
	 * Método utilizado para abrir uma conexão com o BD.
	 * @return Connection.
	 */
	public static Connection getConnection() {
        try {
        	return DriverManager.getConnection(URL, USER, PASS);              
        } catch (SQLException e) {
        	throw new RuntimeException("Erro na conexão: ", e);
        }
    }

	/**
	 * Método utilizado para fechar uma conexão que foi aberta.
	 * @param con (Connection).
	 */
	public static void closeConnection(Connection con) {
		try {
			if (con != null) {
				con.close();
			}
		} catch (SQLException ex) {
			Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	/**
	 * Método utilizado para fechar uma conexão que foi aberta.
	 * @param con (Connection).
	 */
	public static void closeConnection(Connection con, PreparedStatement stmt) {
		closeConnection(con);
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException ex) {
			Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
		}
	}

	/**
	 * Método utilizado para fechar uma conexão que foi aberta.
	 * @param con (Connection).
	 */
	public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
		closeConnection(con, stmt);
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException ex) {
			Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
}