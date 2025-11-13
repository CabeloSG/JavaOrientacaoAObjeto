package br.com.screenmatch.modelos;

                //extends palavra-chave que realiza a herança
public class Serie extends Titulo{
    private int temporadas;
    private boolean ativa;
    private int episodiosPorTemporadas;
    private int minutosPorEpisodios;

    //A anotação @Deprecated é usada para indicar que um método ou classe está obsoleto e não deve ser mais utilizado.

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporadas() {
        return episodiosPorTemporadas;
    }

    public void setEpisodiosPorTemporadas(int episodiosPorTemporadas) {
        this.episodiosPorTemporadas = episodiosPorTemporadas;
    }

    public int getMinutosPorEpisodios() {
        return minutosPorEpisodios;
    }

    public void setMinutosPorEpisodios(int minutosPorEpisodios) {
        this.minutosPorEpisodios = minutosPorEpisodios;
    }
    //@Override é uma anotação que um método esta sobrescrevendo ou rescrevendo da classe pai(Superclasse) ou de uma interface
    //a anotação ajuda a identificar se ouve uma mudança no método e avisa onde esta sendo utilizado a sobrescrita
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporadas * minutosPorEpisodios;
    }
}
