/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author fabio
 */
public class FolhaPagamento {
    private double salarioBruto, inss, irrf, salarioLiquido;

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getInss() {
        if(this.salarioBruto <= 1556.94){
            this.inss = this.salarioBruto/100*8;
        } else if(this.salarioBruto > 1556.94 && this.salarioBruto <= 2594.92){
            this.inss = this.salarioBruto/100*9;
        } else if(this.salarioBruto > 2594.92 && this.salarioBruto <= 5189.82){
            this.inss = this.salarioBruto/100*10;
        } else if(this.salarioBruto > 5289.82){
            this.inss = 5289.82/100*11;
        } 
        return inss;
    }

    public double getIrrf() {
        double salarioDescInss = this.salarioBruto - getInss();
        if(salarioDescInss <= 1903.99){
            this.irrf = 0;
        }else if(salarioDescInss > 1903.99 && salarioDescInss <= 2826.65){
            this.irrf = salarioDescInss/100*7.5;
        }else if(salarioDescInss > 2826.65 && salarioDescInss <= 3751.05){
            this.irrf = salarioDescInss/100*15;
        }else if(salarioDescInss > 3751.05 && salarioDescInss <= 4664.68){
            this.irrf = salarioDescInss/100*22.5;
        }else if(salarioDescInss > 4664.68){
            this.irrf = salarioDescInss/100*27.5;
        }
        return irrf;
    }

    public double getSalarioLiquido() {
        this.salarioLiquido = this.salarioBruto - (getIrrf() + getInss());
        return salarioLiquido;
    }
    
    
    
}
