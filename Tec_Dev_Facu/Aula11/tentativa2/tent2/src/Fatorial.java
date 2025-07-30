//public class Fatorial {
//    public static void main(String [] args) {   
//        int numero = 5;
//        funcao(numero);
//
//    }
//
//    public static int funcao(int numero) {
//        if(numero == 1) {
//            return numero;
//
//        } else {
//            System.out.println(numero);
//            return funcao(numero - 1);
//        }
//   }
//
//}

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        scanner.close();

        int resultado = funcao(numero);
        System.out.println("Fatorial de " + numero + " é: " + resultado);
    }

    public static int funcao(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * funcao(numero - 1);
        }
    }
}





