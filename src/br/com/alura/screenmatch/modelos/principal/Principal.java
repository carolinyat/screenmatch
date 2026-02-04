package br.com.alura.screenmatch.modelos.principal;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        // a parte na direita é onde criamos o espaço na memória,
        // e na esquerda estamos a informar a necessidade de uma variável
        // que saiba referenciar um objeto do tipo br.com.alura.screenmatch.modelos.Filme

        Filme meuFilme = new Filme();
        meuFilme.setNome("Send Help");
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
    }
}