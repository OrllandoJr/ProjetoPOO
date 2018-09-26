package User;

/**
 *
 * @author Orllando Jr
 */
public class Login extends Usuario{
       
    private String cpf, senha;

    public Login(String cpf, String senha) {
        this.cpf = cpf;
        this.senha = senha;
    }

        
    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

        
        
}
