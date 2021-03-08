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
public class Produto {
    private int codigo;
    private String nome;
    private double custo;
    private String familia;
    private Fornecedor fornecedor = new Fornecedor();;
    private String unidade;
    private String marca;
    private String categoria;
    public void cadastrarProduto(){
        this.nome = JOptionPane.showInputDialog("Entre com o nome do produto");
        this.custo = Double.parseDouble(JOptionPane.showInputDialog("Entre com o curso do produto em R$"));
        this.familia = JOptionPane.showInputDialog("Entre com a família do produto");
        //this.fornecedor = JOptionPane.showInputDialog("Entre com o fornecedor do produto");
        this.unidade = JOptionPane.showInputDialog("Entre com a unidade do produto");
        this.marca = JOptionPane.showInputDialog("Entre com a marca do produto");
        this.categoria = JOptionPane.showInputDialog("Entre com a categoria do produto");
        fornecedor.cadastrarFornecedor("Atacadao", "Rua sei la", "79 99229922", "Joselito");
    }
    public void exibirProduto(){
        JOptionPane.showMessageDialog(null, "Nome:" + this.nome +
                "\nCusto: " + this.custo +
                "\nFamilia: " + this.familia +
                "\nUnidade: " + this.unidade +
                "\nMarca: " + this.marca +
                "\nCategoria: " +this.categoria);
       fornecedor.exibirFornecedor();
    }
    
}
