package br.ufg.es.ps2018.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

public class Conexao {
	
	private static String url = "jdbc:h2:tcp://localhost/~/eventos";
	
	private static String usuario = "sa";
	
	private static String senha = "";
	
	static {
		
		// TODO create table
		
		Connection conn = Conexao.getConexao();
		
		try {
			
			Statement stmt = conn.createStatement();
			
			String sql = "CREATE TABLE IF NOT EXISTS evento(" +
					"id bigint auto_increment, " + 
					"titulo VARCHAR(255) NOT NULL, " + 
					"dataInicio DATE NOT NULL, " + 
					"dataFim DATE NOT NULL, " + 
					"descricao VARCHAR(255) NOT NULL, " +
					"assunto VARCHAR(255) NOT NULL, " + 
					"local VARCHAR(255) NOT NULL);";
			
			stmt.executeUpdate(sql);
			
			System.out.println("Tabela Criado com sucesso");
			
			stmt.close();
			conn.close();
					
			
		} catch (SQLException e) {
		
			e.printStackTrace();
			
		}
		
	}
	
	public static Connection getConexao() {
		
		BancoH2.start();
		
		Connection conn = null;
		
		try {
			
			conn = DriverManager.getConnection(url, usuario, senha);
			
            System.out.println("Connection Established: " + conn.getMetaData().getDatabaseProductName() + "/" + conn.getCatalog());
            
		} catch (SQLException e) {

			e.printStackTrace();
			
		}
		
		return conn;
		
	}

	public static void main(String[] args) throws SQLException {

		Connection conn = Conexao.getConexao();

		System.out.println("conexao aberta");
		
		conn.close();
	}

}
