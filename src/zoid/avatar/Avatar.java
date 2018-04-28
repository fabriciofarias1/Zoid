/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.avatar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import zoid.itens.SacolaItens;
import zoid.localizacao.LocalAvatar;
import zoid.encontro.Encontro;
import zoid.missao.Missao;
import zoid.pets.AvatarPet;

/**
 *
 * @author andre
 */
public abstract class Avatar {
    protected String    nomeAvatar;
    protected String    nomeJogador = null;
    protected int       idadeAvatar;
    protected double    alturaAvatar;
    protected double    pesoAvatar;
    
    protected LocalAvatar posicaoAvatar;
    protected int   nivelAvatar  =  1;
    protected int   pontosExperiencia = 0;
    protected int   pontosVida   = 10;
    protected int   pontosForca  = 20;    
    protected int   pontosDefesa = 15;  
    protected int    pontosMagia  = 0;
    
    protected Missao missaoAtual;
    protected ArrayList<Missao> listaMissoes;
    
    protected SacolaItens sacolaItens;      
    protected ArrayList<Encontro> listaEncontros;
    
    protected String nomeArquivoImagem;

    protected AvatarPet animalEstimacao;
    
    public Avatar(String nomeAvatar, int idadeAvatar, double alturaAvatar, double pesoAvatar) {
        this.nomeAvatar = nomeAvatar;
        this.idadeAvatar = idadeAvatar;
        this.alturaAvatar = alturaAvatar;
        this.pesoAvatar = pesoAvatar;
    }
    
    public abstract void salvarAvatar(FileWriter fw);  
    public abstract boolean carregaAvatar(BufferedReader br);

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }
    
    
    
    
}
