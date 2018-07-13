package com.projeto_final.eventos_ufg;

import java.util.Scanner;

import com.projeto_final.eventos_ufg.controlador.Controlador;
import com.projeto_final.eventos_ufg.modelo.Evento;
import com.projeto_final.eventos_ufg.modelo.GerenciadorBD;
import com.projeto_final.eventos_ufg.visao.EventoGetCLI;
import com.projeto_final.eventos_ufg.visao.EventosCLI;
import com.projeto_final.eventos_ufg.visao.EventosCreateCLI;

public class Main {

    public static void main(String[] args) {

        while (true) {
            EventosCLI.exibirMenuPrincipal();
            Scanner leitorDoTeclado = new Scanner(System.in);

            int opcao = leitorDoTeclado.nextInt();

            switch (opcao) {
                case 1:
                    EventosCLI.exibirGradeDeEventos(Controlador.recuperarEventos());
                    break;
                case 2:
                    Evento evento = EventosCreateCLI.createEvento();
                    GerenciadorBD.gravarEvento(evento);
                    break;
                case 3:
                	String titulo = EventoGetCLI.findEvento();
                    EventosCLI.exibirGradeDeEventos(Controlador.buscarEvento(titulo));
                    break;
                case 4:
                	String tituloToDelete = EventoGetCLI.findEvento();
                	Controlador.apagarEvento(tituloToDelete);
                    break;
            }
        }
    }
}




