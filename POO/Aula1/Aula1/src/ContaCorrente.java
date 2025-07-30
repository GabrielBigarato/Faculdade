public class ContaCorrente extends Conta{
    public ContaCorrente(){

    }

    public ContaCorrente(String titular, double saldo){
        this.setTitular(titular);
        this.setSaldo(saldo);
    }
}
