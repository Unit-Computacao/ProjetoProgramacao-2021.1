/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import model.Pessoa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.FolhaPagamento;

/**
 *
 * @author fabio
 */
public class Principal {
    public static void main(String[] args) {
        //Produto alimento = new Produto();
        //alimento.cadastrarProduto();
        //alimento.exibirProduto();
        //System.out.println(alimento.nome);
        /*
        Pessoa p = new Pessoa();
        p.cadastrar();
        p.exibir();
        Funcionario f = new Funcionario();
        f.cadastrarFuncionario();
        f.exibir();
        Cliente joselito = new Cliente();
        joselito.cadastrarCliente();
        joselito.exibir();
        
        List<Integer> teste = new ArrayList<Integer>();
        for(int i=0; i<50; i=i+2){
            teste.add(i);
        }
        System.out.println(teste.size());
        for(Integer i: teste){
            System.out.println(i);
        }
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        int i=0;
        while(i==0){
            Pessoa p = new Pessoa();
            p.cadastrar();
            pessoas.add(p);
            i = Integer.parseInt(JOptionPane.showInputDialog("Entre com 0 para continuar ou 1 para sair"));
        }
        for(Pessoa p: pessoas){
            p.exibir();
        }
        System.out.println(pessoas.size());
        */
        FolhaPagamento fp = new FolhaPagamento();
        fp.setSalarioBruto(5630.00);
        System.out.println(fp.getInss());
        System.out.println(fp.getIrrf());
        System.out.println(fp.getSalarioLiquido());
    }
    
}
