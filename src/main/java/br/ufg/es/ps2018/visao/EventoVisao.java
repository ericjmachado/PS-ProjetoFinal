package br.ufg.es.ps2018.visao;

import java.util.Date;

import br.ufg.es.ps2018.controlador.EventoControlador;
import br.ufg.es.ps2018.modelo.Evento;

public class EventoVisao {

	public static void main(String[] args) {
		
		EventoControlador eventoControlador = new EventoControlador();
		
		Evento evento = new Evento();
		
		//TODO fazer console.io para preencher obj
		
		evento.setAssunto("teste");
		evento.setDataFim(new Date());
		evento.setDataInicio(new Date());
		evento.setDescricao("aLGO");
		evento.setLocal("teste");
		evento.setTitulo("titulo");
		
		eventoControlador.salvar(evento);
	}
}
