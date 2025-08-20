import Produto.Exibivel;
import Produto.Produto;

public class Main {
    public static void main(String[] args) {
        Exibivel prod = new Produto("Celular", 2500);
        prod.exibirDetalhes();
    }
}