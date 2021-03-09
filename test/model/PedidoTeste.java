/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabio
 */
public class PedidoTeste {
    
    private Pedido p;
    public PedidoTeste() {
        p = new Pedido();
    }
    
    
    @Test
    public void valorProdutoTest() {
        Produto arroz = new Produto();
        arroz.inserirNovoProduto(1, "Arroz", 4.22);
        p.inserirProdutoPedido(arroz, 2);
        float total = arroz.getValorProduto() * 2;
        assertEquals(total, p.totalProduto(1), 2);
    }
    @Test
    public void valorPedidoTest() {
        Produto arroz = new Produto();
        arroz.inserirNovoProduto(1, "Arroz", 4.22);
        p.inserirProdutoPedido(arroz, 2);
        float total = arroz.getValorProduto() * 2;
        assertEquals(total, p.totalPedido(), 2);
    }
    
    
}
