package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    static void main(String[] args) {

        Filme meuFilme = new Filme("Send Help", 2026);
        Serie bridgerton = new Serie("Bridgerton", 2020, 4);
        var liveActionFilme = new Filme("Como Treinar Seu Dragão", 2025);
        var suspenseFilme = new Filme("A Empregada", 2026);

        // ArrayList<Titulo> assistidos = new ArrayList<>();
        // tentamos sempre referenciar a um objeto de maneira mais genérica possível:
        List<Titulo> assistidos = new ArrayList<>();

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
        System.out.println("Artistas depois da ordenação por nome: " + buscaPorArtista);

        Collections.sort(assistidos);
        System.out.println("Títulos depois da ordenação por título: " + assistidos);

        // esse é o comparator e não comparable
        assistidos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Títulos depois da ordenação por ano: " + assistidos);

        /*
        As classes mais comuns para representar uma lista no Java são:

        ArrayList
        A principal característica do ArrayList é que ele é baseado em um array dinâmico. Ele armazena
        os elementos numa matriz interna e, conforme novos elementos são adicionados, o tamanho da matriz
        é automaticamente ajustado para acomodar o novo elemento. Da mesma forma, quando um elemento é removido,
        o tamanho do array é ajustado para evitar o desperdício de espaço. O ArrayList é amplamente utilizado
        devido à sua facilidade de uso e eficiência em termos de desempenho.

        LinkedList
        A classe LinkedList fornece uma lista encadeada de elementos. Diferentemente do ArrayList, baseado
        em um array, o LinkedList é baseado numa lista encadeada, o que significa que cada elemento da lista é
        um objeto que contém uma referência para o próximo elemento. Isso permite que os elementos sejam adicionados
        e removidos de maneira eficiente em qualquer posição da lista, mas pode tornar a pesquisa de um elemento
        específico menos eficiente.

        O LinkedList é uma boa escolha quando a inserção e remoção de elementos em qualquer posição da lista é
        frequente e quando não é necessário acessar os elementos de forma aleatória.

        Vector
        A classe Vector é semelhante ao ArrayList, mas é sincronizada, o que significa que é segura para uso em
        threads concorrentes. No entanto, a sincronização adiciona uma sobrecarga de desempenho, então o Vector
        pode ser mais lento que o ArrayList em algumas situações.

        Stack
        A classe Stack implementa uma pilha, que é uma coleção ordenada de elementos onde a inserção e remoção de
        elementos ocorrem sempre no mesmo extremo da lista. Os elementos são adicionados e removidos numa ordem
        conhecida como "last-in, first-out" (LIFO), ou seja, o último elemento adicionado é o primeiro a ser removido.
        A classe Stack é usada com frequência em algoritmos de processamento de texto, bem como em outras situações
        em que a LIFO é a maneira natural de organizar os dados.

        Cada uma dessas classes tem os seus próprios pontos fortes e fracos, e a escolha de qual usar dependerá das
        necessidades específicas da aplicação.
         */
    }
}
