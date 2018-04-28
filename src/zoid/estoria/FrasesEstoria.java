/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.estoria;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;

/**
 *
 * @author andre
 */
public class FrasesEstoria {
    private String fraseBase;
    private HashMap<String,PalavrasFrase> listaPalavras;

    public FrasesEstoria(String fraseBase) {
        this.fraseBase = fraseBase;
    }
    
    public String retornarFrase(){
        return "";
    }
    public String retornarFraseAleatória(){
        return "";
    }
    
    public void inserirPalavraFrase(String id,PalavrasFrase p){
        listaPalavras.put(id, p);
    }
    
    public void salvarFrase(FileWriter fw){
        
    };  
    public boolean carregarFrase(BufferedReader br){
        
        return false;
    };
    
}
