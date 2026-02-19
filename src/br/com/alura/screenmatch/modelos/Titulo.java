// src > br.com.alura.screenmatch.modelos > Titulo.java

package br.com.alura.screenmatch.modelos;
import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;

// Classe Mãe, superclasse e parent class são termos comuns para se referir à classe que estamos a estender

// implemente comparable de título. assino o contrato e implemento
// você promete que é comparável, mas cade o metodo que a interface obriga?
public class Titulo implements Comparable<Titulo> {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if (meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano " +
                    "porque tem mais de 04 caracteres.");
        }

        this.anoDeLancamento = Integer.parseInt(meuTituloOmdb.year());
        this.duracaoEmMinutos =
                Integer.parseInt(meuTituloOmdb.runtime().split(" ")[0]);
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do título: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    // comparar esse titulo com outro título
    public int compareTo(Titulo outroTitulo) {
        // usa compareTo da String, já que estamos a comparar nomes
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        // super = o que a mãe devolve
        // return super.toString();
        return "Título: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}