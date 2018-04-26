/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.jogo;

import java.util.ArrayList;
import zoid.estoria.LivroEstorias;
import zoid.missao.LivroMissoes;

/**
 *
 * @author andre
 */
public abstract class Jogo {
    protected String tituloJogo;
    protected LivroMissoes livroMissoes;
    protected LivroEstorias livroEstorias;
    
    
    protected ArrayList<Partida> listaPartidas;

    public Jogo(String tituloJogo) {
        this.tituloJogo = tituloJogo;
    }
    
    public abstract void salvarJogo();
    
    
    
    
    
    
    
}
