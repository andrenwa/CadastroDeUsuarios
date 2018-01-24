package br.com.treeway.Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	static final String url = "jdbc:postgresql://localhost:5433/db_usuarios";
	static final String usuario = "postgres";
	static final String senha = "123456";

	public static Connection getConexao() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(url, "postgres", senha);
		} catch (ClassNotFoundException e) {
			throw new SQLException(e.getMessage());
		}

	}

}
