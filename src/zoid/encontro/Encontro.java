/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.encontro;

import zoid.avatar.Avatar;

/**
 *
 * @author andre
 */
public abstract class Encontro {
    protected Avatar primeiro;
    protected Avatar segundo;

    public Encontro(Avatar primeiro, Avatar segundo) {
        this.primeiro = primeiro;
        this.segundo = segundo;
    }
    
    public abstract boolean interagir();
    
    
}
