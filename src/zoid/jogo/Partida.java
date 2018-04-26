/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.jogo;

import java.util.ArrayList;
import zoid.avatar.Avatar;
import zoid.encontro.Encontro;
import zoid.grupo.GrupoJogo;
import zoid.missao.Missao;

/**
 *
 * @author andre
 */
public class Partida {
    private int numeroPartida = 0;
    private GrupoJogo grupoJogadores = null;
    private GrupoJogo grupoNPCs = null;
    private Missao missaoPartida = null;
    private int pontosExperienciaTotal;
    
    private ArrayList<Encontro> listaEncontros;

    public Partida(int nr,GrupoJogo grupoJogadores, GrupoJogo grupoNPCs, Missao missaoPartida) {
        this.numeroPartida = nr;
        this.grupoJogadores = grupoJogadores;
        this.grupoNPCs = grupoNPCs;
        this.missaoPartida = missaoPartida;
    }
    
    public boolean criarEncontro(Avatar a1,Avatar a2){
        return false;
    }
    
    public void iniciarPartida(){
        
    }
    
    
}
