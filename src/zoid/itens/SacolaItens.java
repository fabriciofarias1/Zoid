/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.itens;

import com.sun.swing.internal.plaf.metal.resources.metal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

/**
 *
 * @author andre
 */
public abstract class SacolaItens {
    private String nomeDono;
    protected HashMap<String,ItemJogo> itensSacola;    

    public SacolaItens(String nomeDono) {
        this.nomeDono = nomeDono;
    }
    
    public void adicionaItemSacola(String nomeMeuItem,ItemJogo item){
        itensSacola.put(nomeMeuItem, item);                
    }
    public ItemJogo pegarItem(String nomeMeuItem){
        return itensSacola.get(nomeMeuItem);
    }
    
    public boolean usarItem(String nomeMeuItem){
        return itensSacola.get(nomeMeuItem).usarItem();
    }
    
    public abstract void salvaSacola(FileWriter fw);
    public abstract void carregaSacola(BufferedReader br);
    
    
    
    
}
