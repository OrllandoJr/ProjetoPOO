package User;

/**
 *
 * @author Orllando Jr
 */
public class Usuario {

    static String Contains(String cpfLogin) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    private String senha;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    private String endereco;

    public Usuario() {
    
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getSenha(){
        return senha;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return endereco;
    }

}
