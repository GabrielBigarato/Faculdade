public class Contador extends Funcionario {
    private static final double VALOR_HORA_CONTADOR = 45.0;

    public Contador(String nome, Contrato contrato, Nivel nivel, double horasTrabalhadas) {
        super(nome, contrato, nivel, horasTrabalhadas);
    }

    @Override
    public double calcularSalarioBruto() {
        if (contrato == Contrato.HORISTA) {
            return horasTrabalhadas * VALOR_HORA_CONTADOR;
        } else if (contrato == Contrato.CLT) {
            switch (nivel) {
                case JUNIOR:
                    return 2800.0;
                case PLENO:
                    return 4500.0;
                case SENIOR:
                    return 7000.0;
            }
        }
        return 0.0;
    }
}