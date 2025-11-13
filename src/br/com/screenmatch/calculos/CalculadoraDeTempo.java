package br.com.screenmatch.calculos;

import br.com.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    //get
    public int getTempoTotal() {
        return this.tempoTotal;
    }
    //método
//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    //Desing de classes o Polimorfismo muitas formas
    public void inclui(Titulo titulo){
        //aqui mostra o tratamento mostrando os titulos series etc
        System.out.println("Adicionando duração em minutos de: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
