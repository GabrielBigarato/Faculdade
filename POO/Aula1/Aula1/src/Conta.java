public abstract class Conta {

    private String titular;

    private double saldo;

    private String agencia;

    private String conta;

    public void setTitular(String titular){
        this.titular=titular;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public void setConta(String conta){
        this.conta = conta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public String getConta(){
        return this.conta;
    }
    public String getAgencia(){
        return this.agencia;
    }
    public String getTitular(){
        return this.titular;
    }


}
