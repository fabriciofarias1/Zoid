/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid;

import java.util.HashMap;
import zoid.avatar.FabricaAvatar;
import zoid.estoria.LivroEstorias;
import zoid.itens.FabricaItens;
import zoid.jogo.Jogo;
import zoid.localizacao.LivroMapas;
import zoid.missao.LivroMissoes;

/**
 *
 * @author andre
 */
public abstract class GerenteZoid {
    protected HashMap<String,Jogo> listaJogos;
    protected FabricaAvatar avataresJogadores;
    protected FabricaAvatar avataresNaoJogadores;
    protected FabricaItens  itensDisponiveis;
    protected LivroEstorias estoriasDisponivel;
    protected LivroMissoes missoesDisponivel;
    protected LivroMapas   mapasDisponiveis;
    public abstract void iniciarZoid();
    
}
