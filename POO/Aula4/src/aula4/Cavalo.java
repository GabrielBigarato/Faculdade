
package aula4;

public class Cavalo extends Animal {
    
    public Cavalo(String sexo, String raca, String porte) {
        super(sexo, raca, porte);
    }
       
    @Override
    public void locomover(){
        System.out.println("cavalga");
    }
    
    @Override
    public void comunicar(){
        System.out.println("relincha");
    }
    
}
