/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.missao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import zoid.estoria.EstoriaJogo;
import zoid.itens.SacolaItens;
import zoid.localizacao.MapaJogo;

/**
 *
 * @author andre
 */
public abstract class Missao {
    private String nomeMissao;
    private int pontosExperiencia;
    
    private EstoriaJogo estoriaMissao;    
    private MapaJogo mapaMissao;
    private SacolaItens premioMissao;

    public Missao(String nomeMissao, int pontosExperiencia, EstoriaJogo estoriaMissao, 
                  MapaJogo mapaMissao, SacolaItens premioMissao) {
        this.nomeMissao = nomeMissao;
        this.pontosExperiencia = pontosExperiencia;
        this.estoriaMissao = estoriaMissao;
        this.mapaMissao = mapaMissao;
        this.premioMissao = premioMissao;
    }

    public String getNomeMissao() {
        return nomeMissao;
    }

    public abstract void salvaMissao(FileWriter fw);
    public abstract void carregaMissao(BufferedReader br);
    
}
