package com.edionay.eventosufg;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Eventos")
public class Eventos extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Recupera dados do banco de dados
		String[] eventos = {
				"Arraiá da CEU",
				"Arraiá da Letras",
				"CONPEEX"
		};
		
		request.setAttribute("eventos", eventos);
		//Redireciona para outra página		
		RequestDispatcher redirecionador = request.getRequestDispatcher("eventos.jsp");
		redirecionador.forward(request, response);
	}

}
