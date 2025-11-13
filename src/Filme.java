//atalgo shift + F6 renomeia os elementos
public class Filme {
    //atributos caracteristica de um objeto.
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //criando os métodos
    //no java se não for devolver nada ter um retorno podemos começar com void
    //o void só vai imprimir a ficha tecnica dele
    //na declaração do nome do método geralmente usa o nome com imperativo,
    // as veses se encontra no infinitivo.
    void exibeFichaTecnica(){
        //Impresão do filme será que vai mostrar o filme?
        //Filme@6d311334 não ele mostra onde fica armazenado as informações
        //System.out.println(meuFilme);
        //para imprimir o nome ou qualque atribudo do objeto temo que dar acesso a ele
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }
    //método que eu vo passar um argumento
    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    //método que retorna algma coisa

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}
