/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.missao;

import java.util.HashMap;

/**
 *
 * @author andre
 */
public abstract class LivroMissoes {
    protected String nomeLivro;
    protected String donoLivro;
    
    protected HashMap<String,Missao> listaMissoes;

    public LivroMissoes(String nomeLivro, String donoLivro) {
        this.nomeLivro = nomeLivro;
        this.donoLivro = donoLivro;
    }

    public void inserirMissao(Missao m){
        listaMissoes.put(m.getNomeMissao(),m);
    }
    public Missao obterMissao(String nome){
        return listaMissoes.get(nome);
    }
    
    public abstract void salvaLivro();
    public abstract void carregaLivro();
    
    
}
