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
public class Cliente extends Pessoa{
    private Double limite;
    private String codCliente;
    private String mesNascimento;
    private String primeiraCompra;
    public void cadastrarCliente(){
        super.cadastrar();
        this.limite = Double.parseDouble(JOptionPane.showInputDialog("Entre com o limite"));
        this.codCliente = JOptionPane.showInputDialog("Código do cliente");
        this.mesNascimento = JOptionPane.showInputDialog("Entre com o mês de nascimento");
        this.primeiraCompra = JOptionPane.showInputDialog("Entre com a data da primeira compra");
    }
    
}
