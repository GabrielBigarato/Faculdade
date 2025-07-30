public class recursao {
    public static void main(String[] args) {
        int fatorial = 5;

        // Calculando o fatorial de 5
        int resultadoFatorial = calcularFatorial(fatorial);
        System.out.println("Fatorial de " + fatorial + " é " + resultadoFatorial);

        // Exibindo números de forma decrescente
        System.out.println("Números de forma decrescente:");
        exibeDecrescente(5);

        // Exibindo números de forma crescente
        System.out.println("Números de forma crescente:");
        exibeCrescente(1);

        // Chamando a função sem retorno
        hello();
    }

    public static int calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }

    public static void exibeDecrescente(int numero) {
        if (numero > 0) {
            System.out.println(numero);
            exibeDecrescente(numero - 1);
        }
    }

    public static void exibeCrescente(int numero) {
        if (numero <= 5) {
            System.out.println(numero);
            exibeCrescente(numero + 1);
        }
    }

    public static void hello() {
        System.out.println("Função sem retorno");
    }
}
