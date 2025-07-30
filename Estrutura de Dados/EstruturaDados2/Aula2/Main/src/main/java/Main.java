import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args){
        float valor;
        ContaCorrente c1=new ContaCorrente();
        c1.cadastraDados();
        System.out.println("" +c1.imprimeDados());
            JOptionPane.showMessageDialog(null, c1.imprimeDados());
        valor = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor a sacar: "));
        c1.sacar(valor);
        
        System.out.println(""+c1.imprimeDados());
        
        
    }
}
