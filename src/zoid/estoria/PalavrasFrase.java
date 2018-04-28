/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.estoria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class PalavrasFrase {
    private ArrayList<String> listaPalavras;
    private int indicePalavraEscolhida;

    public PalavrasFrase(int indicePalavraEscolhida) {
        this.indicePalavraEscolhida = indicePalavraEscolhida;
    }    
    public String sortearPalavra(){
        return "";
    }
    public void inserirPalavra(String palavra){
        listaPalavras.add(palavra);
    }    
    
            
    public void salvarPalavras(FileWriter fw){        
    };  
    public boolean carregarPalavras(BufferedReader br){
        
        return false;
    };
    
    
    
}
