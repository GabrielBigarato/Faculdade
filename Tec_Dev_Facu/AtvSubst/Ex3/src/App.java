// ALUNOS:
// GABRIEL BIGARATO: 32831048
// NICOLAS MAZZONE: 32879750

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o peso (em kg):");
        double peso = scanner.nextDouble();

        System.out.println("Digite a altura (em metros):");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        String classificacao;

        if (imc < 16.9) {
            classificacao = "Muito abaixo do peso";
        } else if (imc >= 17 && imc <= 18.4) {
            classificacao = "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            classificacao = "Peso normal";
        } else if (imc >= 25 && imc <= 29.9) {
            classificacao = "Acima do peso";
        } else if (imc >= 30 && imc <= 34.9) {
            classificacao = "Obesidade grau 1";
        } else if (imc >= 35 && imc <= 40) {
            classificacao = "Obesidade grau 2";
        } else {
            classificacao = "Obesidade grau 3";
        }

        System.out.println("O IMC é: " + imc);
        System.out.println("Classificação: " + classificacao);

        scanner.close();
    }
}
