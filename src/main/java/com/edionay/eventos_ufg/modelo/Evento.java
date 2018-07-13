package com.edionay.eventos_ufg.modelo;

public class Evento {

    String titulo;
    String detalhes;

    public Evento() {
    }

    public Evento(String titulo, String detalhes) {
        setTitulo(titulo);
        setDetalhes(detalhes);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() + "\nDetalhes: " + getDetalhes();
    }
}
