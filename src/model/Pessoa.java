/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import javax.swing.JOptionPane;

/**
 *
 * @author fabio
 */
public class Pessoa {
    private String nome, CPF, RG, telefone;
    private Endereco end;

    public Pessoa() {
        end = new Endereco();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }
    
    
    //Lixo
    
    
    public void cadastrar(){
        this.nome = JOptionPane.showInputDialog("Entre com o nome");
        this.CPF = JOptionPane.showInputDialog("Entre com o CPF");
        this.RG = JOptionPane.showInputDialog("Entre com o RG");
        this.telefone = JOptionPane.showInputDialog("Entre com o telefone");
        end.cadastrarEndereco();
    }
    public void exibir(){
        JOptionPane.showMessageDialog(null, "Nome: " + this.nome +
                "\nCPF: " + this.CPF +
                "\nRG: " + this.RG +
                "\nTelefone: " + this.telefone
                );
        end.exibirEndereco();
    }
    
}
