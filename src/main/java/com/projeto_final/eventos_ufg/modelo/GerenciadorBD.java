package com.projeto_final.eventos_ufg.modelo;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorBD {

    private static String caminhoDoBanco = "eventos.db4o";


    public static void gravarEvento(Evento evento) {

        ObjectContainer banco = Db4o.openFile(caminhoDoBanco);

        try {
            banco.store(evento);
        } finally {
            banco.close();
        }
    }

    public static List<Evento> recuperarEventos(){
        ObjectContainer banco = Db4o.openFile(caminhoDoBanco);
        Evento exemploDeEvento = new Evento();
        List<Evento> eventos = new ArrayList<Evento>();

        try {
            ObjectSet resultado = banco.queryByExample(exemploDeEvento);

            for (Object o: resultado) {
                Evento evento = (Evento) o;
                eventos.add(evento);
            }
        } finally {
            banco.close();
        }

        return eventos;

    }

    public static List<Evento> buscarEvento(String titulo) {
        Evento exemploDeEvento = new Evento(titulo);
        ObjectContainer banco = Db4o.openFile(caminhoDoBanco);

        List<Evento> eventos = new ArrayList<Evento>();

        try {
            ObjectSet resultado = banco.queryByExample(exemploDeEvento);

            for (Object o: resultado) {
                Evento evento = (Evento) o;
                eventos.add(evento);
            }
        } finally {
            banco.close();
        }

        return eventos;
    }

    public static void apagarEvento(String titulo) {
        Evento exemploDeEvento = new Evento(titulo);
        ObjectContainer banco = Db4o.openFile(caminhoDoBanco);

        try {
            ObjectSet resultado = banco.queryByExample(exemploDeEvento);

            for (Object o: resultado) {
                banco.delete(o);
            }
        } finally {
            banco.close();
        }
    }
}
