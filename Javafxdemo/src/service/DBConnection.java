
	// Criar métodos estáticos para acessar o DB sem precisar
	// ficar estanciando a classe!

package service;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnection {
	// Criar a conexão
	private static Connection conn = null;

	// 1 Método - abrir a conn
	public static Connection getConnection()  {
		// SE a conexao nao existir, a criamos
		if (conn == null) {
			// Conectar com o DB
			try {
				//Ler as props do arquivo externo
				Properties props = loadProperties();
				// PEgar a url do DB
				String url = props.getProperty("dburl");
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}	
		return conn;
	}

	private static Properties loadProperties()   {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties pros = new Properties();
			pros.load(fs);
			return pros;
		} catch (IOException e) {
			e.printStackTrace();
		}	
		return null;
	}

}
