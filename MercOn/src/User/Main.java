package User;

import Repositorio.UsuariosCadastrados;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Orllando Jr
 */
public class Main {

    public static void main(String[] args) {
        boolean cadastrado;
        int opcao;

        Usuario usuario = new Usuario();
        UsuariosCadastrados cadastroUsuario = new UsuariosCadastrados();

        do {

            opcao = Integer.parseInt(JOptionPane.showInputDialog(null, "----------MENU---------\n      [1] LOGIN\n      [2] CADASTRAR\n      [3] ALTERAR\n      [4] DELETAR\n      [5] LISTAR\n      [9] SAIR", "MENU", JOptionPane.PLAIN_MESSAGE));

            switch (opcao) {
                case 1:
                    //LOGIN
                    UsuariosCadastrados cpf = new UsuariosCadastrados();

                    cpf.logar(JOptionPane.showInputDialog(null, "CPF", "LOGIN", JOptionPane.PLAIN_MESSAGE));

                    break;
                case 2:
                    //CADASTRO
                    usuario.setNome(JOptionPane.showInputDialog(null, "NOME COMPLETO:", "CADASTRO", JOptionPane.PLAIN_MESSAGE));
                    usuario.setCpf(JOptionPane.showInputDialog(null, "CPF:", "CADASTRO", JOptionPane.PLAIN_MESSAGE));
                    usuario.setEmail(JOptionPane.showInputDialog(null, "E-MAIL:", "CADASTRO", JOptionPane.PLAIN_MESSAGE));
                    usuario.setTelefone(JOptionPane.showInputDialog(null, "TELEFONE:", "CADASTRO", JOptionPane.PLAIN_MESSAGE));
                    usuario.setEndereco(JOptionPane.showInputDialog(null, "ENDEREÇO/CIDADE:", "CADASTRO", JOptionPane.PLAIN_MESSAGE));
                    usuario.setSenha(JOptionPane.showInputDialog(null, "SENHA:", "CADASTRO", JOptionPane.PLAIN_MESSAGE));

                    cadastrado = cadastroUsuario.cadastrarUsuario(usuario);

                    if (cadastrado == true) {
                        JOptionPane.showMessageDialog(null, usuario.getNome() + " "
                                + "cadastrado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "ERRO: Usuario não cadastrado!\nTente novamente.");
                    }

                    break;

                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    //LISTA DE CADASTRO
                    JOptionPane.showMessageDialog(null,"NOME: " +usuario.getNome() + "\nCPF: " 
                            + usuario.getCpf()+"\nE-MAIL: "
                            + usuario.getEmail()+"\nTELEFONE: "
                            + usuario.getTelefone()+"\nENDEREÇO: "
                            + usuario.getEndereco()+"\nSENHA: "
                            + usuario.getSenha()                            
                            );
                    break;
                case 9:
                    break;
            }

        } while (opcao
                != 9);

    }

}
