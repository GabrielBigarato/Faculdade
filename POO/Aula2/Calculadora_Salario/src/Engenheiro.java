public class Engenheiro extends Funcionario {
    private static final double VALOR_HORA_ENGENHEIRO = 50.0;

    public Engenheiro(String nome, Contrato contrato, Nivel nivel, double horasTrabalhadas) {
        super(nome, contrato, nivel, horasTrabalhadas);
    }

    @Override
    public double calcularSalarioBruto() {
        if (contrato == Contrato.HORISTA) {
            return horasTrabalhadas * VALOR_HORA_ENGENHEIRO;
        } else if (contrato == Contrato.CLT) {
            switch (nivel) {
                case JUNIOR:
                    return 3000.0;
                case PLENO:
                    return 5000.0;
                case SENIOR:
                    return 8000.0;
            }
        }
        return 0.0;
    }
}
