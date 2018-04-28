/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.itens;

import java.util.HashMap;

/**
 *
 * @author andre
 */
public abstract class FabricaItens {
    
    protected HashMap<String,ItemJogo> itensDisponiveis;    
    protected String nomeArq;

    public FabricaItens(String nomeArq) {
        this.nomeArq = nomeArq;        
    }
    
    public void insereItemDisponivel(String nome, ItemJogo item){
        itensDisponiveis.put(nome, item);
        salvaFabrica();
    }
    
    public ItemJogo obtemItemDisponivel(String nome){
        return itensDisponiveis.get(nome);
    }    
    
    public abstract void salvaFabrica();
    public abstract void carregaFabrica();    
    
}
