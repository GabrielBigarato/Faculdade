
package aula4;


public class Peixe extends Animal{
    
    public Peixe(String sexo, String raca, String porte) {
        super(sexo, raca, porte);
    }
    
    @Override
    public void locomover(){
        System.out.println("Ele nada");
    }
    @Override
    public void comunicar(){
        System.out.println("Atraves do movimento da agua");
    }
    
}
