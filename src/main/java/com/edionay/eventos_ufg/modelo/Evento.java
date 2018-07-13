package com.edionay.eventos_ufg.modelo;

public class Evento {

    private String titulo;
    private String localizacao;
    private String dataInicial;
    private String dataFinal;
    private String detalhes;

    public Evento() {
    }

    public Evento(String titulo) {
        setTitulo(titulo);

    }

    public Evento(String titulo, String localizacao, String dataInicial, String dataFinal, String detalhes) {
        setLocalizacao(localizacao);
        setDataFinal(dataFinal);
        setDataInicial(dataInicial);
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

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDataInicial() {
        return dataInicial;
    }

    public void setDataInicial(String dataInicial) {
        this.dataInicial = dataInicial;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    @Override
    public String toString() {
        return "Título: " + getTitulo() + "\nDetalhes: " + getDetalhes();
    }
}
