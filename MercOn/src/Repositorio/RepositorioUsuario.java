package Repositorio;

import User.Usuario;

/**
 *
 * @author Orllando Jr
 */
public interface RepositorioUsuario {
    
    public boolean cadastrarUsuario(Usuario usuario);
    public boolean logar (String cpf);
    
}
