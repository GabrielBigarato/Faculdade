public class Analista extends Funcionario {
    private static final double VALOR_HORA_ANALISTA = 40.0;

    public Analista(String nome, Contrato contrato, Nivel nivel, double horasTrabalhadas) {
        super(nome, contrato, nivel, horasTrabalhadas);
    }

    @Override
    public double calcularSalarioBruto() {
        if (contrato == Contrato.HORISTA) {
            return horasTrabalhadas * VALOR_HORA_ANALISTA;
        } else if (contrato == Contrato.CLT) {
            switch (nivel) {
                case JUNIOR:
                    return 2500.0;
                case PLENO:
                    return 4000.0;
                case SENIOR:
                    return 6000.0;
            }
        }
        return 0.0;
    }
}