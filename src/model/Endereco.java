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
public class Endereco {

    private String cidade;
    private String numero;
    private String uf;
    private String endereco;
    private String bairro;
    public void cadastrarEndereco(){ 
        this.endereco = JOptionPane.showInputDialog("Entre com o endereço");
        this.numero = JOptionPane.showInputDialog("Entre com o numero");
        this.bairro = JOptionPane.showInputDialog("Entre com o bairro");
        this.cidade = JOptionPane.showInputDialog("Entre com a cidade");
        this.uf = JOptionPane.showInputDialog("Entre com o estado");
    }
    public void exibirEndereco(){
        JOptionPane.showMessageDialog(null, 
                "Endereco" + this.endereco +
                "\nNúmero: " + this.numero +
                "\nBairro: " + this.bairro +
                "\nCidade: " + this.cidade +
                "\nEstado: " + this.uf                
                );
    }
}
