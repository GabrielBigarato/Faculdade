import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de cálculo de salário!");

        System.out.println("Escolha o tipo de funcionário:");
        System.out.println("1. Engenheiro");
        System.out.println("2. Analista");
        System.out.println("3. Contador");
        int tipoFuncionario = scanner.nextInt();

        System.out.println("Escolha o tipo de contrato:");
        System.out.println("1. Horista");
        System.out.println("2. CLT");
        System.out.println("3. PJ");
        int tipoContrato = scanner.nextInt();

        System.out.println("Escolha o nível de conhecimento:");
        System.out.println("1. Junior");
        System.out.println("2. Pleno");
        System.out.println("3. Senior");
        int nivelConhecimento = scanner.nextInt();

        System.out.println("Digite a quantidade de horas trabalhadas:");
        double horasTrabalhadas = scanner.nextDouble();

        Funcionario funcionario = null;

        switch (tipoFuncionario) {
            case 1:
                funcionario = new Engenheiro("João", Contrato.values()[tipoContrato - 1], Nivel.values()[nivelConhecimento - 1], horasTrabalhadas);
                break;
            case 2:
                funcionario = new Analista("Maria", Contrato.values()[tipoContrato - 1], Nivel.values()[nivelConhecimento - 1], horasTrabalhadas);
                break;
            case 3:
                funcionario = new Contador("José", Contrato.values()[tipoContrato - 1], Nivel.values()[nivelConhecimento - 1], horasTrabalhadas);
                break;
            default:
                System.out.println("Tipo de funcionário inválido!");
                break;
        }

        if (funcionario != null) {
            double salarioBruto = funcionario.calcularSalarioBruto();
            double salarioLiquido = funcionario.calcularSalarioLiquido();
            System.out.println("Salário bruto: " + salarioBruto);
            System.out.println("Salário líquido: " + salarioLiquido);
        }
    }
}