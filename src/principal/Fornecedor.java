/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author fabio
 */
public class Fornecedor {
    private String nome, telefone, contato;
    private Endereco end = new Endereco();
    public void cadastrarFornecedor(String nome, String endereco,
            String telefone, String contato){
        this.nome = nome;
        this.telefone = telefone;
        this.contato = contato;
        end.cadastrarEndereco();
    }
    public void exibirFornecedor(){
        JOptionPane.showMessageDialog(null, "Nome Fornecedor:" + this.nome +
                "\nTelefone Fornecedor: " + this.telefone +
                "\nContato Fornecedor: " + this.contato);
        end.exibirEndereco();
    }
    
}
