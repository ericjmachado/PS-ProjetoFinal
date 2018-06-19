package br.ufg.es.ps2018.controlador;

import br.ufg.es.ps2018.DAO.EventoDAO;
import br.ufg.es.ps2018.modelo.Evento;

public class EventoControlador {

	private EventoDAO eventoDAO;

	public EventoControlador() {
		
		this.eventoDAO = new EventoDAO();
	}
	
	public void salvar(Evento evento) {
		
		// TODO fazer regras de negocio
		
		this.eventoDAO.salvar(evento);
	}
}
