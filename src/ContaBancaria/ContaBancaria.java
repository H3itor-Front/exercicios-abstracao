package ContaBancaria;

public class ContaBancaria implements OperacoesConta {

    private String numeroConta;
    private double saldo;
    private double saque;
    private double deposito;


    public ContaBancaria(double saldo, String numeroConta) {
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("quanto voce deseja depositar: " + deposito);

    }

    @Override
    public void sacar(double valor) {
        System.out.println("Quanto voce deseja sacar: " + saldo);
        if (saque >= saldo) {
            saque -= saldo;
            System.out.println("Nao foi possivel fazer o saque!!!");
        } else {
            System.out.println("Obrigado pelo saque");
        }
    }

    @Override
    public double consultarSaldo() {
        System.out.println("Voce ainda possui: " + saldo);
        return saldo;
    }
}
