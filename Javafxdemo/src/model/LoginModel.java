package model;

import java.sql.Connection;
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
	//Fazer login do user
	
	

}
