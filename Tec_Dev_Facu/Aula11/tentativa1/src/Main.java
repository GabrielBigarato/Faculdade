public class Main {
    public static void main(String[] args) {
        int resultado = calcularFatorial(5);
        System.out.println("O fatorial de 5 é " + resultado);
    }

    public static int calcularFatorial(int n) {
        if (n == 0) {
            return 1; // Caso base: o fatorial de 0 é 1
        } else {
            return n * calcularFatorial(n - 1); // Chamada recursiva
        }
    }
}
