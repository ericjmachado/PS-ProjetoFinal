package com.edionay.eventos_ufg.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    Connection conexao;

    private final String banco = "eventos";
    private final String usuario = "root";
    private final String senha = "Angel7anos";
    private final String url = "jdbc:mysql//localhost:3360";

    public Connection conectarBD() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;
    }

}
