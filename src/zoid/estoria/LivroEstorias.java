/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.estoria;

import java.util.HashMap;

/**
 *
 * @author andre
 */
public abstract class LivroEstorias {
    
    private HashMap<String,EstoriaJogo> listaEstorias;
    protected String nomeArq;

    public LivroEstorias() {
    }
    
    
    
    public abstract void salvaLivro();
    public abstract void carregaLivro();
    
}
