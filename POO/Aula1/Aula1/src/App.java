import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ContaCorrente c1,c2;
        c1 = new ContaCorrente();
        c2 = new ContaCorrente();

        c1.setTitular("Gabriel Bigarato");
        c1.setSaldo(500000000);
        c1.setAgencia("8710");
        c1.setConta("10101010");
 
        System.out.println(c1.getTitular());
        System.out.println(c1.getAgencia());
        System.out.println(c1.getConta());

    }
}
