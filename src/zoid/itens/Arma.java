/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.itens;

/**
 *
 * @author andre
 */
public abstract class Arma extends ItemJogo{

    public Arma(String nomeItem, int precoMoedas) {
        super(nomeItem, precoMoedas);
    }

    @Override
    public boolean usarItem() {
        return false;
    }
    
    
    
    
}
