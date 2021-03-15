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
    private FolhaPagamento fp;

    public Funcionario() {
        fp = new FolhaPagamento();
    }
    public String CalcularFolhaPagamento(){
        String folhaPg;
        fp.setSalarioBruto(this.salario);
        folhaPg = "Folha de pagamento" +
                "\nNome: " + super.getNome() +
                "\n----------------------------" +
                "\nSalário Bruto: R$ " + this.salario +
                "\n----------------------------" +
                "\nDescontos" +
                "\n----------------------------" +
                "\nINSS: R$ " + fp.getInss() +
                "\nIRRF: R$ " + fp.getIrrf() +
                "\n------------------------------" +
                "\nSalário Líquido: R$ " + fp.getSalarioLiquido();
        return folhaPg;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
    
    //Lixo
    
    public void cadastrarFuncionario(){
        super.cadastrar();
        this.matricula = Integer.parseInt(JOptionPane.showInputDialog("Entre com a matricula"));
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Entre com o salario"));
        this.cargo = JOptionPane.showInputDialog("Entre com o cargo");
        this.setor = JOptionPane.showInputDialog("Entre com o setor");
    }
    
    
}
