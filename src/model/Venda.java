/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author fabio
 */
public class Venda {
    private int codVenda;
    private List<Produto> produtos = null;
    private List<Integer> quantidade = null;
    private double valorTotal;

    public Venda() {
        produtos = new ArrayList();
        quantidade = new ArrayList ();        
    }
    
    public void inserir(Produto p, int quantidade){
        this.produtos.add(p);
        this.quantidade.add(quantidade);
    }
            
    public void calcularValorTotal(){
        Iterator i1 = produtos.iterator();
        Iterator i2 =  quantidade.iterator();
        while(i1.hasNext() && i2.hasNext()){
            int quantia = (int) i2.next();
            Produto p = (Produto) i1.next();
            this.valorTotal = this.valorTotal + (quantia * p.getValorVenda());
            
    }
        
               
    }

    public double getValorTotal() {
        return valorTotal;
    }
    
}
