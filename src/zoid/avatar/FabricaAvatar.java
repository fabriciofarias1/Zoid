/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.avatar;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author andre
 */
public abstract class FabricaAvatar {
    protected HashMap<String,Avatar> avataresDisponiveis;
    protected HashMap<String,Avatar> avataresArmazenados;
    protected String nomeArq;

    public FabricaAvatar(String nomeArq) {
        this.nomeArq = nomeArq;        
    }
    
    public void insereAvatarDisponivel(String nome, Avatar avatar){
        avataresDisponiveis.put(nome, avatar);
        salvaFabrica();
    }
    public void armazenaAvatar(String nome, Avatar avatar){
        avataresArmazenados.put(nome, avatar);
        salvaFabrica();
    }
    
    public Avatar obtemAvatarDisponivel(String nome){
        return avataresDisponiveis.get(nome);
    }    
    public Avatar obtemAvatarArmazenado(String nome){
        return avataresDisponiveis.get(nome);
    }   
    
    public abstract void salvaFabrica();
    public abstract void carregaFabrica();
    
}
