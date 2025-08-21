import ContaBancaria.ContaBancaria;
import Produto.Exibivel;
import Produto.Produto;

public class Main {
    public static void main(String[] args) {
        Exibivel prod = new Produto("Celular", 2500);
        prod.exibirDetalhes();


    ContaBancaria cont = new ContaBancaria(2500, "12345678");
    cont.consultarSaldo();


    }
}