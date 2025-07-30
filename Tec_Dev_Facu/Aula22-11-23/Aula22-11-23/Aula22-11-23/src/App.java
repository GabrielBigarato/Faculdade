import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scann = new Scanner(System.in);

        int numero_inteiro;
        float numero_decimal;
        String texto;

        System.out.println("Digite um numero:");

        numero_inteiro = scann.nextInt();

        System.out.println(numero_inteiro);

        Integer v[] = new Integer[10];

        /*
        a == b (compara se a é giual a b)
        a != b (compara se a é diferente de b)
        a > b (compara se a é maior que b)
        a < b (compara se a é menor que b)
        a >= b (compara se a é maior ou igual b)
        a <= b (compara se a é menor ou igual b)

        */

        if (numero_inteiro != 10) {
            System.out.println("Entrou no IF");

        } else {
            System.out.println("Não entrou no IF");
        }

        /* Operadores lógicos 

        E => &&
        OU => || 
        NOT => !

        */
if((numero_inteiro >= 16 && numero_inteiro < 18) || numero_inteiro >= 65){
    System.out.println("Esta idade corresponde à um aluno votante opcional");
}


    }
}
