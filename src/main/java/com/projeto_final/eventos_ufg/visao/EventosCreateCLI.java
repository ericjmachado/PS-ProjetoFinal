package com.projeto_final.eventos_ufg.visao;

import java.util.Scanner;

import com.projeto_final.eventos_ufg.modelo.Evento;

public class EventosCreateCLI {

	
	public static Evento createEvento() {
	
		
		Scanner leitor = new Scanner(System.in);
		
        leitor.nextLine();
        System.out.print("Titulo: ");
        String titulo = leitor.nextLine();
        System.out.print("Localização: ");
        String localizacao = leitor.nextLine();
        System.out.print("Data inicial (dd-mm-aaa): ");
        String dataInicial = leitor.nextLine();
        System.out.print("Data final (dd-mm-aaa): ");
        String dataFinal = leitor.nextLine();
        System.out.print("Detalhes: ");
        String detalhes = leitor.nextLine();
        
        return new Evento(titulo, localizacao, dataInicial, dataFinal, detalhes);
		
	}
	
}
