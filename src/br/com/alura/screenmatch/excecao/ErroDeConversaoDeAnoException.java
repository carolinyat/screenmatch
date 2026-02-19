package br.com.alura.screenmatch.excecao;

// Todas as exceções são necessariamente filhas de Throwable, são lançáveis.
// Do contrário, não poderíamos usar a palavra-chave throw.
// Se retirarmos o extends Throwable, nada vai funcionar

// Ao estender de Throwable, estamos a gerar uma exceção que nos obriga a usar o
// try/catch. Em vez disso, podemos estender de exceção não checadas (unchecked),
// em que o try/catch é opcional. Se houver um erro, a execução será encerrada

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;

    // construtor
    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}