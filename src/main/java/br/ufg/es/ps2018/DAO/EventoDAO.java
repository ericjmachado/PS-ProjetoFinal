package br.ufg.es.ps2018.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import br.ufg.es.ps2018.modelo.Evento;

public class EventoDAO {

	private void fechaDB(Connection conn) {
		
		if (conn != null) {
			
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void salvar(Evento evento) {

		Connection conn = null;
		
		try {
			
			conn = Conexao.getConexao();
			
			Statement stmt = conn.createStatement();

			StringBuilder sql = new StringBuilder();			
			
			sql.append("insert into evento(titulo, dataInicio, dataFim, descricao, assunto, local) values(");
			sql.append("'"+evento.getTitulo() + "', ");
			sql.append("'"+evento.getDataInicio() + "', ");
			sql.append("'"+evento.getDataFim() + "', ");
			sql.append("'"+evento.getDescricao() + "', ");
			sql.append("'"+evento.getAssunto() + "', ");
			sql.append("'"+evento.getLocal() + "')");
			
			stmt.executeUpdate(sql.toString());
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		} finally {

			fechaDB(conn);

		}
	}
}
