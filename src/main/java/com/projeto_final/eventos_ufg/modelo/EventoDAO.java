package com.projeto_final.eventos_ufg.modelo;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.projeto_final.eventos_ufg.controlador.Controlador;

import java.util.List;

public class EventoDAO {

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
        List<Evento> eventos;

        try {
            ObjectSet resultado = banco.queryByExample(exemploDeEvento);

            eventos = Controlador.objetoParaEvento(resultado);

        } finally {
            banco.close();
        }

        return eventos;

    }

    public static List<Evento> buscarEvento(Evento evento) {
        ObjectContainer banco = Db4o.openFile(caminhoDoBanco);

        List<Evento> eventos;

        try {
            ObjectSet resultado = banco.queryByExample(evento);
            eventos = Controlador.objetoParaEvento(resultado);

        } finally {
            banco.close();
        }

        return eventos;
    }

    public static void apagarEvento(Evento evento) {
        ObjectContainer banco = Db4o.openFile(caminhoDoBanco);

        try {
            ObjectSet resultado = banco.queryByExample(evento);

            for (Object o: resultado) {
                banco.delete(o);
            }
        } finally {
            banco.close();
        }
    }
}
