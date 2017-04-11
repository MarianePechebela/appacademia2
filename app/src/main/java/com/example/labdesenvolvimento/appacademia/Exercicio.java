package com.example.labdesenvolvimento.appacademia;

/**
 * Created by Lab. Desenvolvimento on 11/04/2017.
 */

public class Exercicio {
    private long ID;

    private String nome;
    private int serie;
    private int repeticoes;

    public Exercicio() {
    }

    public Exercicio(long ID, String nome, int repeticoes) {
        this.ID = ID;
        this.nome = nome;
        this.serie = serie;
        this.repeticoes = repeticoes;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }


    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }
}
