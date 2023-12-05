package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import service.DBConnection;

public class LoginModel {
		
	Connection connection;
	
	public LoginModel() {
		connection = DBConnection.getConnection();
		if(connection == null) {
			System.out.println("Erro no BD...");
		}else {
			System.out.println("Conexao okkkkk");
		}
	}
	//Criar user (signup)
	
	public void signup(Cliente client) {
		//Salvar este user na tabela
		//Para salvar no BD, precisamos de um PreparedStatement e ResultSet
		PreparedStatement prep = null;
		Boolean result = null;
		
		//Preparando a query
		
		String query = "insert into escola.users (nome,email, password) values (? , ? , ?)";
		
		try {
			//Preparando
			prep = connection.prepareStatement(query);
			
			prep.setString(1, client.getNome());
			prep.setString(2, client.getEmail());
			prep.setString(3, client.getPassword());
			
			//executar!!
			
			result = prep.execute();
			
			System.out.println(result);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		
		
	}
	
	//Fazer login do user
	
	

}
