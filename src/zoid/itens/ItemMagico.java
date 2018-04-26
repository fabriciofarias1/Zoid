/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.itens;

import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author andre
 */
public abstract class ItemMagico extends ItemJogo{

    public ItemMagico(String nomeItem, int precoMoedas) {
        super(nomeItem, precoMoedas);
    }

    @Override
    public boolean usarItem() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




    
    
    
    
}
