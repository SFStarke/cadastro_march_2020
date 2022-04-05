package dto;

/**
 *
 * @author Sérgio Felipe Starke
 */
public class Subject {

    private long cpf;
    private String nome, sobrenome;

    
    public Subject(){
        
    }
    
    public Subject(long cpf, String nome, String sobrenome){
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    
    @Override
    public String toString(){//Método não implementado. Apenas para conferência.
return "CPF: "+this.cpf+". Nome: "+this.nome+". Sobrenome: "+this.sobrenome+".";
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }
}
