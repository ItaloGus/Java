/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;

/**
 *
 * @author Italo
 */
public class MesesDeVenda {
    
    private String nomeProduto;
    private int NumeroVenda;
    
    
    public MesesDeVenda(String nomeProduto, int NumeroVenda){
        this.nomeProduto = nomeProduto;
        this.NumeroVenda = NumeroVenda;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getNumeroVenda() {
        return NumeroVenda;
    }
    
}
