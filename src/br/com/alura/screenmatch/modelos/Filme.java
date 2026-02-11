// src > br.com.alura.screenmatch.modelos > Filme.java

package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    // construtor: metodo que tem como função a criação de um objeto na memória

    // Quando uma classe é definida, ela pode ter um ou mais construtores,
    // sendo que se nenhum construtor for definido explicitamente, o Java criará
    // um construtor default automaticamente (não possui parâmetros e não executa nenhuma instrução)
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    // Se uma classe define explicitamente um ou mais construtores, mas não define um construtor sem
    // parâmetros, então não há construtor default. Nesse caso, se um objeto é criado sem argumentos,
    // um erro de compilação será gerado

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        // super = o que a mãe devolve
        // return super.toString();
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}

/*

Public
O modificador de acesso public é o mais permissivo de todos. Uma classe,
atributo ou metodo declarado como public pode ser acessado por qualquer
classe em qualquer pacote. Ou seja, ele possui visibilidade pública e
pode ser utilizado livremente.

Default (Package-private)
O modificador de acesso default é aquele que não especifica nenhum
modificador de acesso. Quando nenhum modificador de acesso é
especificado, a classe, atributo ou metodo pode ser acessado apenas
pelas classes que estão no mesmo pacote.

Private
O modificador de acesso private é o mais restritivo de todos. Uma classe,
atributo ou metodo declarado como private só pode ser acessado dentro da
própria classe. Ou seja, ele possui visibilidade restrita e não pode ser
utilizado por outras classes.

 */
