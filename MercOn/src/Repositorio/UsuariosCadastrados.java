package Repositorio;

import User.Usuario;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Orllando Jr
 */
public class UsuariosCadastrados implements RepositorioUsuario {

    ArrayList<Usuario> usuarios = new ArrayList<>();
    Usuario usuario = new Usuario();

    @Override
    public boolean cadastrarUsuario(Usuario usuario) {
        try {
            usuarios.add(usuario);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    //inserção de cpf para login
    public boolean logar(String cpf) {
        for (int i = 0; i < usuarios.size(); i++) {
            usuarios.get(i).getCpf().equals(usuario.getCpf());
            //requisição de senha
        }
        String senha = JOptionPane.showInputDialog(null, "SENHA:");
        for (int j = 0; j < usuarios.size(); j++) {
            //VERIFICANDO SENHA
            boolean pass = usuarios.get(j).getSenha().equals(usuario.getSenha());
            if (pass == true) {
                JOptionPane.showMessageDialog(null, "Cliente Logado com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Senha Incorreta!");
            }
        }
        return false;
    }

    public ArrayList<Usuario> usuarios() {
        return usuarios;
    }

}
