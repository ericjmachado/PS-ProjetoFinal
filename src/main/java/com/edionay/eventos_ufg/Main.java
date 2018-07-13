package com.edionay.eventos_ufg;

import com.edionay.eventos_ufg.modelo.Evento;
import com.edionay.eventos_ufg.modelo.GerenciadorBD;
import com.edionay.eventos_ufg.visao.EventosCLI;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            EventosCLI.exibirMenuPrincipal();
            Scanner leitorDoTeclado = new Scanner(System.in);

            int opcao = leitorDoTeclado.nextInt();

            switch (opcao) {
                case 1:
                    EventosCLI.exibirGradeDeEventos(GerenciadorBD.recuperarEventos());
                    break;
                case 2:
                    leitorDoTeclado.nextLine();
                    System.out.println("Titulo:");
                    String titulo = leitorDoTeclado.nextLine();
                    System.out.println("Detalhes:");
                    String detalhes = leitorDoTeclado.nextLine();

                    Evento evento = new Evento(titulo, detalhes);
                    GerenciadorBD.gravarEvento(evento);
                    break;
                case 3:
                    leitorDoTeclado.nextLine();
                    System.out.println("Titulo:");
                    String tituloParaBusca = leitorDoTeclado.nextLine();
                    EventosCLI.exibirGradeDeEventos(GerenciadorBD.buscarEvento(tituloParaBusca));
                    break;
                case 4:
                    leitorDoTeclado.nextLine();
                    System.out.println("Titulo:");
                    String tituloParaApagar = leitorDoTeclado.nextLine();
                    GerenciadorBD.apagarEvento(tituloParaApagar);
                    break;
            }

        }
    }
}




