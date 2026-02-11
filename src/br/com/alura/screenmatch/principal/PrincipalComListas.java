package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PrincipalComListas {
    static void main(String[] args) {

        Filme meuFilme = new Filme("Send Help", 2026);
        Serie bridgerton = new Serie("Bridgerton", 2020, 4);
        var liveActionFilme = new Filme("Como Treinar Seu Dragão", 2025);
        var suspenseFilme = new Filme("A Empregada", 2026);

        ArrayList<Titulo> assistidos = new ArrayList<>();

        assistidos.add(meuFilme);
        assistidos.add(suspenseFilme);
        assistidos.add(liveActionFilme);
        assistidos.add(bridgerton);

        System.out.println("Meus títulos assistidos: " + assistidos);

        meuFilme.avalia(9);
        liveActionFilme.avalia(10);
        suspenseFilme.avalia(7);

        for (Titulo item : assistidos) {
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                // declarar o filme e dizer que o item é um filme
                // Filme filme = (Filme) item;
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        // assistidos.forEach(item -> System.out.println(item));
        // assistidos.forEach(System.out::println);

        System.out.println("------------------------------------------------------------");

        // isso não é copiar o objeto; é variável de referência, aponta o mesmo local
        // criamos objetos apenas com 'new'
        Filme f1 = meuFilme;

        // polimorfismo não é o objeto que tem várias formas, é a forma que podemos nos
        // referenciar a ele que podem ter várias formas

        System.out.println("Nome de f1: " + f1.getNome());

        if (f1 == meuFilme) {
            System.out.println("Variáveis diferentes para indicar o mesmo objeto");
        }

        f1.setAnoDeLancamento(2010);

        System.out.println("Novo ano de Meu Filme: " + meuFilme.getAnoDeLancamento());
        System.out.println("Novo ano de f1: " + f1.getAnoDeLancamento());

        System.out.println("------------------------------------------------------------");

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Jenna Ortega");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Robert Downey Jr");
        buscaPorArtista.add("Jennifer Lawrence");
        buscaPorArtista.add("Emma Stone");
        buscaPorArtista.add("Timothée Chalamet");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: " + buscaPorArtista);

        Collections.sort(assistidos);
        System.out.println("Depois da ordenação: " + assistidos);
    }
}
