/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.localizacao;

import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author andre
 */
public abstract class LivroMapas {
    protected String nomeLivro;
    protected String donoLivro;
    
    protected HashMap<String,MapaJogo> listaMapas;

    public LivroMapas(String nomeLivro, String donoLivro) {
        this.nomeLivro = nomeLivro;
        this.donoLivro = donoLivro;
    }
    
    
    
    
   public abstract void salvaLivro();
    public abstract void carregaLivro();
    
}
