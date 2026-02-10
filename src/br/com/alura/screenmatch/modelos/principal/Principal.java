package br.com.alura.screenmatch.modelos.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // a parte na direita é onde criamos o espaço na memória,
        // e na esquerda estamos a informar a necessidade de uma variável
        // que saiba referenciar um objeto do tipo br.com.alura.screenmatch.modelos.Filme

        // A palavra new cria um objeto na memória e invoca o construtor.
        // Vale lembrar que o construtor não é um metodo

        Filme meuFilme = new Filme("Send Help");
        // meuFilme.setNome("Send Help");
        meuFilme.setAnoDeLancamento(2026);
        meuFilme.setDuracaoEmMinutos(133);
        meuFilme.setIncluidoNoPlano(false);
        // System.out.println(meuFilme);
        meuFilme.exibeFichaTecnica();

        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        // System.out.println("Total de avaliações: " + meuFilme.totalDeAvaliacoes);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println(meuFilme.pegaMedia());

        /*
        double media = meuFilme.retornaMediaDasAvaliacoes();
        System.out.println(media);
        */

        Serie bridgerton = new Serie();
        bridgerton.setNome("Bridgerton");
        bridgerton.setAnoDeLancamento(2020);
        bridgerton.exibeFichaTecnica();

        bridgerton.setTemporadas(4);
        bridgerton.setEpisodiosPorTemporada(10);
        bridgerton.setMinutosPorEpisodio(60);
        System.out.println("Duração para maratonar Bridgerton: " + bridgerton.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.incluiTitulo(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        calculadora.incluiTitulo(bridgerton);
        System.out.println(calculadora.getTempoTotal());

        Episodio episodio = new Episodio();
        episodio.setNome("Diamond of the First Water");
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(82000000);
        System.out.println(episodio.getNome());
        System.out.println(episodio.getTotalVisualizacoes());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        filtro.filtra(episodio);

        // à esquerda, variável referência; à direita, cria o objeto e guarda a referência na variável filme. Podemos substituir 'Filme' por 'var'
        // é feito uma inferência do tipo, não se faz necessário dizer que é um filme
        var liveActionFilme = new Filme("Como Treinar Seu Dragão");
        // liveActionFilme.setNome("Como Treinar Seu Dragão");
        liveActionFilme.setAnoDeLancamento(2025);

        var suspenseFilme = new Filme("A Empregada");
        // suspenseFilme.setNome("A Empregada");
        suspenseFilme.setAnoDeLancamento(2026);

        // ou var listaDeFilmes = new ArrayList<>();
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(liveActionFilme);
        listaDeFilmes.add(suspenseFilme);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.getFirst().getNome());

        System.out.println(listaDeFilmes);

        System.out.println("toString do filme: " + listaDeFilmes.getFirst().toString());

        suspenseFilme.toString();
    }
}