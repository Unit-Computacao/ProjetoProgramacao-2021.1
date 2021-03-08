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
public class Funcionario extends Pessoa{
    private int matricula;
    private double salario;
    private String cargo;
    private String setor;

    public void cadastrarFuncionario(){
        super.cadastrar();
        this.matricula = Integer.parseInt(JOptionPane.showInputDialog("Entre com a matricula"));
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com o salario"));
        this.cargo = JOptionPane.showInputDialog("Entre com o cargo");
        this.setor = JOptionPane.showInputDialog("Entre com o setor");
    }
    
    
}
