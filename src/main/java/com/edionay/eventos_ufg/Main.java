package com.edionay.eventos_ufg;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.edionay.eventos_ufg.modelo.Evento;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        ObjectContainer eventosDB = Db4o.openFile("eventos.db4o");

        Evento evento = new Evento();
        ObjectSet resultado = eventosDB.queryByExample(evento);

        System.out.println(resultado.size());

        for (Object e: resultado) {
            Evento event = (Evento) e;
            System.out.println(event.getTitulo());
        }

        try {

        } finally {
            eventosDB.close();
        }

    }
}




