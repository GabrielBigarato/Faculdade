import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando objetos Professor e Disciplina
        Professor professor = new Professor("João da Silva");
        Disciplina disciplina = new Disciplina("Matemática", professor);

        // Criando objeto Turma
        Turma turma = new Turma(disciplina);

        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar aluno");
            System.out.println("2. Remover aluno");
            System.out.println("3. Procurar aluno");
            System.out.println("4. Listar alunos");
            System.out.println("5. Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome do aluno:");
                    scanner.nextLine(); // Consume a quebra de linha pendente
                    String nomeAluno = scanner.nextLine();
                    System.out.println("Digite a matrícula do aluno:");
                    int matriculaAluno = scanner.nextInt();
                    turma.adicionarAluno(new Aluno(nomeAluno, matriculaAluno));
                    System.out.println("Aluno adicionado com sucesso!");
                    break;
                case 2:
                    System.out.println("Digite a matrícula do aluno a ser removido:");
                    int matriculaRemover = scanner.nextInt();
                    Aluno alunoRemover = turma.procurarAluno(matriculaRemover);
                    if (alunoRemover != null) {
                        turma.removerAluno(alunoRemover);
                        System.out.println("Aluno removido com sucesso!");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 3:
                    System.out.println("Digite a matrícula do aluno a ser procurado:");
                    int matriculaProcurar = scanner.nextInt();
                    Aluno alunoProcurado = turma.procurarAluno(matriculaProcurar);
                    if (alunoProcurado != null) {
                        System.out.println("Aluno encontrado: " + alunoProcurado.getNome());
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Lista de alunos:");
                    turma.listarAlunos();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
