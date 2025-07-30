public abstract class Funcionario {
    protected String nome;
    protected Contrato contrato;
    protected Nivel nivel;
    protected double horasTrabalhadas;
    protected static final double DESCONTO_IR = 0.15;

    public Funcionario(String nome, Contrato contrato, Nivel nivel, double horasTrabalhadas) {
        this.nome = nome;
        this.contrato = contrato;
        this.nivel = nivel;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public abstract double calcularSalarioBruto();

    public double calcularSalarioLiquido() {
        double salarioBruto = calcularSalarioBruto();
        if (contrato == Contrato.CLT) {
            return salarioBruto - (salarioBruto * DESCONTO_IR);
        }
        return salarioBruto;
    }
}
