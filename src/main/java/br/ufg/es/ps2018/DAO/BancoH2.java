package br.ufg.es.ps2018.DAO;

import java.sql.SQLException;

import org.h2.tools.Server;

public class BancoH2 {

	private static Server server = null;

	public static void start() {

		if (server == null) {
			try {
				server = Server.createTcpServer("-tcpAllowOthers").start();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}
