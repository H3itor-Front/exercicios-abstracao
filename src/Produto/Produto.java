package Produto;

public class Produto implements Exibivel{

    private String nome;
    private double preco;

    public Produto(String nome , double preco ) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("O nome desse produto é: " + nome);
        System.out.println("Esse é o preco desse produto: " + preco);

    }
}
