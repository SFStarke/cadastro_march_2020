package dto;

/**
 *
 * @author Sérgio Felipe Starke
 */
public class Subject {

    private int id;
    private String cpf,nome,sobrenome,email,fone,logradouro;

    
    public Subject(){
        
    }
    
    public Subject(int id,String cpf, String nome, String sobrenome,
            String email, String fone, String logradouro){
        this.setId(id);
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.setFone(fone);
        this.setLogradouro(logradouro);
    }
    
    @Override
    public String toString(){//Método não implementado. Apenas para conferência.
        return "ID["+this.getId()+"] CPF: "+this.cpf+". Nome: "+this.nome+". "
                + "Sobrenome: "+this.sobrenome+". E_mail: "+this.getEmail()+". "
                + "Fone: "+this.getFone()+".\nLogradouro:"+this.getLogradouro()+
                ".\n###########################################################";
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
}
