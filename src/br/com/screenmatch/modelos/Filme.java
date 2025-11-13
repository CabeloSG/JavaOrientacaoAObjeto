package br.com.screenmatch.modelos;

//Extends Palavra reservada do Java que aplica herança à uma classe
public class Filme extends Titulo{
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
}
