/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.itens;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

/**
 *
 * @author andre
 */
public class SacolaItensArquivo extends SacolaItens{    
    private String nomeArquivo;

    public SacolaItensArquivo(String nomeArquivo, String nomeDono) {
        super(nomeDono);
        this.nomeArquivo = nomeArquivo;
    }
    
    @Override
    public void salvaSacola(FileWriter fw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void carregaSacola(BufferedReader br) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
