
package recursividade;
import java.util.Scanner;

public class Recursividade {
    
    //Metodo para calcular o fatorial
    public static int fatorial(int num){
        if (num <= 1){
        return 1;
        }else {
        return fatorial(num - 1) * num;
        }
    } 

    
    public static void main(String[] args) {
     //declare uma variavel para guardar o numero que o usuario digitar
     int numero;
     
     //instancia um objeto da classe scanner para realizar a leitura do teclado
     Scanner entrada = new Scanner(System.in);
     
     //Imprime na saida
     System.out.println("Digite o numero que voce pretende obter o fatorial: ");
    
     //Inserir na variavel numero o valor digitado pelo usuario e o metodo 
     //metodo nextInt converte o valor digitado para um numero inteiro
     numero = entrada.nextInt();
     
     //imprime o resultado do fatorial
        System.out.println("O fatorial de " + numero + " e " + fatorial(numero) + ".");
    
    
    }
    
}
