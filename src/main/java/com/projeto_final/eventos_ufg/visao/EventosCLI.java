package com.projeto_final.eventos_ufg.visao;

import java.util.List;

import com.projeto_final.eventos_ufg.controlador.Controlador;
import com.projeto_final.eventos_ufg.modelo.Evento;

public class EventosCLI {


    public static void exibirMenuPrincipal() {
    	
    	for(int i = 0; i < 20; i++) {
    		
    		System.out.println();
    		
    	}
    	
        System.out.println("1 - Exibir todos os eventos");
        System.out.println("2 - Registrar novo evento");
        System.out.println("3 - Buscar por título");
        System.out.println("4 - Apagar evento");
    }


    public static void exibirGradeDeEventos(List<Evento> eventos) {

        for (Evento e: eventos) {
            System.out.println("Titulo: " + e.getTitulo());
            System.out.println("Local: " + e.getLocalizacao());
            System.out.println("Data inicial: " + e.getDataInicial());
            System.out.println("Data final: " + e.getDataFinal());
            System.out.println("Detalhes: " + e.getDetalhes());
            System.out.println(" -----------------------------------------------");
        }
    }
}
