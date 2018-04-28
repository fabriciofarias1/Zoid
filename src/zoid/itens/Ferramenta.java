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
public abstract class Ferramenta extends ItemJogo{

    public Ferramenta(String nomeItem, int precoMoedas) {
        super(nomeItem, precoMoedas);
    }

    @Override
    public boolean usarItem() {
        return false;
    }




    

    
    
}
