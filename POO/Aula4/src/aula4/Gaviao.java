
package aula4;


public class Gaviao extends Animal{
    
    public Gaviao(String sexo, String raca, String porte) {
        super(sexo, raca, porte);
    }
    
    @Override
    public void locomover(){
        System.out.println("Ele voa");
    }
    
    @Override
    public void comunicar(){
        System.out.println("Ele pia");
                
        
    }
    
}
