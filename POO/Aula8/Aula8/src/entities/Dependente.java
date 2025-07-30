package entities;

public class Dependente {
    private Titular titular;

    private String convenio;

    public Dependente(Titular titular) {
        if (titular instanceof Titular){
            this.titular = titular;
        } else{
            throw new IllegalArgumentException("O titular nao é o titular");
        }
    }

    public Dependente(Titular titular, String convenio) {
        this.titular = titular;
        this.convenio = convenio;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    
}
