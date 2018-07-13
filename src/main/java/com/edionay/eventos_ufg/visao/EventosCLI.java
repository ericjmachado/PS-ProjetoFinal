package com.edionay.eventos_ufg.visao;

import com.edionay.eventos_ufg.controlador.Controlador;
import com.edionay.eventos_ufg.modelo.Evento;

import java.util.List;

public class EventosCLI {


    public static void exibirMenuPrincipal() {
        System.out.println("1 - Exibir todos os eventos");
        System.out.println("2 - Registrar novo evento");
        System.out.println("3 - Buscar por título");
        System.out.println("4 - Apagar evento");
    }


    public static void exibirGradeDeEventos(List<Evento> eventos) {

        for (Evento e: eventos) {
            System.out.println("Título: " + e.getTitulo());
            System.out.println("Detalhes: " + e.getDetalhes());
            System.out.println(" -----------------------------------------------");
        }
    }
}
