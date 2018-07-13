package com.projeto_final.eventos_ufg.controlador;

import com.db4o.ObjectSet;
import com.projeto_final.eventos_ufg.modelo.Evento;
import com.projeto_final.eventos_ufg.modelo.GerenciadorBD;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Controlador {


    public static List<Evento> recuperarEventos() {
        return GerenciadorBD.recuperarEventos();
    }

    public static List<Evento> objetoParaEvento(ObjectSet objetos) {

        List<Evento> eventos = new ArrayList<Evento>();

        for (Object o: objetos) {
            Evento evento = (Evento) o;
            eventos.add(evento);
        }
        return eventos;
    }

    public static List<Evento> buscarEvento(String titulo) {

        Evento evento = new Evento(titulo);
        return GerenciadorBD.buscarEvento(evento);
    }

    public static void apagarEvento(String titulo) {

        Evento evento = new Evento(titulo);
        GerenciadorBD.apagarEvento(evento);
    }

}
