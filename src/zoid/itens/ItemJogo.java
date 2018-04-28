/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.itens;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author andre
 */
public abstract class ItemJogo {
    protected String nomeItem;
    protected int   precoMoedas;
    protected int   numMaxUsos = -1; // Quer dizer numero ilimitado

    public ItemJogo(String nomeItem, int precoMoedas) {
        this.nomeItem = nomeItem;
        this.precoMoedas = precoMoedas;
    }
    
    
    public abstract boolean usarItem();
    
    public abstract void salvaItem(FileWriter fw);
    public abstract void carregaItem(BufferedReader br);
    
    
}
