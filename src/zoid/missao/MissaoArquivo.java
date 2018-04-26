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
public class MissaoArquivo extends Missao{
    private String nomeArquivo;

    
    public MissaoArquivo(String nomeArquivo, String nomeMissao, int pontosExperiencia, EstoriaJogo estoriaMissao, MapaJogo mapaMissao, SacolaItens premioMissao) {
        super(nomeMissao, pontosExperiencia, estoriaMissao, mapaMissao, premioMissao);
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void salvaMissao(FileWriter fw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void carregaMissao(BufferedReader br) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
