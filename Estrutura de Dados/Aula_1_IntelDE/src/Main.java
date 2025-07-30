import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scann;
        scann = new Scanner (System. in);
        System.out.println("Digite a idade:");
        int idade = scann.nextInt();

        float salario;
        String nome;

        if (idade > 18){
            System.out.println("è maior que 18");
        } else {
            System.out.println(("é menor que 18 ou igual"));
        }
        for (int i = 0; i < 10; i++){
            System.out.println((i));
        }

    }
}

//while (condicao){}
//do {
// while ();
//(*) multiplicacao
//(