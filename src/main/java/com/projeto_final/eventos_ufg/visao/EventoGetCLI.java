package com.projeto_final.eventos_ufg.visao;

import java.util.Scanner;

public class EventoGetCLI{

	public static String findEvento() {
		
		Scanner leitor = new Scanner(System.in);
		
		leitor.nextLine();
        System.out.println("Titulo: ");
        String titulo = leitor.nextLine();
        
        return titulo;
	}
	
}
